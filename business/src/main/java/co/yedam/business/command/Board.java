package co.yedam.business.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.business.board.service.BoardService;
import co.yedam.business.board.serviceImpl.BoardServiceImpl;
import co.yedam.business.board.vo.BoardVO;
import co.yedam.business.common.Command;

public class Board implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	      BoardService dao = new BoardServiceImpl(); //모델을 호출
	      List<BoardVO> boards = new ArrayList<BoardVO>();
	      boards = dao.boardSelectList();   //데이터를 가져옴
	      request.setAttribute("list", boards);   //페이지에 값을 전달하기 위해
		return "member/boardForm";
	}
}
