package _05_class._inheritance;

public class Cat extends Animal {

  public Cat(String name, int age) {
    this.setSpecies("고양이");
    this.name = name;
    this.age = age;
  }


  @Override
  void makeSound() {
    System.out.println("야옹하며 울어요");
  }

  void fetch() {
    System.out.println("캣 타워 올라가는중");
  }
}
