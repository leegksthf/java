package exam02_자바재시험;

import java.util.List;

// 도서관리 개발 표준
public  abstract class BookAccess {
	//등록
	public abstract void insert(Book book);	
	//이름으로조회
	public abstract List<Book> findName(String name);
	//ISBN 조회	- 한건이라 list 필요x
	public abstract Book findIsbn(String isbn);
	//전체출력
	public abstract List<Book> findAll();							//리스트 고치고 BookServiceFindAll 추가 BookApp에서 메뉴추가
}
