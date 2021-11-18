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
        this.totalFaceValue += card.getCardValue();
    }

//    public int getTotalFaceValue(){
//
//    }
}
