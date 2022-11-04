public class GroupRunner {
 public static void main (String[] args) {
  String name1, name2;
  int age1, age2;
  double grade1, grade2;
  
  name1 = "Bobby";
  age1 = 13;
  grade1 = 90;
  
  name2 = "Ada";
  age2 = 14;
  grade2 = 50;
  
  Student s1 = new Student(name1, age1, grade1);
  Student s2 = new Student(name2, age2, grade2);
  Group g = new Group (s1, s2);
   
//  Group g = new Group(name1, age1, grade1, name2, age2, grade2);
  
  System.out.println(g.numPass() + " students has passing grade.");
  
  g.listInOrderAge();
  
  System.out.println(g);
  
 }
}