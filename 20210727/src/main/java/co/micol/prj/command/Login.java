package co.micol.prj.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.micol.prj.common.Command;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.serviceImpl.MemberServiceImpl;
import co.micol.prj.member.vo.MemberVO;

public class Login implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 로그인 과정을 처리하는 곳
		MemberService dao = new MemberServiceImpl();	//멤버
//		BoardService boardDao = new BoardServiceImpl();	//게시판 table
		HttpSession session = request.getSession();	 //세션객체 호출한다.
		MemberVO vo = new MemberVO();
		vo.setId(request.getParameter("id"));
		vo.setPassword(request.getParameter("password"));
		vo = dao.memberLogin(vo);
		
		String page = "";
		if(!vo.getName().isEmpty()) {			//if(!vo.getName().isEmpty()) //if(vo.getName() != null)
			session.setAttribute("name", vo.getName());
			session.setAttribute("author", vo.getAuthor());
			session.setAttribute("id", vo.getId());
//			List<BoardVO> list = new ArrayList<BoardVO>();
//			list = boardDao.boardSelecctlist();
//			request.setAttribute("boards", list);
			page = "main.do";
		} else {
			page = "loginForm.do";
		}
		return page;
	}

}
