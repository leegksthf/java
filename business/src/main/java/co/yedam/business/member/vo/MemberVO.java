package co.yedam.business.member.vo;

public class MemberVO {
	private String id;
	private String password;
	private String name;
	private	String email;
	private String author;
	private char state;
	
	public MemberVO() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public char getState() {
		return state;
	}

	public void setState(char state) {
		this.state = state;
	}
	
	
}
