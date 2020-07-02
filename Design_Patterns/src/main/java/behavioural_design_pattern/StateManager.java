package behavioural_design_pattern;

public class StateManager {
	private State state;

	StateManager()
	{
		state=null;
	}
	public void setState(State state){
	    this.state = state;		
	 }

	 public State getState(){
	    return state;
	 }
}
