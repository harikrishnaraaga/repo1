class Bank
{
	int balance;
	void getBalance()
	{
		System.out.println("balance is :"+balance+"$");
	}
}
class Bank1 extends Bank
{
	void getBalance()
	{
		balance=balance+1000;
		System.out.println("balance of Bank1 is :"+balance+"$");
	}
}
class Bank2 extends Bank
{
	void getBalance()
	{
		balance = balance+1500;
		System.out.println("balance of Bank2 is :"+balance+"$");
	}
}
class Bank3 extends Bank
{
	void getBalance()
	{
		balance = balance+2000;
		System.out.println("Balance of Bank3 is :"+balance+"$");
	}
}
public class SixthPro {
public static void main(String[] args) {
	Bank b = new Bank();
	b.getBalance();
	Bank1 b1 = new Bank1();
	b1.getBalance();
	Bank2 b2 = new Bank2();
	b2.getBalance();
	Bank3 b3 = new Bank3();
	b3.getBalance();
}
}
