package co.yedam.business.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.yedam.business.common.Command;

public class Logout implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 로그아웃
				HttpSession session = request.getSession();
			//	String message = session.getAttribute("name") + "님 정상 로그아웃 되었습니다.";
//				session.invalidate(); //세션 완전히 제거
				session.removeAttribute("name");
				session.removeAttribute("author");
				//request.setAttribute("message", message);
				return "home/home";
	}

}
