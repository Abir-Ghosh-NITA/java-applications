package bankaccount;
public class savingaccount extends Account{
	private int safetyboxdepositid;
	private int safetyboxkey;
	savingaccount(String name,String sSN,int inideposit){
	super(name,sSN,inideposit);
	acno="2"+acno;
	//this.safetyboxdepositid=
	set();
}@Override
	public void setrate() {
		rate=getbaserate()*.15;
	}
	private void set() {
		this.safetyboxdepositid=(int)(Math.random()*Math.pow(10, 3));
		this.safetyboxkey=(int)(Math.random()*Math.pow(10, 4));
	}
	public void showInfo() {
		System.out.println("new Saving account:-");
		super.showInfo();
		System.out.println("depositboxid:-"+safetyboxdepositid+"\ndepositboxkey:-"+safetyboxkey);
	}

}