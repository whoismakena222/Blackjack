public class Card {
    int cardNum;

    int points;

    String suitName;

    int suitNum;

    String cardName;

    public Card(int paramcardNum, int paramsuitNum) {
    cardNum = paramcardNum;
    suitNum = paramsuitNum;
    if(suitNum == 1){
        suitName = "spades";
    }
    if(suitNum == 2){
        suitName = "clubs";
    }
    if(suitNum == 3){
        suitName = "diamonds";
    }
    if(suitNum == 4){
        suitName = "hearts";
    }
    if (cardNum == 1){
        cardName = "ace";
    }
    if (cardNum == 2){
        cardName = "two";
    }
    if (cardNum == 3){
        cardName = "three";
    }
    if (cardNum == 4){
        cardName = "four";
    }
    if (cardNum == 5){
        cardName = "five";
    }
    if (cardNum == 6){
        cardName = "six";
    }
    if (cardNum == 7){
        cardName = "seven";
    }
    if (cardNum == 8){
        cardName = "eight";
    }
    if (cardNum == 9){
        cardName = "nine";
    }
    if (cardNum == 10){
        cardName = "ten";
    }
    if (cardNum == 11){
        cardName = "jack";
    }
    if (cardNum == 12){
        cardName = "queen";
    }
    if (cardNum == 13){
        cardName = "king";
    }


    }

    public void printCard(){
        System.out.println(cardName + " of " + suitName);
    }

}
