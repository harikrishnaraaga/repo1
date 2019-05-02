class I
{
	int i;
	void printNum()
	{
		System.out.println("valaue of i is :"+i);
	}
}
class J
{
	int j;
	void printNum()
	{
		System.out.println("value of j is :"+j);
	}
}
public class SeventhPro {
public static void main(String[] args) {
	I i = new I();
	i.i=34;
	i.printNum();
	J j = new J();
	j.j=45;
	j.printNum();
}
}
