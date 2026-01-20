package Relationship_2;



class Student extends Person{

	private int roll;

	private String grade;

	private Course c;

	public Student(int roll, String grade) {

		super();

	    this.roll = roll;

	    this.grade = grade;

	}

	public Student() {

		

	}

	public Course getCourse() {

		return c;

	}

	public void setCourse(Course c1) {

		this.c=c1;

	}

	public String getGrade() {

	    return grade;

	}



	public void setGrade(String g) {

	    this.grade = g;

	}

	public int getRoll() {

	    return roll;

	}

	public void setRoll(int roll) {

	    this.roll = roll;

	}



}

