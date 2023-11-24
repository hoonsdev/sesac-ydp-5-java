package _05_class._inheritance;

public class StudentEx {
  public static void main(String[] args) {
    Student std1 = new Student("김새싹", 20);

//    // Case1. 부모, 자식 클래스의 필드가 public 인 경우
//    // Person (부모) 로부터 상속받은 필드
//    System.out.println(std1.name);
//    System.out.println(std1.age);
//    // Student 필드
//    System.out.println(std1.campus);
//
//    // Person (부모) 로부터 상속받은 메소드
//    std1.say();
//    std1.eat("바나나");
//
//    // Student 메소드 호출
//    std1.setCampus("새싹 영등포");
//    System.out.println(std1.campus);

    // Case2. 부모, 자식 클래스의 필드가 private 인 경우
    // Person (부모) 로부터 상속받은 필드
    System.out.println(std1.getName());
    System.out.println(std1.getAge());
    // Student 필드
    System.out.println(std1.getCampus());

    // Person (부모) 로부터 상속받은 메소드
    std1.say();
    std1.eat("바나나");

    // Student 메소드 호출
    std1.setCampus("새싹 영등포");
    System.out.println(std1.getCampus());
  }
}
