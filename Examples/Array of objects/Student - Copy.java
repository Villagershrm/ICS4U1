/* 
   File: Student.java
   Description: This class represents an individual student
 */

public class Student {
	private static double PASS = 50;
	
	private String name;
	private int age;
	private double grade;
	
   /*
     Constructor 
   */
	public Student(String name, int age){
		this.name = name;
		this.age = age;
		this.grade = 0;
	}
	
   /*
     Constructor 
   */
	public Student(String name, int age, double grade){
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
   
   /*
      Accessors
    */
    
	public String getName() {
      return name;
   }
   
   public int getAge() {
      return age;
   }
   
   public double getGrade() {
      return grade;
   }
   
   /*
      Mutators
    */
    
    public void setName(String name) {
      this.name = name;
    }
    
    public void setAge(int age) {
      this.age = age;
    }
   
    public void setGrade(double grade) {
      this.grade = grade;
    }
   /*
     compareToAge: compare age of the implicit and explicit objects
   */
	public int compareToAge(Student other) {
		return age - other.age;
	}
	
   	
  /*
      compareToGrade: compare grade of the implicit and explicit objects
   */
	public double compareToGrade(Student other) {
		return grade - other.grade;
	}
	
   /*
      isPass: returns a boolean indicates if this student has a passing grade or not
   */
	public boolean isPass() {
		return grade >= PASS;
	}
	
   /*
      toString: String representation of this Student objectd 
   */
	public String toString() {
		String s = "Name: " + name + "\n";
		s += "Age: " + age + "\n";
		s += "Grade: " + grade + "\n";
		return s;
	}
}