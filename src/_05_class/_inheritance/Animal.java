package _05_class._inheritance;

public class Animal {
  private String species;
  public String name;
  public int age;

  public String getSpecies() {
    return species;
  }

  public void setSpecies(String species) {
    this.species = species;
  }

  // 부모 클래스의 메소드
  void makeSound() {
    System.out.println("동물은 소리를 낸다");
  }
}
