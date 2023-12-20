package Interface;

public class parent3 implements parent1,parent2{

	@Override
	public void M3() {
    System.out.println("M3");		
	}

	@Override
	public void M4() {
		System.out.println("M4");		

	}

	@Override
	public void M1() {
		System.out.println("M1");		
		
	}

	@Override
	public void M2() {
		System.out.println("M2");		
		
	}
	
	public static void main(String[] args) {
		parent3 p3=new parent3();
		p3.M1();
		p3.M2();
		p3.M3();
		p3.M4();
		
	}

}
