package _05_class;

public class StudentEx {
  public static void main(String[] args) {
//    //std1 변수가 Student 객체 참조
//    Student std1 = new Student("김새싹", 1);
//    System.out.println(std1);
//    std1.goToSchool();
//    std1.study("JAVA programming");
//    System.out.println(std1.getGrade() + "학년");

    Student std1 = new Student("김새싹", 1, 20231001);
    std1.displayInfo();
    Student std2 = new Student("박지은", 2, 20231002);
    std2.displayInfo();
    Student std3 = new Student("이은지", 3, 20231003);
    std3.displayInfo();
    System.out.printf("총 학생 수는 %d명 입니다.", Student.totalStudents);
  }
}
