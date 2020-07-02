package behavioural_design_pattern;

public class IntermediateState implements State{

	public void action(StateManager manage) {
	      System.out.print("Intermediate state is Confirmed");
	      manage.setState(this);	
	   }

	   public String toString(){
	      return " in the Intermediate state";
	   }
}
