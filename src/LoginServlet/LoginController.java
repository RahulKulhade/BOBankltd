package LoginServlet;

import javax.servlet.http.HttpServletRequest;
import LoginServlet.Item;
import LoginServlet.ServiceLayer;

public class LoginController {
	
	public String SetResponsePage(HttpServletRequest request) {
		// TODO Auto-generated method stub
		String pn="/WEB-INF/login.jsp";
		System.out.println("we reached login controller");
		String info=request.getParameter("login-now");
		//request.setAttribute("k1", "we reached the LoginController");
		ServiceLayer s=new ServiceLayer();
		if(info.equals("login"))
		{
			
			String userid=(request.getParameter("userid").trim());
			String password=(request.getParameter("password").trim());
			System.out.println(userid);
			System.out.println(password);
			Item x=s.GetItemDetail(userid,password);
			if(x.getUserid().equals(userid) && x.getPassword().equals(password))
			{
				System.out.println("welcome success");
				pn="/WEB-INF/customerHomePage.jsp";
			}
			else
			{
				System.out.println("failed");
				pn="/WEB-INF/login.jsp";
			}
			
		
		}
		s.TellGoodbyeToResources();
		return pn;
	}


}
