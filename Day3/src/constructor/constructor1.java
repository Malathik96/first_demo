package constructor;

public class constructor1 {
	
	public constructor1() 
	{
		System.out.println("Employee Dtails");
	}
	public constructor1(int id)
	{
		System.out.println("Id : " +id);
	}
	
	public constructor1(String name)
	{
		System.out.println("Name :"+name);
	}

	public constructor1(char grade)
	{
		System.out.println("first grade :"+grade);
	}
	
	public constructor1(long sno)
	{
		System.out.println("enter the sno:"+sno);
	}

	public static void main(String[] args) {
		new constructor1();
		new constructor1(100);
		new constructor1("malathi");
		new constructor1('A');	
		new constructor1(100000l); //long mentioned L keyword

	}

}
