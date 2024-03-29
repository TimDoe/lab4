package de.ws1617.pccl.app;

import java.io.IOException;

import de.ws1617.pccl.grammar.Grammar;
import de.ws1617.pccl.grammar.GrammarUtils;
import de.ws1617.pccl.grammar.Lexicon;
import de.ws1617.pccl.grammar.NonTerminal;
import de.ws1617.pccl.search.Automaton;

public class Main {

	public static void main(String[] args) {

		// read runtime arguments
		try { 
			Grammar grammar = GrammarUtils.readGrammar(args[0]);
			Lexicon lexicon = GrammarUtils.readLexicon(args[1]);
			NonTerminal startSymbol = new NonTerminal(args[2]);
			String input = args[3];
			// TODO create grammar, lexicon, start symbol
			// TODO create an Automaton object
			Automaton automaton = new Automaton(grammar, lexicon, startSymbol);
			// TODO print out whether the given input is in the language
			if (automaton.recognize(input) == true) {
			System.out.println("The given input is in the language.");
			}
			else {
				System.out.println("The given input is not in the language.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
