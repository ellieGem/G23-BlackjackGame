public class Card {
    private Suits Suit ;
    private Faces Face;

    public Card (Faces face,Suits suit) {
        Suit = suit;
        Face = face;
    }

    @Override
    public String toString() {
        return this.Face+  " of " + this.Suit;
    }

    public int getCardValue(){
        return Face.getValue();
    }
}
