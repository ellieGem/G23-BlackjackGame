import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> handOfCards = new ArrayList<>();
    private int totalFaceValue = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCard(Card card){
        handOfCards.add(card);
//        System.out.println(handOfCards);
        this.totalFaceValue += card.getCardValue();
//        System.out.println(totalFaceValue);
    }

    public  List<Card> getHands(){
        return handOfCards;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalFaceValue(){
        return this.totalFaceValue;
    }

}
