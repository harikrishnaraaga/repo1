import java.util.Scanner;

public class FourthPro {
	static String name;
	static int age;
	static String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	FourthPro(String name,int age,String address)
	{
		name="unknown";
		age=0;
		address="not available";
	}
	FourthPro()
	{
		
	}
	/*void setInfo(String name,String address)
	{
		System.out.println("name is :"+name);
		System.out.println("address is :"+address);
	}*/
	void takes(String name,int age,String address)
	{
		
		this.name=name;
		this.age=age;
		this.address=address;
		System.out.println("Details saved..!");
	}
	void display()
	{
		System.out.println("name is :"+name);
		System.out.println("age is :"+age);
		System.out.println("address is :"+address);
	}
	public static void main(String... args) {
		Scanner src = new Scanner(System.in);
		FourthPro fp = null;
		for(int i = 1;i<=11;i++)
		{
			if(i<11)
			{
				fp = new FourthPro();
				System.out.println("enter name of student :"+i);
				String name=src.next();
				fp.setName(name);
				System.out.println("enter age of the student :"+i);
				int age=src.nextInt();
				fp.setAge(age);
				System.out.println("enter address of the student :"+i);
				String address=src.next();
				fp.setAddress(address);
				fp.takes(name, age, address);	
			}
			else
			{
				fp.display();
				break;
			}
		}
	}
}
