package Relationship_2;



public class StudentCourse {
Student st;

Course c1;

public void showStudentCourseDetails() {

	System.out.println("Person "+st.getName()+" of age "+st.getAge()+" is a student of  "

			+st.getCourse().getCN()+" course with course id "+c1.getCid()+" having roll "+

			st.getRoll()+" and has scored Grade "+st.getGrade());

}

public static void main(String[] args) {

	StudentCourse sc1= new StudentCourse();

	Student st= new Student();

	sc1.st=st;

	Course c1= new Course();

	sc1.c1=c1;

	st.setName("Simon");

	st.setAge(20);

	c1.setCN("CSE");

	c1.setCid(1234);

	st.setGrade("A");

	st.setRoll(21);

	st.setCourse(c1);

	sc1.showStudentCourseDetails();

}

}