package week6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	// creates a list of cards
	List<Card> cards = new ArrayList<Card>();
	
	Deck() {
	// creates lists of suits and numbers
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] numbers = {"Two", "Three", "Four", "Five", "Six",
				"Seven", "Eight", "Nine", "Ten", "Jack", "Queen",
				"King", "Ace"};
		
		//creates the deck using an enhanced for loop
		for (String suit : suits) {
			int count = 2;
			for (String number : numbers) {
				Card card = new Card(number, suit, count);
				this.cards.add(card);
				count++;
			}
		}
	}
	
		public List<Card> getCards(){ //names list of cards getCards()
			return cards;
		}
		public void shuffle() {//essentially shuffles the deck
			Collections.shuffle(this.cards);
		}
		public Card draw() {//draws a card from the first position and removes it from the deck
			Card card = this.cards.remove(0);
			
			return card;
			
		}
		
		
				
}