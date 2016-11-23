 package de.ws1617.pccl.fsa;

import de.ws1617.pccl.grammar.Terminal;

/**
 * A directed edge (transition) between states.
 *
 */

public class Edge 
{
	Terminal toConsume;
	public int goal;
	public Edge(Terminal aTerminal, int aGoal) 
	{
		toConsume = aTerminal;
		goal = aGoal;
	}
	
	public int transition(Terminal aTerminal)
	{
		
		if (toConsume.equals(aTerminal))
		{
			return goal;
		}
		else return -1;
	}
	
	public Terminal getTerminal() {
		
		return toConsume;
	}
}
