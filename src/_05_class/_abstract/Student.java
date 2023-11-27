package _05_class._abstract;

public abstract class Student {
  String name;
  String school;
  int age;
  int student_id;

  public Student(String name, String school, int age, int student_id) {
    this.name = name;
    this.school = school;
    this.age = age;
    this.student_id = student_id;
  }

  abstract void todo();
}
