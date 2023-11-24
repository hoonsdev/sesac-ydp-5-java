package _05_class._static;

public class CalculatorEx {
  public static void main(String[] args) {
    int num1 = 10;
    int num2 = 6;
    double circleArea = num1 * num1 * Calculator.pi;

    int plusResult = Calculator.plus(num1, num2);
    int minusResult = Calculator.minus(num1, num2);
    System.out.printf("반지름이 %d 인 원의 넓이는 :: %f\n", num1, circleArea);
    System.out.printf("더하기 결과 :: %d \n", plusResult);
    System.out.printf("빼기 결과 :: %d \n", minusResult);
  }
}
