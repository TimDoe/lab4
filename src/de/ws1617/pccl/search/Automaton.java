package de.ws1617.pccl.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import de.ws1617.pccl.fsa.Edge;
import de.ws1617.pccl.grammar.Grammar;
import de.ws1617.pccl.grammar.Lexicon;
import de.ws1617.pccl.grammar.NonTerminal;
import de.ws1617.pccl.grammar.Symbol;
import de.ws1617.pccl.grammar.Terminal;
import de.ws1617.pccl.search.Graph;

public class Automaton {

	private Stack<Hypothesis> agenda;

	private List<NonTerminal> nonTerminals;

	private NonTerminal startSymbol;

	private Graph graph;

	public Automaton(Grammar grammar, Lexicon lexicon, NonTerminal startSymbol) {
		super();

		this.startSymbol = startSymbol;
		// TODO create the union of the nonterminals from lexicon and grammar
         for(NonTerminal nt :  grammar.getNonTerminals()){
        	 nonTerminals.add(nt);
         }
         for(NonTerminal nt :  lexicon.getNonTerminals()){
        	 if(!nonTerminals.contains(nt))  nonTerminals.add(nt);
         }
         
		// TODO create a graph based on the grammar and lexicon
		// attention: how many states do you need ?
        
         graph = new Graph(nonTerminals.size() + 1);
         graph.setFinalState(0);
         int counter = 1; //start with 1, because 0 is finalstate
         
         //check in grammar
         HashSet<ArrayList<Symbol>> tmpsetgram = new HashSet<ArrayList<Symbol>>();
         HashSet<ArrayList<Terminal>> tmpsetlex = new HashSet<ArrayList<Terminal>>();
         for(NonTerminal nt : nonTerminals){
        	 tmpsetgram = grammar.getRuleForLHS(nt);
        	 for(ArrayList<Symbol> al : tmpsetgram){
        		 Edge tmpedge = new Edge((Terminal) al.get(0), nonTerminals.indexOf(al.get(1)));
        		 graph.addEdge(counter, tmpedge);
        	 } // end for al
        	 
        	 // check in lex
        	 tmpsetlex = lexicon.getRules(nt);
        	 for(ArrayList<Terminal> al : tmpsetlex){
        		 Edge tmpedge = new Edge((Terminal) al.get(0),0);
        		 graph.addEdge(counter, tmpedge);
        	 } // end for al
        	 counter++;
         } // end for nonTerminals 
         if (counter> nonTerminals.size()+1 ) System.out.println("should never happen");
	}

	/**
	 * Returns whether the give input is licensed by the grammar or not.
	 * 
	 * @param input
	 * @return
	 */
	public boolean recognize (String input) {

		// TODO implement me !
		ArrayList<Terminal> termlist = initialize(input);
		Hypothesis starthyp = new Hypothesis(nonTerminals.indexOf(startSymbol), 0);
		ArrayList<Hypothesis> hypolist = new ArrayList<Hypothesis>();
		hypolist.add(starthyp);
		while (!hypolist.isEmpty()) {
			//TODO
			graph.getAdjacent();
		}
			
		
		return false;
	}

	/**
	 * Generates all successors for a given hypothesis and input.
	 * 
	 * @param h
	 * @param input
	 * @return
	 */
	private ArrayList<Hypothesis> successors(Hypothesis h, ArrayList<Terminal> input) {

		// TODO implement me !
		
		return null;
	}

	/**
	 * Initializes the agenda and prepares the input by splitting it and making
	 * terminals from a string..
	 * 
	 * @param s
	 *            the input string to be processed.
	 * @return a list of terminals based on the input s split by whitespaces.
	 */
	private ArrayList<Terminal> initialize(String s) {

		// TODO implement me !
		Stack<Hypothesis> agenda = new Stack<Hypothesis>();
		while (!s.equals(null)) {
			String[] parts = s.trim().split("\\s+");
			agenda.push(parts); //?? TODO
		}
		return null;
	}

	/**
	 * Checks whether for a given hypothesis and input the automaton is in a
	 * final state and licenses the string. Two conditions have to be met: (a)
	 * all symbols have been processed (b) the current state is final.
	 * 
	 * @param h
	 * @param input
	 * @return
	 */
	public boolean isFinalState(Hypothesis h, List<Terminal> input) {
		// TODO implement me !
		if(input.equals(0) && h.equals(0)) {
		return true;
		}
		else
		return false;
	}

	/**
	 * Adds edges for the rules to the automaton based on the grammar and
	 * lexicon.
	 * 
	 * @param gr
	 *            a Grammar.
	 * @param lex
	 *            a Lexicon.
	 */
	public void addRules(Grammar gr, Lexicon lex) {

		// TODO implement me !

	}
}