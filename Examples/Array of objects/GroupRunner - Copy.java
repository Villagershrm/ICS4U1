/*
   File: GroupRunner.java
   Description: This file contains the main method that make use of the Student and Group classes
 */
public class GroupRunner {
 public static void main (String[] args) {
    final int SIZE = 10;
   
   Group periodA = new Group(SIZE);
   Group periodB = new Group("studentInfo.txt");
 
   final int MAX = 3;
   
   Student[] list = new Student[3];
   
   for (int i = 0; i < MAX; i++) {
     // input for name, age, grade
     list[i] = new Student(name, age, grade);
   }
     
   Group g = new Group (list);
 }
}