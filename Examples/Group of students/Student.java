public class Student {
	private static double PASS = 50;
	
	private String name;
	private int age;
	private double grade;
	
	public Student(String name, int age){
		this.name = name;
		this.age = age;
		this.grade = 0;
	}
	
	public Student(String name, int age, double grade){
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	public int compareToAge(Student other) {
		return age - other.age;
	}
	
	public double compareToGrade(Student other) {
		return grade - other.grade;
	}
	
	public boolean isPass() {
		return grade >= PASS;
	}
	
	public String toString() {
		String s = "Name: " + name + "\n";
		s += "Age: " + age + "\n";
		s += "Grade: " + grade + "\n";
		return s;
	}
}