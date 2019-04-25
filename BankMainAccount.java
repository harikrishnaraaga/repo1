class Account
{
	Integer accNo;
	Double balance;
	Double annualInterestRate;
	
	public Integer getaccNo()
	{
		return accNo;
	}
	public void setaccNo(Integer accNo)
	{
	this.accNo=accNo;
	}

	public Double getbalance()
	{
		return balance;
	}
	public void setbalance(Double balance)
	{
	this.balance=balance;
	}

	public Double getannualInterestRate()
	{
		return annualInterestRate;
	}
	public void setannualInterestRate(Double annualInterestRate)
	{
	this.annualInterestRate=annualInterestRate;
	}
	
	void printInfo()
	{
	System.out.println("Customer id :"+accNo);
	System.out.println("The annual interest rate :"+annualInterestRate);
	System.out.println("The balance :"+balance);
	}
}
class Checkings extends Account
{
	Double withdraw;
	
	Checkings()
	{
		super();
	}
	
	public Double getwithdraw()
	{
		return withdraw;
	}
	public void setwithdraw(Double withdraw)
	{
	this.withdraw=withdraw;
	}
	
	void printInfo()
	{
	System.out.println("Withdraw :"+withdraw);
	super.balance=super.balance-withdraw;
	System.out.println("Checking balance after withdraw :"+balance);
	}
}
class Savings extends Checkings
{
	Double deposit;
	
	Savings()
	{
		super();
	}
	
	public Double getdeposit()
	{
		return deposit;
	}
	public void setdeposit(Double deposit)
	{
	this.deposit=deposit;
	}
	
	void printInfo()
	{
	System.out.println("Deposited :"+deposit);
	super.balance=super.balance+deposit;
	System.out.println("Saving balance after deposit :"+balance);
	}
}
class BankMainAccount 
{
	public static void main(String... args) throws Exception
	{
	Account acc=new Account();
	Double balance=1000.0;
	acc.setbalance(balance);

	Checkings chk=new Checkings();
	chk.setbalance(balance);
	chk.setwithdraw(new Double(250));
	chk.printInfo();

	Savings sa=new Savings();
	sa.setbalance(balance);
	sa.setdeposit(new Double(750));
	
	sa.printInfo();
	}