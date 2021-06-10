package co.board.view;

import java.util.List;

import co.board.access.BoardAccess;
import co.board.access.BoardDAO;
import co.board.model.Board;
import co.board.util.ScannerUtil;

public class BoardApp {
BoardAccess boardList = new BoardDAO();
	
	//프로그램 시작
	public void start() {
		int menunum;
		do {
			menuTitle();					//메뉴 출력
			menunum = ScannerUtil.readInt("입력");//메뉴 선택
			switch (menunum) {				//실행
			case 1:		insert();		break;
			case 2:		update();		break;
			case 3:		delete();		break;
			case 4:		selectAll();	break;
			case 5:		findId();		break;
			}
		}while(menunum != 0);
	}
	
	private void findId() {
		//전화번호입력
		String id = ScannerUtil.readStr();
		Board board = boardList.selectOne(id);
		System.out.println(board);
		//friendList에서 조회
	}

	//전체리스트
	private void selectAll() {
		List<Board> list = boardList.selectAll();
		for(Board board : list) {
			System.out.println(board);
		}
	}

	// 글번호로 검색해서 삭제
	private void delete() {
		String id = ScannerUtil.readStr();
		boardList.delete(id);	
	}

	//이름으로 검색해서 내용 수정
	public void update() {
		 Board board = new Board();
		 board.setId(ScannerUtil.readStr("이름 입력"));
		 board.setContent(ScannerUtil.readStr("수정할 내용"));
		 boardList.update(board);
	}
	//등록
	public void insert() {
		System.out.println("제목입력");
		String title = ScannerUtil.readStr();
		System.out.println("내용입력");
		String content = ScannerUtil.readStr();
		System.out.println("작성자입력");
		String writer = ScannerUtil.readStr();
		
		
		Board board = new Board(title,content,writer);
		boardList.insert(board);
		
	}

	//메뉴 출력
	public void menuTitle() {
		System.out.println("==친구 관리==");
		System.out.println("=|1. 글등록	|");
		System.out.println("=|2. 글수정	|");
		System.out.println("=|3. 글삭제	|");
		System.out.println("=|4. 전체조회	|");
		System.out.println("=|5. 번호로조회	|");
		System.out.println("= 0. 종료=======");
	}
	}
