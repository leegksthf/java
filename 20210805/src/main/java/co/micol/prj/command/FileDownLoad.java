package co.micol.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.comm.Command;
import co.micol.prj.comm.DownLoadFile;

public class FileDownLoad implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String path = "d://temp";
		String orgFileName = request.getParameter("orgFile");
		String downFileName = request.getParameter("downFile");
		DownLoadFile downLoadFile = new DownLoadFile(path, orgFileName, downFileName);
		boolean b = downLoadFile.isFileDown();
		if(!b) {
			request.setAttribute("message", "파일이 성공적으로 다운로드 되었다");
		} else {
			request.setAttribute("message", "파일이 다운로드 되지 않았다");
		}
		return "file/fileDownMessage";
	}

}
