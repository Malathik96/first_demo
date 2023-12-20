package constructor;

import java.text.Normalizer;

public class constructorchain1  extends constructorchain2 {
	public constructorchain1() 
	{
		super();
        System.out.println("non-parameterised");	      
	}

	public constructorchain1(int i)	
	{
	this();
    System.out.println("int-parameterised");	
	}
	
	public constructorchain1(String s) 
	{
    this(1);
    System.out.println("sting-parameterised");	
	}
	
	public constructorchain1(long l) 
	{
	this("Malathi");
    System.out.println("long-parameterised");	
    }
	
	public constructorchain1(char c) 
	{
    this(10000l);
    System.out.println("char-parameterised");	
	}
	
	private void normalm() 
	{
    System.out.println("normal method");
	}
	
	public static void main(String[] args) {
		
		constructorchain1 a=new constructorchain1('A');
		a.normalm();
		
	}

}
