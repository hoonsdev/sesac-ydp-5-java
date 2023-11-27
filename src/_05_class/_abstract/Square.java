package _05_class._abstract;

public class Square extends Shape {
  double width;
  double height;

  public Square(String color, String type, double width, double height) {
    super(color, type);
    this.width = width;
    this.height = height;
  }

  void draw() {
    System.out.println("사각형을 그리는 중입니다...");
  }

  double calculateArea() {
    return this.width * this.height;
  }
}
