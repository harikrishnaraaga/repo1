class Customer
{
	int custId;
	String custName;
	String custAddress;
	
	void withDraw()
	{
		System.out.println("Amount withdrawn is ");
	}
}
class Account
{
	
}
class RBI
{
	Customer c = new Customer();
	Account A = new Account();
	
	public double getInterestRate()
	{
		return 4;
	}
	public double getWithdrawalLimit()
	{
		return 10000;
	}
}
class SBI extends RBI
{
	
}
class ICICI extends RBI
{
	
}
class PNB extends RBI
{
	
}
public class Banking {

}
