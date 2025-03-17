package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabase {

	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter number of students to enroll:-");
   int num=sc.nextInt();
   student[]students=new student[num];
   for(int i=0;i<num;i++) {
	   students[i]=new student();
	   students[i].enroll();
	   students[i].paytuition();
   }
   for(int i=0;i<num;i++) {
   System.out.println(students[i].showInfo());
	}
	}
}
