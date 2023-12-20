package variables;

public class ClassVariable { //class variable
	
	int c;
	
	private void test1() {
    c=11;
    System.out.println("test1 :"+c);
	}

	private void test2() {
    c=12;
    System.out.println("test2 :"+c);
	}
		
	public static void main(String[] args) {
		
		ClassVariable v=new ClassVariable();
		
		System.out.println("class variable :"+v.c);
		v.test1();
		System.out.println("class variable :"+v.c);
		v.test2();
		System.out.println("class variable :"+v.c);

	}
}

