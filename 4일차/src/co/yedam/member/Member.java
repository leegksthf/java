package co.yedam.member;

public class Member {
	String name;
	String id;
	String password;
	int age;
	
	Member() {}
	//기본생성자
	public Member(String name, String id, String password, int age) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}
	//모든 필드를 초기화하는 생성자
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", id=" + id + ", password=" + password + ", age=" + age + "]";
	}
	//toString
	@Override
	public boolean equals(Object obj) {
		Member s = ((Member)obj);
		return this.id.equals(s.id) && this.name.equals(s.name);
	}
}
