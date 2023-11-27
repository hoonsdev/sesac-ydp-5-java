package _07_generic;

class Pair<K, V> {
  private K key;
  private V value;

  public Pair(K key, V value) {
    this.key = key;
    this.value = value;
  }

  public K getKey() {
    return key;
  }

  public V getValue() {
    return value;
  }
}

class Calculator<T extends Number> {
  private T num1;
  private T num2;

  public Calculator(T num1, T num2) {
    super();
    this.num1 = num1;
    this.num2 = num2;
  }

  public double add() {
    return num1.doubleValue() + num2.doubleValue();
  }
}

public class GenericPr {
  public static void main(String[] args) {
//    Pair<String, Integer> pair1 = new Pair<String, Integer>("One", 1);
//    Pair<Integer, String> pair2 = new Pair<Integer, String>(2, "Two");
//
//    System.out.println("Key: " + pair1.getKey() + ", Value: " + pair1.getValue());
//    System.out.println("Key: " + pair2.getKey() + ", Value: " + pair2.getValue());
//
    Calculator<Integer> calculator1 = new Calculator<>(7, 8);
    Calculator<Double> calculator2 = new Calculator<>(3.5, 3.3);

    System.out.println("Integer Sum: " + calculator1.add());
    System.out.println("Double Sum: " + calculator2.add());
  }
}
