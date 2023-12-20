package constructor;

public class constructorchain2 {
	
	public constructorchain2() 
	
	{
		this(10);
    System.out.println("non-parameteraised");	
    }

	public constructorchain2(int a) 
	{
		this("yes");
    System.out.println("chain1");	
    }
	
	public constructorchain2(String b) 
	{
		this.normal();
    System.out.println("chain2");	
    }
	
	private void normal() 
	{
    System.out.println("normal");
	}
	
	/*public static void main(String[] args) {
		new constructorchain2();
	}*/
}
