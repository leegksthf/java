package co.yedam.business.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.yedam.business.board.service.BoardService;
import co.yedam.business.board.serviceImpl.BoardServiceImpl;
import co.yedam.business.board.vo.BoardVO;
import co.yedam.business.common.Command;
import co.yedam.business.member.service.MemberService;
import co.yedam.business.member.serviceImpl.MemberServiceImpl;
import co.yedam.business.member.vo.MemberVO;

public class Login implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		MemberService dao = new MemberServiceImpl(); //멤버
		BoardService boardDao = new BoardServiceImpl(); //게시판 Table
		HttpSession session = request.getSession();
		MemberVO vo = new MemberVO();
		vo.setId(request.getParameter("id"));
		vo.setPassword(request.getParameter("password"));
		vo = dao.memberLogin(vo);
		
		String page="";
		if(vo.getName()!=null) {
			session.setAttribute("name", vo.getName());
			session.setAttribute("author", vo.getAuthor());
			session.setAttribute("id", vo.getId());
			List<BoardVO> list = boardDao.boardSelectList();
			request.setAttribute("boardList", list);
			page = "main.do";
		}else {
			page = "loginForm.do";
		}

		return page;
	}	}



