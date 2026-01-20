package Classwork_20th_Januaruy;

public class Driver {
	public static void main(String[] args) {
		DBConnection con1 = DBConnection.getDBConnection();
		DBConnection con2 = DBConnection.getDBConnection();
		DBConnection con3 = DBConnection.getDBConnection();
		DBConnection con4 = DBConnection.getDBConnection();
		
		System.out.println(con1);
		System.out.println(con2);
		System.out.println(con3);
		System.out.println(con4);
	}
}
