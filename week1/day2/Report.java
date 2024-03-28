package week1.day2;

public class Report {
	public static void main(String[] args) {
		Student studDetails = new Student();

		System.out.println("Student Name : " + studDetails.studentName);
		System.out.println("Roll No : " + studDetails.rollNo);
		System.out.println("College Name : " + studDetails.collegeName);
		System.out.println("Mark Scored : " + studDetails.markScored);
		System.out.println("CGPA : " + studDetails.cgpa);
	}
}
