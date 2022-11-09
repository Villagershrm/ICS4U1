public class Group {
  Student[] students;
  
  public Group() {
    students = null;
  }
 
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
  
  public Group (int numStudent) {
    students = new Student[numStudent];
    for (int i = 0; i < numStudent; i++) {
      // get input for name, age, grade
      students[i] = createByStandardInput();
    }  
  }
  
  // create the array with data read from a file
  public Group (String fileName) {
  	String name;
	int age;
	double grade;
	
  	BufferedReader in = new BufferedReader(new fileReader(fileName));
	int numStudent = Integer.parseInt(in.readLine());
	students = new Student[numStudent];
	
	for (int i = 0; i < numStudent; i++) {
		name = in.readLine();	
		age = Integer.parseInt(in.readLine());
		grade = Double.parseDouble(in.readLine());
		students[i] = new Student(name, age, grade);
	}
	
  }
  
  // Return the student object who is the oldest
  public Student oldest() {
    Student temp = students[0]
      for (int i = 1; i < students.length; i++) {
      if (students[i].compareToAge(temp) > 0) {
        temp = students[i];
      }
    }
    return temp;
  }
  
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
  
  public Student highestGrade() {
  	Student highest = students[0];
	
	for (int i = 1; i < students.length; i++) {
		if (students[i].compareToGrade(highest) > 0) {
			highest = list[i];
		}
	}
	return highest;
  }

}