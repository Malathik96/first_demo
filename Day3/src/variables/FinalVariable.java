package variables;

public class FinalVariable {
	
	final float mark=100;
	
	private void m1() {
		System.out.println("M1 :"+mark);
	}
	
	public static void main(String[] args) {
		FinalVariable f=new FinalVariable();
		f.m1();
		System.out.println("final variable :"+f.mark);
	}

}
