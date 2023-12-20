package casting;

public class ClassCastingChild extends ClassCastingParent  {
	@Override

	public void same_method() {
		super.same_method();
      System.out.println("second");
	}
	
	@Override
	public void other_method() {
		super.other_method();
		System.out.println("fourth");
	}
	}
     
    
   	



