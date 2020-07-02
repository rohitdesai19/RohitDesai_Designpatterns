package behavioural_design_pattern;

public class InitialState implements State{

	public void action(StateManager manage)
	{
		System.out.print("Initial state is instantiated");
		manage.setState(this);
	}
	public String toString(){
	    return (" in the Initial State");
	 }
}
