package co.micol.prj.command;

import java.io.IOException;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import co.micol.prj.comm.Command;
import co.micol.prj.image.service.FileInfoService;
import co.micol.prj.image.vo.FileInformationVO;


@MultipartConfig(fileSizeThreshold = 1024*1024, maxFileSize = 1024*1024*5, maxRequestSize = 1024*1024*5*5)
public class FileUpload implements Command{
	private static final String DIRECTORY = "image"; //실제 파일이 저장될 공간
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// 파일업로드
		FileInfoService fileDao = new FileInfoService();
		FileInformationVO vo = new FileInformationVO();
		int maxFileSize = 1024 * 1024 * 100;
		
		try {
		MultipartRequest part = new MultipartRequest(request, "d:/temp/", maxFileSize, "utf-8", new DefaultFileRenamePolicy()); 
		String upfileName = part.getFilesystemName("fileName");
		String orgfileName = part.getOriginalFileName("fileName");
		
		System.out.println(part.getParameter("subject"));
		System.out.println(upfileName);
		
		vo.setSubject(part.getParameter("subject"));
		vo.setFileName(orgfileName);
		vo.setDownfile(upfileName);
		
		int n = fileDao.fileInsert(vo);
		if(n!=0) {
			request.setAttribute("message", vo.getFileName() + "파일업로드");
		} else {
			request.setAttribute("message", orgfileName + "파일업로드 실패");
		}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return "file/fileUploadResult";
	}
}
