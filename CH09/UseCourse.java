import java.util.Arrays;
public class UseCourse{
	public static void main(String[] args){
		Course crs1 = new Course("JAVA programming");
		System.out.println("Course name: "+crs1.getCourseName()
			+ ", Number of students : " +crs1.getNumberOfStudents());
		System.out.println("Students list : "+Arrays.toString(crs1.getStudents()));
		
		// add students
		crs1.addStudent("LEE");
		crs1.addStudent("KIM");
		crs1.addStudent("CHOI");
		System.out.println("\nAfter adding students\nCourse name: "+crs1.getCourseName()
			+ ", Number of students : " +crs1.getNumberOfStudents());
		System.out.println("Students list : "+Arrays.toString(crs1.getStudents()));
		
		// drop students
		crs1.dropStudent("LEE");
		crs1.dropStudent("KIM");
		crs1.dropStudent("PARK");	// it doesn't work
		System.out.println("\nAfter dropping students\nCourse name: "+crs1.getCourseName()
			+ ", Number of students : " +crs1.getNumberOfStudents());
		System.out.println("Students list : "+Arrays.toString(crs1.getStudents()));
	}
}
		