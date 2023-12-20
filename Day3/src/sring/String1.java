package sring;

public class String1 {
	public static void main(String[] args) {
		
		
		String a="Malathi";
		String b="malathi";
		
		//Length[1-n] 
		System.out.println(a.length());
		
		//equal
		System.out.println(a.equals(b));
		
		//equalsIgnorecase
		System.out.println(a.equalsIgnoreCase(b));
		
		//toUpperCase 
		System.out.println(a.toUpperCase());
		
		//toLowerCase
		System.out.println(a.toLowerCase());
		
		//Contains 
		System.out.println(a.contains("g"));
	
		
		//Index value[0-(n-1)]
		
		//charAt
		System.out.println(a.charAt(5));
		
		//indexOf
		System.out.println(a.indexOf("a"));
		
		//lastIndexOf 
		System.out.println(a.lastIndexOf("a"));
		
		//concat()
		System.out.println(a.concat(b));
		
		String c="Mahesh";
		String d="Mahesh";
		
		//contentEquals()
		System.out.println(c.contentEquals(d));
		
		//replace --single charector
		String str="Malathi";
		System.out.println(str.replace('a', 'x'));
		
		//substring --extract substring of the main string
		String n="Welcome";
		System.out.println(n.substring(0,3)); //0 index , 3 elemt
	}

}
