package OOPSConcepts;

public class Account {
	 public double balance;
	public void withdraw(double amt)
	{
		double res =0;
		if(amt<=balance) {
			balance = balance-amt;
		}
		else {
			res = amt;
			balance =0;
		}
	}
	public void MakePayment() {
			System.out.println("make a payment");
		}

}
