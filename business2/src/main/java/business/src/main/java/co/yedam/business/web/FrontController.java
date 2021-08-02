package co.yedam.business.web;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.business.command.BoardList;
import co.yedam.business.command.BoardSelect;
import co.yedam.business.command.DeleteBoard;
import co.yedam.business.command.Home;
import co.yedam.business.command.InsertBoard;
import co.yedam.business.command.InsertForm;
import co.yedam.business.command.Login;
import co.yedam.business.command.LoginForm;
import co.yedam.business.command.Logout;
import co.yedam.business.command.MemberInsert;
import co.yedam.business.command.UpdateBoard;
import co.yedam.business.command.UpdateForm;
import co.yedam.business.common.Command;


/**
 * Servlet implementation class FrontController
 */
@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private HashMap<String, Command> map = new HashMap<String, Command>();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void init(ServletConfig config) throws ServletException {
		map.put("/home.do", new Home());
		map.put("/memberInsert.do", new MemberInsert());
		map.put("/loginForm.do", new LoginForm());
		map.put("/login.do", new Login());
		map.put("/logout.do", new Logout());
		map.put("/boardList.do", new BoardList());
		map.put("/boardSelect.do", new BoardSelect());
		map.put("/insertForm.do", new InsertForm());
		map.put("/insertBoard.do", new InsertBoard());
		map.put("/updateForm.do", new UpdateForm());
		map.put("/deleteBoard.do", new DeleteBoard());
		map.put("/updateBoard.do", new UpdateBoard());
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String uri=request.getRequestURI();
		String contextPath = request.getContextPath();
		String page = uri.substring(contextPath.length());
		
		Command command = map.get(page);
		String viewPage = command.execute(request, response);
		
		if(!viewPage.endsWith(".do")) { //"home.do"
	         if(!viewPage.endsWith(".jsp")) {
	            viewPage = viewPage + ".tiles"; //"home/home"
	         } else {
	            viewPage = "/WEB-INF/views/" + viewPage; //"home/home.jsp"
	         }
	      }
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}


}
