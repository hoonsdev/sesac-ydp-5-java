package _05_class._abstract;

public class Baek extends Student {
  public Baek(String name, String school, int age, int student_id) {
    super(name, school, age, student_id);
  }

  void getInfo() {
    System.out.printf("=== %s 학생의 정보 ===", this.name);
    System.out.println();
    System.out.println("학교: " + this.school);
    System.out.println("나이: " + this.age);
    System.out.println("학번: " + this.student_id);
    todo();
    System.out.println();
  }

  void todo() {
    System.out.println("점심은 백종원 피자");
  }
}
