package de.ws1617.pccl.search;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import de.ws1617.pccl.fsa.Edge;
import de.ws1617.pccl.grammar.Terminal;

public class Graph {

	// TODO add instance fields here 
	private ArrayList <HashSet<Edge>> adj;
	//for each state indicate whether it is final
	private boolean[] finalStates;
	//number of vertices
	private final int v;
	/**
	 * Initialize the adjacency and final state array.
	 * 
	 * @param v
	 *            the number of vertices in the graph.
	 */
	public Graph(int v) {
		// TODO implement me !
		if(v < 0) throw new IllegalArgumentException("Cannot have a negative number of vertices.");
		this.v = v;
		adj = (ArrayList <HashSet<Edge>>) new ArrayList[v];
	}
	//add an edge from a vertex
	public void addEdge(int from, Edge edge) {
		// TODO implement me !
	}
	//all edges from this state with this terminal
	public HashSet<Edge> getAdjacent(int from) {

		// TODO implement me !
		return null;
	}

	/**
	 * Returns all edges that point from a certain state to adjacent states and can be reached when consuimg the given {@link Terminal}.
	 * 
	 * @param from the current state.
	 * @param toConsume the next terminal to consume.
	 * @return a set of edges adjacent to the from state reachable via the terminal toConsume.
	 */
	public HashSet<Edge> getAdjacent(int from, Terminal toConsume) {
	
		// TODO implement me !
		return null;
	}

	/**
	 * Make a certain state at the given index a final state.
	 * @param index 
	 */
	public void setFinalState(int index) {
		// TODO implement me !
	}

	/**
	 * Checks whether the state at the given index is a final state.
	 * @param index
	 * @return
	 */
	public boolean isFinalState(int index) {
		// TODO implement me !
		return false;
	}
}