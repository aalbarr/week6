package week6;

import java.util.ArrayList;
import java.util.List;

public class Player {

	List<Card> hand = new ArrayList<Card>();
	
	Player(String name){
		this.score = 0;
		this.name = name;
	}
	
	int score;
	String name;
	
	public void describe() {
		//System.out.println();//this prints out player info and score
		for (Card card : this.hand) {
			card.describe();									//create for loop to describe cards in hand here
		}
	}
	public Card flip() {
		Card card = hand.get(0);// method for the "flip" flips the palyers first card
		hand.remove(0);
		return card;
	}
	public List<Card> draw(Deck deck){//method for the draw and adds to the hand
		Card drawnCard = deck.draw();
		hand.add(drawnCard);
		return hand;
	}
	public void incremnentScore() {  // increments the score
		this.score++;
	}
	public int getScore() {//literally gets the score
		return score;
	}
}