package bankaccount;

public class checkingaccount extends Account {
	private long debitcardno;
	private int debitcardpin;
checkingaccount(String name,String sSN,int inideposit){
	super(name,sSN,inideposit);
	acno="1"+acno;
	set();
}
@Override
protected void setrate() {
	// TODO Auto-generated method stub
	rate=getbaserate()-.25;
}
private void set() {
	debitcardno=(long)(Math.random()*Math.pow(10, 12));
	debitcardpin=(int)(Math.random()*Math.pow(10, 4));
}
public void showInfo() {
	System.out.println("new Checking account:-");
	super.showInfo();
	System.out.println("debit card no:-"+debitcardno+"\npin no:-"+debitcardpin);
}

}
