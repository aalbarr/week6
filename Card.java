package week6;

public class Card {
	//creates names suits and value of cards
	String name;
	String suit;
	int value;
	
	Card(String name, String suit, int value){
		this.name = name;
		this.suit = suit;
		this.value = value;
	}
//getters and setter below. I created by using the automated way by clicking source above and using the getter and setter options
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public void describe() {
		System.out.println(this.name + " of " + this.suit + " --" + this.value);
		
	}

}
