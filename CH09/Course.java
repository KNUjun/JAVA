public class Course{
	String courseName;
	String[] students;
	int numberOfStudents;
	
	Course(String newCourseName){
		courseName = newCourseName;
		students = new String[100];	// maximum number of students is 100
	}
	
	public String getCourseName(){
		return courseName;
	}
	public void addStudent(String student){
		students[numberOfStudents]=student;
		numberOfStudents++;
	}
	public void dropStudent(String student){
		if( numberOfStudents>0 ){
			// finding index of student
			for(int i=0; i<numberOfStudents; i++){
				if(student.equals(students[i])){
					// dropping 
					for(int j=i; j<numberOfStudents-1; j++)
						students[j]=students[j+1];
					students[--numberOfStudents]="";
					break;
				}
			}
		}
	}
	public String[] getStudents(){
		String[] temp = new String[numberOfStudents];
		for(int i=0; i<numberOfStudents; i++)			
			temp[i]=students[i];
		return temp;
	}
	public int getNumberOfStudents(){
		return numberOfStudents;
	}
}