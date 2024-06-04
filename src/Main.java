public class Main {

    public Card[] deck;

    int p;

    public Player[] players; // make this an array

    public static void main(String[] args) {
        Main myMain = new Main();
    }
    public Main() {

        deck = new Card[52];

        int counter = 0;
        for (int s = 1; s <=4; s++) {
            for (int i = 1; i <= 13; i++) {
                Card c = new Card(i, s);
                deck[counter] = c;
                counter++;
            }
        }

        shuffle();
//        printDeck();

        players = new Player[4];

        for(int n = 0; n < 4; n++) {
            players[n] = new Player();

        }

        System.out.println("START");

        deal();


    }

    public void printDeck(){
        for (int i = 0; i <52; i++ ) {
            deck[i].printCard();
        }

    }


    public void shuffle(){
        for(int i = 0; i < 52; i++) {
            Card temp = deck[i];
            p = (int) (Math.random() * 52);
            deck[i] = deck[p];
            deck[p] = temp;
        }
    }

    public void deal(){
        int counter = 0;
        for(int i = 0; i < players.length; i++){
            for(int s = 0; s < player1.hand.length; s++)
            players[i].hand[s] = deck[counter];
            counter++;
        }
    players[0].printHand();

    }
}
