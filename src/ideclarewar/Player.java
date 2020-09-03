package ideclarewar;

public class Player {
	private String name;
	private int coins;
	private int riskedCoins;
	Deck playerDeck;
	int value;
	
	public Player(String name) {
		this.name = name;
		coins = 5000;
		playerDeck = new Deck();
		riskedCoins = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public int getCoins() {
		return coins;
	}
	
	public void setRiskedCoins(int riskedCoins) {
		this.riskedCoins = riskedCoins;
	}
	
	public int getRiskedCoins() {
		return riskedCoins;
	}
	
	public void addCoins(int risked) {
		coins = coins + risked;
	}
	
	public void subtractCoins (int risked) {
		coins = coins - risked;
	}
	
	public Card dealCard() {
		return this.playerDeck.dealCard();
	}
	
	public void addCard(Card c) {
		playerDeck.addCardToDeck(c);
	}
	
	public void removeCard(Card c) {
		playerDeck.removeCardFromDeck(c);
	}

}
