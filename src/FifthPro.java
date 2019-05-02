class Degree
{
	void getDegree()
	{
		System.out.println("I got degree");
	}
}
	class UnderGraduate extends Degree
	{
		void getDegree()
		{
			System.out.println("I am an undergraduate");
		}
	}
	class PostGraduate extends Degree
	{
		void getDegree()
		{
			System.out.println("I am a postgraduate");
		}
	}
public class FifthPro
{
	public static void main(String[] args) {
		Degree d = new Degree();
		d.getDegree();
		UnderGraduate ug = new UnderGraduate();
		ug.getDegree();
		PostGraduate pg = new PostGraduate();
		pg.getDegree();
	}
}
