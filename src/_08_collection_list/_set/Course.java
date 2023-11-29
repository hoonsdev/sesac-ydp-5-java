package _08_collection_list._set;

import java.util.Objects;

public class Course {
  private int id;
  private String title;

  public Course(int id, String title) {
    this.id = id;
    this.title = title;
  }

  // "id, title" 값이 같으면 동일한 hashCode 리턴
  // hashCode 란?
  // - hashCode: 객체의 메모리 주소를 기반으로 한 정수 값의 해시 코드
  // - hashCode() 메소드: Object 클래스에 정의되어 있고, 객체의 해시 코드를 반환하는 역할
  // - Course 클래스에서 hashCode() 재정의: 객체의 내부 상태를 기반으로 한 해시 코드를 생성
  @Override
  public int hashCode() {
    // title 은 String(레퍼런스 타입) 타입 이므로 hashCode() 메소드 사용 가능
    // id 는 int 형이므로 정수 값의 해시코드에 더하기 연산
    return title.hashCode() + id;
  }

  // id, title 값이 같으면 true 리턴
  @Override
  public boolean equals(Object o) {
    if (o instanceof Course target) {
      // id: int 형 == 연산자로 값 비교 가능
      // title: String .equals() 내용 비교
      return target.id == id && target.title.equals(title);
    } else {
      return false;
    }
  }


  @Override
  public String toString() {
    return "Course{" +
        "id=" + id +
        ", title='" + title + '\'' +
        '}';
  }
}
