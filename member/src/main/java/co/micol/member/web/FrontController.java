package co.micol.member.web;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.member.command.Command;
import co.micol.member.command.MainCommand;
import co.micol.member.command.MemberInsert;
import co.micol.member.command.MemberInsertForm;
import co.micol.member.command.MemberListCommand;
import co.micol.member.command.MemberSearchCommand;
import co.micol.member.command.MemberSearchForm;

/**
 * Servlet implementation class FrontController
 */
//@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     private HashMap<String, Command> map = new HashMap<String, Command>(); // 珥덇린�솕
     
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO command 媛앹껜瑜� �뿬湲곗뿉 �벑濡앺븳�떎.
		map.put("/main.do", new MainCommand()); //�솃
		map.put("/memberList.do", new MemberListCommand()); //�쉶�썝紐⑸줉
		map.put("/memberSearch.do", new MemberSearchCommand()); //�쉶�썝寃��깋
		map.put("/memberSearchForm.do", new MemberSearchForm()); //�쉶�썝寃��깋 �뤌
		map.put("/memberInsertForm.do", new MemberInsertForm()); //�쉶�썝媛��엯 �뤌
		map.put("/memberInsert.do", new MemberInsert()); //�쉶�썝媛��엯
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO �뿬湲곌� �슂泥�遺꾩꽍 諛� 泥섎━, view Page �꽑�깮�븯�뒗 怨�
		request.setCharacterEncoding("utf-8"); // �븳湲�源⑥쭚 諛⑹�
		// �떎�젣 �슂泥��쓣 遺꾩꽍
		String uri = request.getRequestURI();
		String context = request.getContextPath();
		String path = uri.substring(context.length()); // uri - context �떎�젣 �슂泥��럹�씠吏� ex)/main.do
		
		Command command = map.get(path); //Command command = new MainCommand();
		String viewPage = command.execute(request, response); //�떎�뻾�맂 寃곌낵瑜� 蹂댁뿬以� �럹�씠吏� �꽑�깮  viewPage = main/home
		
		if(!viewPage.endsWith(".do")) { //蹂댁뿬以� �럹�씠吏�瑜� �꽑�깮�븳�떎. 
			viewPage = "WEB-INF/views/" + viewPage + ".jsp";
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
   
	}

}
