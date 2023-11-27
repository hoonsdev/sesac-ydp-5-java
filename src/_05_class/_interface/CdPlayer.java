package _05_class._interface;

public class CdPlayer implements Music {
  String music_name;

  @Override
  public void setMusic(String music_name) {
    this.music_name = music_name;
  }

  @Override
  public void play() {
    System.out.printf("CD 플레이어에서 '%s' 음악을 재생합니다.\n", music_name);
  }

  @Override
  public void stop() {
    System.out.printf("CD 플레이어에서 '%s' 음악을 정지합니다.\n", music_name);
  }
}
