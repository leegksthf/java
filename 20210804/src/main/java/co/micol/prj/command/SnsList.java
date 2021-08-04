package co.micol.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.board.service.BoardService;
import co.micol.prj.board.serviceImpl.BoardServiceImpl;
import co.micol.prj.board.vo.SnsVO;
import co.micol.prj.common.Command;

public class SnsList implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// sns 목록가져오기
		BoardService boardDao = new BoardServiceImpl();
		SnsVO vo = new SnsVO();
//		List<SnsVO> list = new ArrayList<SnsVO>();
//		list = boardDao.snsSelectList();
		vo.setSNo(1);
		request.setAttribute("list", boardDao.snsSelect(vo));
		return "board/snsSelect";
	}

}
