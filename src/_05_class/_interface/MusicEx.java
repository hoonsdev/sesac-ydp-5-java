package _05_class._interface;

public class MusicEx {
  public static void main(String[] args) {
    Music m;

    m = new Mp3Player();
    m.setMusic("아이유 블루밍");
    System.out.println("=== MP3 Player ===");
    m.play();
    m.stop();
    System.out.println();

    m = new CdPlayer();
    m.setMusic("아이유 꽃갈피");
    System.out.println("=== CD Player ===");
    m.play();
    m.stop();
  }
}
