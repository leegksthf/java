package co.yedam.business.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.business.common.Command;

public class SnsInsertForm implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return "sns/snsInsertForm";
	}

}
