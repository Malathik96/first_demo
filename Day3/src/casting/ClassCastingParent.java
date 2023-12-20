package casting;


public class ClassCastingParent {
	
	public void same_method() {
		System.out.println("first");
	}
	
	public void other_method() {
System.out.println("third");
	}
	
	public static void main(String[] args) {
		ClassCastingParent pr=new ClassCastingChild();
		pr.same_method();
		pr.other_method();
		
				
	}
	
	
}

 