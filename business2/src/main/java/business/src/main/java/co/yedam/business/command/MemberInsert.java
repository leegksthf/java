package co.yedam.business.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.business.common.Command;
import co.yedam.business.member.service.MemberService;
import co.yedam.business.member.serviceImpl.MemberServiceImpl;
import co.yedam.business.member.vo.MemberVO;

public class MemberInsert implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
				MemberService dao = new MemberServiceImpl();
				MemberVO vo = new MemberVO();
				vo.setId(request.getParameter("id"));
				vo.setPassword(request.getParameter("password"));
				vo.setName(request.getParameter("name"));
				vo.setEmail(request.getParameter("email"));
				
				int n = dao.memberInsert(vo);
				String view = null;
				if(n != 0) {
					view = "loginForm.do";
				} 
				return view;
			}
}
