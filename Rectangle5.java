class Rectangle5
{
	int s1;
	int s2;

	Rectangle5(int s1,int s2)
	{
		this.s1=s1;
		this.s2=s2;
	}
	void area()
	{
		int area=s1*s2;
		System.out.println("area of rectangle is :"+area);
		int perimeter = 2*(s1+s2);
		System.out.println("perimeter of rectangle is :"+perimeter);
	}
	public static void main(String[] args)
	{
		Rectangle5 r1 = new Rectangle5(4,5);
		r1.area();

		Rectangle5 r2 = new Rectangle5(5,8);
		r2.area();
	}
}
