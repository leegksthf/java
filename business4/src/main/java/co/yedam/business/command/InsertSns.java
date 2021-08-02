package co.yedam.business.command;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import co.yedam.business.common.Command;
import co.yedam.business.sns.service.SnsService;
import co.yedam.business.sns.serviceImpl.SnsServiceImpl;
import co.yedam.business.sns.vo.SnsVO;

public class InsertSns implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		SnsService dao = new SnsServiceImpl();
		SnsVO vo = new SnsVO();
		vo.setsWriter(request.getParameter("sWriter"));
		vo.setsTitle(request.getParameter("sTitle"));
		vo.setsContents(request.getParameter("sContents"));
		vo.setsDate(Date.valueOf(request.getParameter("sDate")));
		int n = dao.snsInsert(vo);
		String page="";
		if(n!=0){
			page = "snsList.do";
			
		}else {
			page = "sns/snsInsertFail";
		}
		
		return page;
	}


}
