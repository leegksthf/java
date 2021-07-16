package control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import common.EmpDAO;
import common.Employee;

@WebServlet("/ModifyServlet")
public class ModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ModifyServlet() {
        super();
       
    }
    // MODIFYservlet ----------
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//입력요청된 정보를 읽어옴.
		String eid = request.getParameter("eid");
		String last_name = request.getParameter("last_name");
		String em = request.getParameter("email");
		String hd = request.getParameter("hire_date");
		String fn = request.getParameter("first_name");
	
		Employee emp = new Employee();
		emp.setEmployeeId(Integer.parseInt(eid));
		emp.setLastName(last_name);
		emp.setFirstName(fn);
		emp.setEmail(em);
		emp.setHireDate(hd);
		
		EmpDAO dao = new EmpDAO();
		dao.updateEmp(emp);
		
		Gson gson = new GsonBuilder().create();
		
		PrintWriter out = response.getWriter();
		out.println(gson.toJson(emp));
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
