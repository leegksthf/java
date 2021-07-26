package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import common.EmpDAO;
import common.Employee;

@WebServlet("/EmpJsonServ2")
public class EmpJsonServ2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public EmpJsonServ2() {
        super();
     
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		Gson gson = new Gson(); 
		new GsonBuilder().create();
		
		EmpDAO dao = new EmpDAO();
		List<Employee> list = dao.getEmpList();
		JsonArray oAry = new JsonArray();
		
		for(Employee emp : list) {
			JsonObject iObj = new JsonObject();
			iObj.addProperty("eid", emp.getEmployeeId()); //{id:??, name:??}
			iObj.addProperty("fn", emp.getFirstName());
			iObj.addProperty("ln", emp.getLastName());
			iObj.addProperty("sa", emp.getSalary());
			iObj.addProperty("em", emp.getEmail());
			iObj.addProperty("hd", emp.getHireDate());
			
			oAry.add(iObj);
		}

	JsonObject obj = new JsonObject();
	obj.add("data", oAry);
	
	out.println(gson.toJson(obj));
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
