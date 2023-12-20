package variables;

public class StaticVariable {
	
	static String name;
	
	private void m1() {
         name ="Malathi";
         name="Mahi";
         System.out.println("method1 :"+name);
	}

	public static void main(String[] args) {
		StaticVariable s=new StaticVariable();
		
		System.out.println(name);
		s.m1();
		
	}
}
