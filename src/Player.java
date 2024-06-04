public class Player {
 int points;
 public Card[] hand;



 public Player(){
     hand = new Card[2];

 }

 public void printHand(){
     for(int i = 0; i < hand.length; i++){
         hand[i].printCard();
     }
    }

}
