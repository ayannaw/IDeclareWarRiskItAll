package controller;

import ideclarewar.Card;

public interface IDeclareWarInterface {
	public void playHand();
	public void dealPlayersCards();
	public void compareCards(Card player1Card, Card player2Card);

}
