package ideclarewar;

public class Card {
	private String rank;
	private String suit;
	private int value;

	static String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};
	static String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	
	public Card(String suit, String rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	public String toString() {
		return rank + " of " + suit;
	}
	
	public int getCardValue() {
		if(rank.equalsIgnoreCase(ranks[0])) {	//Ace
			value = 1;
		}
		else if (rank.equalsIgnoreCase(ranks[1])) {	//2
			value = 2;
		}
		else if (rank.equalsIgnoreCase(ranks[2])) {	//3
			value = 3;
		}
		else if (rank.equalsIgnoreCase(ranks[3])) {	//4
			value = 4;
		}
		else if (rank.equalsIgnoreCase(ranks[4])) {	//5
			value = 5;
		}
		else if (rank.equalsIgnoreCase(ranks[5])) {	//6
			value = 6;
		}
		else if (rank.equalsIgnoreCase(ranks[6])) {	//7
			value = 7;
		}
		else if (rank.equalsIgnoreCase(ranks[7])) {	//8
			value = 8;
		}
		else if (rank.equalsIgnoreCase(ranks[8])) {	//9
			value = 9;
		}
		else if (rank.equalsIgnoreCase(ranks[9])) {	//10
			value = 10;
		}
		else if (rank.equalsIgnoreCase(ranks[10])) {	//Jack
			value = 11;
		}
		else if (rank.equalsIgnoreCase(ranks[11])) {	//Queen
			value = 12;
		}
		else if (rank.equalsIgnoreCase(ranks[12])) {	//King
			value = 13;
		}
		
		return value;
	}
	
	public int compareTo(Card other) {
		return this.getCardValue() - other.getCardValue();
	}
}
