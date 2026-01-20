package Classwork_20th_Januaruy;

public class DBConnection {
	
	//Sin
	private static DBConnection con;
	
	public static DBConnection getDBConnection() {
		if(con == null) {
			con = new DBConnection();
		}
		return con;
	}
	private DBConnection() {
		
	}
	
}
