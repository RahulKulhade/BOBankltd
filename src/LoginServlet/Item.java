package LoginServlet;

public class Item {
	
	private String userid,password;
	// String location;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Item() {
		
		// TODO Auto-generated constructor stub
	}

	public Item(String userid, String password) {
		
		this.userid = userid;
		this.password = password;
	}
	

	
	

}
