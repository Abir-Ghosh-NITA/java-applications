package bankaccount;

public abstract class Account implements baserate{
	private String name;
	private String sSN;
    protected String acno;
   private double balance;
   protected double rate;
   private static int idx=10000;
	
Account(String name,String sSN,int inideposit){
	this.name=name;
	this.sSN=sSN;
	this.balance=inideposit;
	idx++;
	this.acno=setaccount();
	//System.out.println(acno);
	setrate();
}
protected abstract void setrate();
public void compound() {
	int accuredinterest=(int) (balance*(rate/100));
	balance+=accuredinterest;
	System.out.println("AccuredInterest:-"+accuredinterest);
	printbalance();
}
private String setaccount() {
	String l2=sSN.substring(sSN.length()-2,sSN.length());
	int random=(int) (Math.random()*Math.pow(10, 3));
	return l2+idx+random;
}
public void deposit(int amount) {
	balance+=amount;
	System.out.println("Depositing:-"+amount+"$");
	printbalance();
}
public void withdraw(int amount) {
	if(balance>=amount) {balance-=amount;
	System.out.println("Withdrawing:-"+amount+"$");
	printbalance();}
	else System.out.println("Not Enough Balance");
}
public void transfer(String name,int amount) {
	if(balance>=amount) {balance-=amount;
	System.out.println("Transfering:-"+amount+"$");
	printbalance();}
	else System.out.println("Not Enough Balance");
}
public void printbalance() {System.out.println("Your Current Balance is:-"+balance);}
public void showInfo() {
	System.out.println("Name:-"+name+"\nAccount:-"+acno+"\nbalance:-"+balance+"\nRate:-"+rate);
}
}
