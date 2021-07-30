package co.yedam.business.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.business.common.Command;

public class SearchSns implements Command {

	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		SnsService snsDao = new SnsServiceImpl();
		List<SnsVO> list = new ArrayList<SnsVO>();
		int n = Integer.valueOf(request.getParameter("sNo"));
		list = snsDao.snsSelect(n);
		request.setAttribute("list", list);
		return "main/snsDetail";
	}

}
