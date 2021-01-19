package LoginServlet;

import java.util.List;

public class ServiceLayer {
	private DAOLayer d;
	public ServiceLayer()
	{
		d=new DAOLayer();
	}


	
	 
	 

	

    
	public Item GetItemDetail(String userid,String password) {
		System.out.println("we reached service Layer");
		// TODO Auto-generated method stub
		return d.GetDetailsFromDB(userid,password);
	}

	public void TellGoodbyeToResources() {
		// TODO Auto-generated method stub
		d.CloseConnection();
	}

    }
