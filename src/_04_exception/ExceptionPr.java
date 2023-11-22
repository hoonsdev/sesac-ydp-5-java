package _04_exception;

import java.util.Scanner;

public class ExceptionPr {
  public static void main(String[] args) {
    // 실습1
    int[] arr1 = {1, 2, 3, 4};
    for (int i = 0; i < 6; i++) {
      try {
        System.out.println(arr1[i]);
      } catch (ArrayIndexOutOfBoundsException err) {
        System.out.println("인덱스가 범위를 벗어났습니다.");
      }
    }

    // 실습2
    Scanner sc = new Scanner(System.in);
    System.out.println("배열 크기를 입력해주세요 : ");
    int size = sc.nextInt();
    int sum = 0;
    try {
      for (int i = 0; i < size; i++) {
        sum += arr1[i];
      }
      try {
        System.out.println("배열 요소의 평균 : " + (sum / size));
      } catch (ArithmeticException err) {
        System.out.println("사이즈는 0보다 큰 수입니다. ::: " + err.getMessage());
      }
    } catch (ArrayIndexOutOfBoundsException err) {
      System.out.println("입력하신 배열 크기가 원본 배열보다 커서 배열의 요소에 접근 불가 ::: " + err.getMessage());
    }

  }
}
