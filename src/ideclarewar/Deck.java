package ideclarewar;

import java.util.ArrayList;

public class Deck {
	private ArrayList<Card> deck;
	
	public Deck() {
		deck = new ArrayList<Card>(52);
		for(String s: Card.suits) {
			for(String r: Card.ranks) {
				deck.add(new Card(s,r));
			}
		}
	}
	
	public String toString() {
		StringBuffer buff = new StringBuffer();
		for (Card c: deck) {
			buff.append(c + "\n");
		}
		
		return buff.toString();
	}
	
	public Card dealCard() {
		return deck.remove((int)(Math.random() * deck.size()));
	}
	
	public void addCardToDeck(Card c) {
		deck.add(c);
	}
	
	public void removeCardFromDeck(Card c) {
		deck.remove(c);
	}
}
