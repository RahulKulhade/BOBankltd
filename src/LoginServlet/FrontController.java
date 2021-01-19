
package LoginServlet;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


import LoginServlet.LoginController;


/**
 * Servlet implementation class FrontController
 */
@WebServlet("/LoginServlet")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().print("get at work");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String pn="/WEB-INF/ins.html";
		System.out.println("we reach front controller");
		  String whyrequestcame=request.getParameter("pov");
		  
		  if(whyrequestcame.equals("login")) 
		  { 
			  LoginController i=new LoginController(); 
			  pn=i.SetResponsePage(request);
			  }
		 
		 
		RequestDispatcher rd= request.getRequestDispatcher(pn);
		rd.forward(request, response);
	}

}

