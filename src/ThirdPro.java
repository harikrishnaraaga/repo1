import java.util.Scanner;


public class ThirdPro {
	int length;
	int breadth;
	int side;
	void area(int length,int breadth)
	{
			this.length=length;
			this.breadth=breadth;
			int area = length*breadth;
			System.out.println("area of rectangle is :"+area);
	}
	void area(int side)
	{
		this.side=side;
		int area=side*side;
		System.out.println("are of square is :"+area);
	}
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		ThirdPro tp = new ThirdPro();
		System.out.println("Enter length of rectangle");
		int length = src.nextInt();
		System.out.println("Enter breadth of rectangle");
		int breadth = src.nextInt();
		tp.area(length, breadth);
		System.out.println("Enter side of square");
		int side = src.nextInt();
		tp.area(side);
	}
}
