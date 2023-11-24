package _05_class;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassPractice {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
//    System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");
//    int width = sc.nextInt();
//    int height = sc.nextInt();
//    Rectangle rectangle = new Rectangle(width, height);
//    System.out.println(rectangle.getArea());

//    CustomClass cpu = new CustomClass("apple", 2560000);
//    System.out.printf("cpu의 제조사 : %s, 가격 : %d\n", cpu.getCompany(), cpu.getPrice());
//    System.out.println("----------------");
//
//    cpu.setRam(32);
//    cpu.setPrice(-500);
//    System.out.printf("cpu의 ram 크기 : %d\n", cpu.getRam());
//    System.out.printf("cpu의 조정된 가격 : %d", cpu.getPrice());

//    Scanner sc = new Scanner(System.in);
//    boolean isEnd = true;
//    List<Rectangle> rectangles = new ArrayList<>();
//    while (isEnd) {
//      System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");
//      // 가로 세로 길이 입력받기
//      int width = sc.nextInt();
//      int height = sc.nextInt();
//      // 입력값이 0 0 일 때 출력
//      if (width == 0 && height == 0) {
//        for (Rectangle r : rectangles) {
//          System.out.println("가로 길이는: " + r.getWidth());
//          System.out.println("세로 길이는: " + r.getHeight());
//          System.out.println("넓이는: " + r.getArea());
//          System.out.println("----------------------------");
//        }
//        System.out.printf("Rectangle 인스턴스의 개수는: %d", rectangles.size());
//        isEnd = false;
//      }
//      // rectangle 객체 생성
//      Rectangle rectangle = new Rectangle(width);
//      // setter로 높이 설정
//      rectangle.setHeight(height);
//      // 0 0인 경우의 정보는 출력 x -> add 순서를 제일 뒤로
//      rectangles.add(rectangle);
//    }
    System.out.println("원의 반지름을 입력하세요: ");
    double r = sc.nextDouble();
    System.out.println("원의 반지름: " + r);
    Circle circle = new Circle(r);
    System.out.println("원의 넓이: " + circle.calculateArea());
  }
}
