package OOPSConcepts;

public class SavingsAccount extends Account {
	public double balance;
	public void withdraw(double amt)
	{
	
	
		double res =0;
		if(amt<=balance) {
			res = amt;
			balance = balance-amt;
		}
		else {
			res = amt;
			balance =0;
		}
	}
}



