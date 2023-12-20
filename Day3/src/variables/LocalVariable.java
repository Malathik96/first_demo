package variables;

public class LocalVariable { //local variable 
	
	private void test1() {

		int a=1;
		a=100;
		System.out.println("Malathi :"+a);
		
		String name="Mal";
		a=200;
		System.out.println("Mahesh :"+a);
		
	}

	private void test2() {
        int b=10;
        b=300;
        System.out.println("Mano :"+b);
	}
	
	public static void main(String[] args) {
		
		LocalVariable l=new LocalVariable();
		l.test1();
		l.test2();
	}
}


