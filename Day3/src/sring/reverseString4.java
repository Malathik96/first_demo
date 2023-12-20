package sring;

public class reverseString4 {
	
	public static void main(String[] args) {
		
		String str="MADAM";
		String rev="";
		char ch;
		
		//int len=str.length();
		
		for(int i = str.length()-1;i>=0;i--) 
		{
		ch=str.charAt(i);
		rev=rev+ch;
		}
		System.out.println(rev);

		if(str.equals(rev))
		{
			System.out.println("String is palindrom");
		}
		else
		{
		System.out.println("String is not palindrom");
		}		
	}
        
}
