 package studentdatabaseapp;

import java.util.Scanner;

public class student {
private String firstName;
private String lastName;
private int gradeyear;
private int tuitionbalance;
private int coursecosst=600;
private String courses;
private static String studentId;
private static int id=1000;

student(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first name of student :-");
	this.firstName=sc.nextLine();
	System.out.println("Enter the last name of student :-");
	this.lastName=sc.nextLine();
	System.out.println("Enter the gradeyear of student :-\n1:-for Freshmen\n2:-for Sophmore\n3:-for Junior\n4:-for Senior");
    this.gradeyear=sc.nextInt();
    setstudentid();
	}
private void setstudentid() {
	id++;
	this.studentId=gradeyear+""+id;
}
public void enroll() {
	do {
		System.out.println("Enter courses to enroll(Q to quit)");
		Scanner sc=new Scanner(System.in);
		String course=sc.nextLine();
		if(!course.equals("Q")){
				courses=courses+"\n "+course;
				tuitionbalance+=coursecosst;
		}
		else {
			break;
		}
	}while(1!=0);
}
public void viewBalance()
{
	System.out.println("Your Balance is:-"+tuitionbalance);
	}
public void paytuition() {
	viewBalance();
     System.out.println("Enter your amount:-");
	Scanner sc=new Scanner(System.in);
	int payment=sc.nextInt();
	tuitionbalance-=payment;
	System.out.println("Thankyou for your payment of:-"+payment);
	//viewBalance();	
}
public String showInfo() {
	return "Name:-"+firstName+" "+lastName+
			"\nGradeYear:-"+gradeyear+"\nStudent id:-"+studentId+"\nCourses Enrolled:-"+courses+"\nTuitionBalance:-"+tuitionbalance;
}
}
