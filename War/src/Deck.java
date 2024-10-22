import java.util.Random;

public class Deck {
	private Card[] cards;
	private static Random rand = new Random();
	
	
	public Deck() {
		this.cards = new Card[52];
		int index = 0;
		for(int suit = 0; suit <= 3; suit++) {
			for(int rank = 0; rank < 13; rank++) {
				cards[index] = new Card(rank, suit);
				index++;
			}
		}
	}
	
	public Deck(int n) {
		this.cards = new Card[n]; 
	}
	
	public Deck subdeck(int low, int high) {
		Deck sub = new Deck(high - low + 1);
		for(int i = 0; i < sub.cards.length; i++) {
			sub.cards[i] = this.cards[low + i];
		}
		return sub;
	}
	
	public Card[] getCards() {
		return this.cards;
	}
	
	public void shuffle() {
		for(int i = 0; i < cards.length; i++) {
			int num = randomInt(i, cards.length);
			swapCards(i, num);
		}
	}
	
	public void selectionSort() {
		//find lowest card at or to the right of i
		//swap that card with the card at i
		for(int i = 0; i < cards.length; i++) {
			int lowest = indexLowest(i, cards.length);
			swapCards(i, lowest);
		}
	}
	
	private int indexLowest(int low, int high) {
		//find the lowest card between low and high
		int lowest = low;
		for (int i = low; i < high; i++) {
			if(cards[i].compareTo(cards[lowest]) < 0) {
				lowest = i;
			}
		}
		return lowest;
	}
	
	private static int randomInt(int low, int high) {
		int num = rand.nextInt(high - low) + low;
		return num;
	}
	
	private void swapCards(int i, int j) {
		Card temp = cards[i];
		cards[i] = cards[j];
		cards[j] = temp;
	}
	
	public void print() {
		for(Card card : this.cards) {
			System.out.println(card);
		}
	}
	
	

}
