package _08_collection_list;


import java.util.*;

public class CollectionPr {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
//    Set<Integer> set = new HashSet<>();
//    System.out.println("정수를 입력하세요. -1을 입력하면 종료됩니다.");
//    while (true) {
//      System.out.print("정수 입력: ");
//      int i = sc.nextInt();
//      if (i == -1) {
//        System.out.println("중복 제거된 정수 목록: " + set);
//        break;
//      }
//      set.add(i);
//    }
    Map<String, Integer> map = new HashMap<>();

    System.out.println("이름과 나이를 입력하세요. '종료'를 입력하면 종료됩니다.");
    while (true) {
      System.out.print("이름 입력: ");
      String name = sc.next();
      if (name.equals("종료")) {
        System.out.println("\n== 입력 받은 이름과 나이 목록 ==");
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
          Map.Entry<String, Integer> entry = iterator.next();
          String k = entry.getKey();
          Integer v = entry.getValue();
          System.out.printf("이름: %s, 나이: %d %n", k, v);
        }
        break;
      }
      System.out.print("나이 입력: ");
      int age = sc.nextInt();
      map.put(name, age);
    }
  }
}
