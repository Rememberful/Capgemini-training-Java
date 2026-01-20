package Relationship_2;



public class Course {

	private int cid;

	String cName;

	public Course(int c, String cN) {

		

	    this.cid = c;

	    this.cName = cN;

	}

	public Course() {

		

	}

	public String getCN() {

	    return cName;

	}



	public void setCN(String g) {

	    this.cName = g;

	}

	public int getCid() {

	    return cid;

	}

	public void setCid(int c) {

	    this.cid = c;

	}



}