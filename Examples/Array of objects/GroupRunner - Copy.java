public class GroupRunner {
 public static void main (String[] args) {
   final int MAX = 3;
   
   Student[] list = new Student[3];
   
   for (int i = 0; i < MAX; i++) {
     // input for name, age, grade
     list[i] = new Student(name, age, grade);
   }
  
   
   Group g = new Group (list);
 }
}