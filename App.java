package week6;

public class App {

	public static void main(String[] args) {
		
		Deck deck = new Deck();   //instantiates new deck
		Player player1 = new Player("John");   //instantiates player one and gives name John
		Player player2 = new Player("Deere");//isnantiates player tow and gives name Deere
		deck.shuffle();//shuffles the deck
		
		for (int i = 0; i < 52; i++) { //deals cards to each player
			if (i % 2 == 0) {
				player1.draw(deck);
			}else {
				player2.draw(deck);
			}
		}
		
		for (int i = 0; i < 26; i++) {  //players flip a card
			Card player1Hand = player1.flip();
			Card player2Hand = player2.flip();
			if (player1Hand.getValue() > player2Hand.getValue()) {//gets the value of the drawn card to each player and determines which is higher
				player1.incremnentScore();				//increments player ones score if its higher
			}else {
				player2.incremnentScore();  // increments palyer twos score if its higher
			}
		}

		System.out.println("John's score is : " + player1.getScore());  //prints player ones score
		System.out.println("Deere's score is : " + player2.getScore());//prints player twos score
		if (player1.getScore() > player2.getScore()) {  //determines whos score is higher
			System.out.println("John is the winner!");// if player one is higher this prints
		}else if (player2.getScore() > player1.getScore()) {//if palyer two is higher this prints
			System.out.println("Deere is the winner!");
		}else {
			System.out.println("The game is a tie.");  //prints if its a tie
		}
	}

}
