public class Group {
 private Student stud1;
 private Student stud2;
 
 public Group (Student s1, Student s2) {
  stud1 = s1;
  stud2 = s2;
 }
 
 public Group (String name1, int age1, double grade1,
 String name2, int age2, double grade2) {
  stud1 = new Student(name1, age1, grade1);
  stud2 = new Student(name2, age2, grade2);
 }
 
 public void setStud1(Student s1) {
   stud1 = s1;
 }
 
 public int numPass() {
  int count = 0;
  if (stud1.isPass()) {
   count++;
  }
  if (stud2.isPass()) {
   count++;
  }
  return count;
 }
 
 public void listInOrderAge() {
  if (stud1.compareToAge(stud2) < 0) {
   System.out.println(stud1);
   System.out.println(stud2);
  } else {
   System.out.println(stud2);
   System.out.println(stud1);
  }
 }
  
 public String toString() {
   return "Student 1:\n" + stud1 + "\n" + "Student 2:\n" + stud2;
 }
}