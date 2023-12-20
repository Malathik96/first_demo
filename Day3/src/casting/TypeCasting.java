package casting;

public class TypeCasting {
	
	public static void main(String[] args) {
		
		
		byte a=100;                //widening (L to H)
		short b=a;
		System.out.println("byte to short:" +b); 
		
		short i=127;               //widening (L to H)
		int j=i;
		System.out.println("short to int: "+j);  
		
		int k=108;                //widening (L to H)
		long l=k;
		System.out.println("int to long:  "+l);  
		
		
		long c=111;               //Narrowing (H to L)
		int d= (int)c;
		System.out.println("long to int:  "+c);
		
		
		long e=127;               //Narrowing (H to L)
		byte f=(byte)e;
        System.out.println("long to byte: "+f);	
        
        int g=333;                //Narrowing (H to L)
        short h=(short) g;
        System.out.println("int to short: "+h);
        
        int m=126;               //Narrowing (H to L) only covert to within limit
        byte n=(byte) m;
        System.out.println("int to byte:  "+n);
        
        }

}
