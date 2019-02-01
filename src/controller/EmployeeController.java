package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Carrier;
import command.Receiver;
import domain.EmployeeDTO;
import enums.Action;
import service.EmployeeService;
import service.EmployeeServiceImpl;

@WebServlet("/employee.do")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    EmployeeService service = EmployeeServiceImpl.getInstance();   
	protected void service(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println(":::(1)컨트롤러 진입:::");
		Receiver.init(request,response);//한줄이 view
		String action = Receiver.cmd.getAction();	
		switch (Action.valueOf(Receiver.cmd.getAction().toUpperCase())) {
		case MOVE:
			Carrier.forward(request, response);
			break;
		case REGISTER:
			EmployeeDTO emp = new EmployeeDTO();
			emp.setBirthDate(request.getParameter("birth_date"));
			service.registEmployee(emp);
			Carrier.forward(request, response);
			break;

		default:
			break;
		}
	}
}