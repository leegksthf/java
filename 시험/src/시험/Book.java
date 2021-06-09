package 시험;

public class Book {
	protected String isbn;
	protected String name;
	protected String content;
	
	public Book() {}
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
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", content=" + content + "]";
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
	
}
	
	
	
	
	
	
	
