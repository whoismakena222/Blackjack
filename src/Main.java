public class Main {

    public Card[] deck;
    public static void main(String[] args) {
        Main myMain = new Main();
    }
    public Main() {

        deck = new Card[52];

        for (int s = 1; s <=4; s++) {
            for (int i = 1; i <= 13; i++) {
                Card c = new Card(i, s);
                deck[i - 1] = c;
                deck[i - 1].printCard();
            }
        }
    }

    public void shuffle(){

    }

    public void deal(){

    }
}
