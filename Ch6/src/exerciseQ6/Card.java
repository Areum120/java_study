package exerciseQ6;

public class Card {

    public static int serialNum=10000;
    public int cardNum;

    public Card(){
        serialNum++;
        cardNum = serialNum;
    }

    public int getCardNum() {
        return cardNum;
    }

    public void setCardNum(int cardNum){
        this.cardNum = cardNum;
    }
}
