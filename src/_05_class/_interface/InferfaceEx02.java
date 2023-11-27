package _05_class._interface;

// 움직임에 대한 인터페이스
interface Move {
  void moveForward();

  void moveBackward();
}

// 전원에 대한 인터페이스
interface Power {
  void powerOn();

  void powerOff();
}

// 인터페이스는 인터페이스를 상속 받을 수 있음
// - 이 때, "extends" 키워드 사용
// - 인터페이스 다중 상속 가능
interface Car extends Move, Power {
  void changeGear(int gear);
}

class Suv implements Car {
  @Override
  public void moveForward() {
    System.out.println("전진!!");
  }

  @Override
  public void moveBackward() {
    System.out.println("후진!!");
  }

  @Override
  public void powerOn() {
    System.out.println("시동 ON!!");
  }

  @Override
  public void powerOff() {
    System.out.println("시동 OFF!!");
  }

  @Override
  public void changeGear(int gear) {
    System.out.printf("기어를 %d로 변경했습니다. %n", gear);
  }
}

public class InferfaceEx02 {
  public static void main(String[] args) {
    Suv suv = new Suv();

    suv.powerOn();
    suv.changeGear(5);
    suv.moveForward();
    suv.moveForward();
    suv.moveForward();
    suv.moveBackward();
    suv.powerOff();
  }
}
