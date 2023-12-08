package _09_dependency_injection;

// 게시판 목록을 관리하는 기능을 제공하는 클래스 (save, delete)

public class BoardService {
  // 1. 생성자를 이용한 DI
//  private final IBoardRepository repository;
//
//  public BoardService(IBoardRepository repository) {
//    this.repository = repository;
//  }

  // 2. setter 를 이용한 DI
  // final 로 설정하게 되면 다른 개발자가 setter 를 이용해 다른 값으로 설정할 수 있기 때문에 안됨.
  private IBoardRepository repository;

  public void setIBoardRepository(IBoardRepository repository) {
    this.repository = repository;
  }


  public void save() {
    repository.save();
  }

  public void delete() {
    repository.delete();
  }
}
