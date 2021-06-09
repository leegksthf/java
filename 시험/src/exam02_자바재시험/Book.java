package exam02_자바재시험;

/*
 * 한건의 도서정보를 저장 :VO(Value Object)
 * 필드(테이블의 컬럼)
 * 생성자
 * getter/setter
 * toString(옵션)
 */
public class Book {
	protected String isbn;
	protected String name;
	protected String content;
	
	public Book() {	}
	public Book(String isbn, String name, String content) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.content = content;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return String.format("%20s %20s %20s", isbn, name, content);
	}
	
}
