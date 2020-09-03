package ideclarewar;

import java.util.Scanner;

public class IDeclareWar {
	Player player1;
	Player player2;
	Scanner input = new Scanner(System.in);
	
	public IDeclareWar(String player1Name, String player2Name) {
		player1 = new Player(player1Name);
		player2 = new Player(player2Name);
	}
	
	public void playHand() {

		System.out.println("Name \t Coins");
		System.out.println(player1.getName() + "\t" + player1.getCoins());
		System.out.println("Name \t Coins");
		System.out.println(player2.getName() + "\t" + player2.getCoins());
		
		/**
		 * Amount of coins risked
		 * 1. Prompt player for bets
		 */
		riskCoins();
		
		/**
		 * Randomly selects a card from the player's decks
		 * 2. deal player1 card and store in a variable
		 * 3. deal playe2 card and store in a variable
		 */
		
		dealPlayersCards();
	}
	
	public void riskCoins() {
		System.out.print(player1.getName() + ", enter the amount of coins to risk: ");
		int risked1 = input.nextInt();
		player1.setRiskedCoins(risked1);
		
		System.out.print(player2.getName() + ", enter the amount of coins to risk: ");
		int risked2 = input.nextInt();
		player2.setRiskedCoins(risked2);
	}
	
	public void dealPlayersCards() {
		Card player1Card = player1.dealCard();
		Card player2Card = player2.dealCard();
		
		System.out.println(player1.getName() + "'s Card");
		System.out.println(player1Card.toString());
		System.out.println("-------------------------------");
		System.out.println(player2.getName() + "'s Card");
		System.out.println(player2Card.toString());
		System.out.println("-------------------------------");
		
		compareCards(player1Card, player2Card);
	}

	public void compareCards(Card player1Card, Card player2Card) {
		if (player1Card.getCardValue() > player2Card.getCardValue()) {	//player1 wins
			player1.addCoins(player2.getRiskedCoins());
			player2.subtractCoins(player2.getRiskedCoins());
			player1.addCard(player1Card);
			player1.addCard(player2Card);
			player2.removeCard(player2Card);
			System.out.println(player1.getName() + " wins!");
		}
		else if (player1Card.getCardValue() < player2Card.getCardValue()) {	//player2 wins
			player2.addCoins(player1.getRiskedCoins());
			player1.subtractCoins(player1.getRiskedCoins());
			player2.addCard(player2Card);
			player2.addCard(player1Card);
			player1.removeCard(player1Card);
			System.out.println(player2.getName() + " wins!");
		}
		else {
			System.out.println("Tied Round.");
		}
	}
}
