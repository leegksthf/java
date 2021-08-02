package co.yedam.business.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.business.board.service.BoardService;
import co.yedam.business.board.serviceImpl.BoardServiceImpl;
import co.yedam.business.board.vo.BoardVO;
import co.yedam.business.common.Command;
import co.yedam.business.sns.service.SnsService;
import co.yedam.business.sns.serviceImpl.SnsServiceImpl;
import co.yedam.business.sns.vo.SnsVO;

public class SnsUpdateForm implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
