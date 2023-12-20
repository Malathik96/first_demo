package casting;

public abstract class AbstractParent {
	
public void method1() {
 System.out.println("first");
}

abstract void method2();  // abstraction -mention abstract keyword
		
	public static void main(String[] args) {
		AbstractParent abs=new AbstractChild();
		abs.method1();
		abs.method2();
		
	}
	
	
}