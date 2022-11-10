import java.io.*;
import java.util.Scanner;

/*
   File: Group.java
   Description: This class represents a group of students
 */
public class Group {

  Student[] students;   // instance field: an array of Student
  
  /* 
     Constructor: 
     no parameter: initialize the array to null (points to nothing)
  */
  public Group() {
    students = null;
  }
 
   /**
   * Constructor
   * There are 3 options to "copy" the array passed in
   
   * @param  list the array of Student used to initialize the field
   * 
   */
  public Group(Student[] list) {
    // option 1
    students = list;
    
    // option 2
    students = new Student[list.length];
    for (int i = 0; i < list.length; i++) {
      students[i] = list[i];
    }
    
    // option 3
    students = new Student[list.length];
    for (int i = 0; i < list.length; i++) {
      students[i] = new Student(list[i].getName(), list[i].getAge(), list[i].getGrade());
    }
    
  }
  
   /**
   * Constructor
   * Create an array of the given size, fill in the array with information from standard input (keyboard)
   
   * @param  numStudent number of students in the group   
   */
  public Group (int numStudent) {
    students = new Student[numStudent];
    for (int i = 0; i < numStudent; i++) {
      // get input for name, age, grade
      students[i] = createByStandardInput();
    }  
  }
  
   /**
   * Constructor
   * Read from the text file the size of the group, create the array of the correct size, then fill in the array
   * with information in the file
   
   * @param fileName name of the file containing information of all students in the group
   */
  public Group (String fileName) {
  	String name;
	int age;
	double grade;
	
   try {
  	BufferedReader in = new BufferedReader(new FileReader(fileName));
   
   // first line of the file specifies the size of the group (size of the array)
	int numStudent = Integer.parseInt(in.readLine());
	students = new Student[numStudent];
	
	for (int i = 0; i < numStudent; i++) {
		name = in.readLine();	
		age = Integer.parseInt(in.readLine());
		grade = Double.parseDouble(in.readLine());
		students[i] = new Student(name, age, grade);
	}
   } catch(IOException iox) {
      System.out.println("Problem accessing files");
   }
	
  }
  
  /**
   * oldest:
   * Returns the oldest Student in the group
   * 
   * @param  
   * @return the oldest Student
   */
  public Student oldest() {
    Student temp = students[0];
      for (int i = 1; i < students.length; i++) {
      if (students[i].compareToAge(temp) > 0) {
        temp = students[i];
      }
    }
    return temp;
  }
  
  /**
   * highestGrade:
   * Returns the Student in the group with the highest grade
   * 
   * @param  
   * @return the Student with the highest grade
   */
  public Student highestGrade() {
  	Student highest = students[0];
	
	for (int i = 1; i < students.length; i++) {
		if (students[i].compareToGrade(highest) > 0) {
			highest = students[i];
		}
	}
	return highest;
  }
  
  /**
   * numPass:
   * Returns number of students in this group who pass
   * 
   * @param  
   * @return number of students who pass
   */
  public int numPass() {
   int count = 0;
   
   for (int i = 0; i < students.length; i++) {
      if (students[i].isPass()) {
         count ++;
      }
   }
   return count;
  }
  

  
   /** 
   * createByStandardInput 
   * Creats and returns a new Student with information from the standard input (keyboard)
   * 
   * @param  
   * @return a new Student
   */
  private Student createByStandardInput () {
    String name;
    int age, grade;
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter name: ");
    name = sc.nextLine();
    System.out.print("Enter age:  ");
    age = sc.nextInt();
    System.out.print("Enter grade: ");
    grade = sc.nextInt();
    return (new Student(name, age, grade));
  }

}