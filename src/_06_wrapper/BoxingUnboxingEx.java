package _06_wrapper;

// Wrapper 객체
// - 기본 타입(primitive type) 값을 갖는 객체를 생성
// - 컬렉션 객체는 기본 타입 값을 저장할 수 없어서 Wrapper 객체를 사용

public class BoxingUnboxingEx {
  public static void main(String[] args) {
    // Boxing
    // - 기본 타입 -> 포장 객체
    // - 포장 클래스 변수에 값이 대입될 때 일어남
    Integer obj1 = 100; // boxing
    Double obj2 = 3.141592; // boxing
    System.out.printf("int value: %d %n", obj1.intValue()); // intValue(): Interger 객체 내부의 int 값 리턴
    System.out.printf("double value: %.2f %n", obj2.doubleValue()); // intValue(): Interger 객체 내부의 int 값 리턴
    System.out.println();

    // Unboxing
    // - 포장 객체 -> 기본 타입
    // - 기본 타입 변수에 포장 객체가 대입될 때 일어남
    int value1 = obj1; // unboxing
    double value2 = obj2; // unboxing
    System.out.printf("int value: %d %n", value1);
    System.out.printf("double value: %.2f %n", value2);
    System.out.println();

    // 연산 시 boxing
    int result = obj1 + 1; // obj1는 primitive type 인 1과 연산되기 전에 언박싱 됨(primitive type으로 변환되어 연산 진행됨!)
    System.out.printf("result: %d %n", result);
  }
}
