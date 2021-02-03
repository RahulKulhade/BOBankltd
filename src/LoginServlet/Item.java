package LoginServlet;

public class Item {
	
	private String userid,password,type;
	// String location;

	public String getUserid() {
		return userid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public Item(String userid, String password , String type) {
		
		this.userid = userid;
		this.password = password;
		this.type = type;
	}
	

	
	

}
