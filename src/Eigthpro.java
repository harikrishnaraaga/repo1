class Parent
{
	static void print()
	{
		System.out.println("parent");
	}
}
class Child extends Parent
{
	static void print()
	{
		System.out.println("child");
	}
}
public class Eigthpro {
public static void main(String[] args) {
	Parent p = new Parent();
	p.print();
	Child ch = new Child();
	ch.print();
	Parent p1 = new Child();
	p1.print();
}
}
