package bankaccount;

import java.util.*;

public class BankAccount {

	public static void main(String[] args) {
		String file="";
		List<Account>accounts=new LinkedList<>();
		List<String[]>newAccounts=utilities.csv.read(file);
      for(String []arr:newAccounts) {
    	 String name=arr[0];
    	  String sSN=arr[1];
    	  String accounttype=arr[2];
    	 Integer inideposit=Integer.parseInt(arr[3]);
    	 if(accounttype.equals("Savings")) accounts.add(new savingaccount(name,sSN,inideposit));
    	 else if(accounttype.equals("Checking")) accounts.add(new checkingaccount(name,sSN,inideposit));
    	 else System.out.println("Error bank type!!");
      }
	
	for(Account acc:accounts) acc.showInfo();
	}
}
