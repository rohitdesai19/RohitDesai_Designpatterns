package structural_design_pattern;

public abstract class classify {

	 protected StudentDetails s;
	   
	   protected classify(StudentDetails s){
	      this.s = s;
	   }
	   public abstract void details();	
}
