package looping;

public class KeyWords {
	public static void main(String[] args) {
		
		//BREAK
	/*	for (int i=0; i<=10; i++)
		{
			if(i==5) //after that numbers to be removed
			{
				break;
			}
			System.out.println(i);
		}
		
		
		//CONTINUE
		
		for (int i=0; i<=10; i++)
		{
			if(i==5) //the particular number removed
			{
				continue;
			}
			System.out.println(i);
		}*/
		
		
		//Terminate
		
		for (int i=0; i<=10; i++)
		{
			if(i==7) //the particular number removed 
			{
				System.exit(12345);
			}
			System.out.println(i);
		}
	
	System.out.println("Success");//removed
	
	}
}


