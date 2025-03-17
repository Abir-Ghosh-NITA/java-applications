package emailapp;
import java.util.*;
public class Email {
private String email;
private String Company="Amazon";
private String firstname;
private String lastname;
private String department;
private String password;
private int mailboxcapacity=500;
private String companysuffix="amazon.com";
private int defaultpasswordlength=8;
private String alternateemail;
Email(String firstname,String lastname){
	this.firstname=firstname;
	this.lastname=lastname;
	this.department=SetDeapartment();
	this.password=SetPassword(defaultpasswordlength);
	email=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+"."+companysuffix;
}
private String SetDeapartment() {
	System.out.println("Welcome to "+Company);
	System.out.println("Enter Your Department Id:-");
	System.out.print("Deparment IDS:-\nSales:-1\nDevelopment:-2\nAccounting:-3\nNo Department Alloted:-0\n");
	Scanner sc=new Scanner(System.in);
	int id=sc.nextInt();
	if(id==1) return "sales";
	else if(id==2) return "development";
	else if(id==3) return "accounting";
	else return "";
}
private String SetPassword(int length) {
	String passwordstring="ABCDEFGHIJKLMNOPQRSTUVWXYZ)!@#$%^&*()012346789";
	char []password=new char[length];
	for(int i=0;i<length;i++) {
		int idx=(int)(Math.random()*passwordstring.length());
		password[i]=passwordstring.charAt(idx);
		
	}
	return new String(password);
}
public void SetMailBoxCapacity(int capacity) {
	this.mailboxcapacity=capacity;
}
public void SetAlternateMail(String mail) {
	this.alternateemail=mail;
}
public void SetAlternatePassword(String password) {
	this.password=password;
}
public int getMailBoxCapacity() {
	return mailboxcapacity;
}
public String getAlternateEmail() {
	return alternateemail;
}
public String getpassword() {
	return password;
}
public String ShowInfo() {
	return "Name:-"+firstname+" "+lastname+
			"\nCompany Email:-"+email+"\nAlternate Email:-"+getAlternateEmail()+
			"\nCompany Password:-"+password;
}
}
