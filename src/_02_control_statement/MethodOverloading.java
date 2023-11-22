package _02_control_statement;

public class MethodOverloading {
  public static void main(String[] args) {
    // 1. 객체 생성
    // static이 없으면 객체 생성 후 객체 내에서 메소드를 실행해야함!
    MethodOverloading ol = new MethodOverloading();

    // 2. 객체의 메소드 사용
    System.out.println(ol.add(1, 2));
    System.out.println(ol.add(10.0, 20.0));
    System.out.println(ol.add(1, 2, 3));
    System.out.println(ol.add(1.1, 2.2, 3.3));

    // 실습 실행
    System.out.println("반지름이 5인 원의 넓이: " + ol.circleArea(5));
    System.out.println("가로 4, 세로 7인 직사각형의 넓이: " + ol.squareArea(4, 7));
    System.out.println("밑변 6, 높이 3인 삼각형의 넓이: " + ol.triangleArea(6, 3));
  }

  public int add(int a, int b) {
    return a + b;
  }

  public double add(double a, double b) {
    return a + b;
  }

  public int add(int a, int b, int c) {
    return a + b + c;
  }

  public double add(double a, double b, double c) {
    return a + b + c;
  }

  // 실습. 메소드 오버로딩 실습
  public double circleArea(double r) {
    return Math.pow(r, 2) * Math.PI;
  }

  public double squareArea(double w, double h) {
    return w * h;
  }

  public double triangleArea(double w, double h) {
    return w * h / 2;
  }
}
