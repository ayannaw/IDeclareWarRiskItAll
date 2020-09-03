package ideclarewar;

import java.util.Scanner;

public class PlayIDeclareWar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("I DECLARE WAR & RISK IT ALL");
		System.out.println("******************************");
		System.out.println("Player 1, Enter your name: ");
		String player1 = input.next();
		System.out.println("Player 2, Enter your name: ");
		String player2 = input.next();
		
		//constructor for game 
		IDeclareWar game = new IDeclareWar(player1, player2);
		
		while((game.player1.getCoins() > 0 && game.player2.getCoins() > 0)) {
			game.playHand();
		}
	}

}
