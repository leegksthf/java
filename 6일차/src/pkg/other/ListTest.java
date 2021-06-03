package pkg.other;

import java.util.ArrayList;

/*
 * ArrayList에 데이터를 저장하고 조회하는 기능을 구현
 */
//1건의 메모에는 어떤 정보를 입력하는가
//기능 = 메서드 : 동작 - 전체조회, 제목검색, 내용검색, 등록
class Memo {
	String title; // 필드 = 데이터
	String content;
	public Memo(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "Memo [title=" + title + ", content=" + content + "]";
	}
}

	public class ListTest {
		ArrayList<Memo> list = new ArrayList<Memo>();

	// 전체조회
	public void selectAll() {
		for (int i = 0; i < list.size(); i++) {
			Memo memo = list.get(i);
			System.out.println(memo.title + "\t" + memo.content);
		}
	}

	// 제목검색
	public void findTitle(String title) {
		for (int i = 0; i < list.size(); i++) {
			Memo memo = list.get(i);
			if (memo.title.equals(title)) {
				System.out.println(memo.title + "\t" + memo.content);
			}
		}
	}

	// 내용검색
	public void findContent(String content) {
		for (int i = 0; i < list.size(); i++) {
			Memo memo = list.get(i);
			if (memo.content.contains(content)) {				//contains: 부분일치 equals:완전일치
				System.out.println(memo.title + "\t" + memo.content);
			}
		}
	}

	// 등록
	public void insert() {
		//키보드로 입력받아서 (scanner)
		Memo memo = new Memo();
		memo.title = ___; 
		memo.content = ___;
		list.add(memo);
	}
	
	public static void main(String[] args) {
		ListTest listTest = new ListTest();
		listTest.list.add(new Memo("자바 공부","열공합시다"));
		listTest.list.add(new Memo("자바 시험","월요일에"));
		listTest.list.add(new Memo("자바프로젝트","멋지게"));
		
		listTest.selectAll();
		listTest.findTitle("자바 공부");
		listTest.findContent("월요일");
	}
}
