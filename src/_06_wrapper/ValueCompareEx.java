package _06_wrapper;

// 포장 값 비교
// - 래퍼 클래스는 참조형이기 때문에 객체 내부 값 비교할 때, ==, != 연산자 사용 부적합
// - why? : 객체 내부 값이 아닌 포장 객체의 참조값을 비교함!
// - 따라서! .equals() 메소드로 내부 값을 비교하는 것이 바람직함.

public class ValueCompareEx {
  public static void main(String[] args) {
    // -128 ~ 127 이내의 값을 갖는 경우 -> == 과 equals 모두 사용 가능
    Integer obj1 = 10;
    Integer obj2 = 10;
    System.out.printf("%d == %d : %b %n", obj1, obj2, obj1 == obj2);
    System.out.printf("%d equals %d : %b %n", obj1, obj2, obj1.equals(obj2));
    System.out.println();

    // -128 ~ 127 범위 아닌 경우
    Integer obj3 = 1000;
    Integer obj4 = 1000;
    System.out.printf("%d == %d : %b %n", obj3, obj4, obj3 == obj4); // t
    System.out.printf("%d equals %d : %b %n", obj3, obj4, obj3.equals(obj4)); // t
    System.out.println();

    Boolean bool1 = true;
    Boolean bool2 = true;
    System.out.printf("%b == %b : %b %n", bool1, bool2, bool1 == bool2); // t
    System.out.printf("%b equals %b : %b %n", bool1, bool2, bool1.equals(bool2)); // t
    System.out.println();

    Character char1 = '\u0101'; // ā
    Character char2 = '\u0101';
    System.out.printf("%c == %c : %b %n", char1, char2, char1 == char2); // f
    System.out.printf("%c equals %c : %b %n", char1, char2, char1.equals(char2)); // t
  }
}
