package de.ws1617.pccl.search;

public class Hypothesis {

	// TODO implement me !
	public int state;
	public int inputIndex;

	public Hypothesis() {
		
	}
	
	public Hypothesis(int state, int inputIndex) {
		
		this.state = state;
		this.inputIndex = inputIndex;
	}
	public int getState(){
		return state;
	}
	public int getIndex(){
		return inputIndex;
	}
}
