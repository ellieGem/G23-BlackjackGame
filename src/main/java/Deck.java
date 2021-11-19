import java.util.Arrays;
import java.util.Random;

public class Deck {
    private Card[] deck;
    private int topOfDeck = 0;
    private int totalNumberOfCard = 52;

    public Deck(){
        deck = new Card[totalNumberOfCard];
//        for(Suits suit: Suits.values() ){
//            fo
//        }
        Suits[] suits = {
                Suits.CLUBS,Suits.HEARTS,Suits.DIAMONDS,Suits.SPADES
        };
        Faces[] faces = {
                Faces.Two,Faces.Three,Faces.Four,Faces.Five,
                Faces.Six,Faces.Seven,Faces.Eight,Faces.Nine,
                Faces.Ten,Faces.Jack,Faces.Queen,Faces.King, Faces.Ace
        };
        for(int count = 0; count< deck.length;count++){
            deck[count] = new Card(faces[count % 13],suits[count/13]);
        }
    }

    public Card[] getDeck() {
        return deck;
    }

    public int getLength(){
        return deck.length;
    }

    private void swapCard(int indexOfCard,int indexOfRandom){
        Card card;
        card = deck[indexOfCard];
        deck[indexOfCard] = deck[indexOfRandom];
        deck[indexOfRandom]= card;
    }

    public void shuffle(){
        Random random = new Random();
        for (int i = 0; i < deck.length; i++){
            swapCard(i, random.nextInt(totalNumberOfCard));
        }
    }

    public Card getTopCard(){
        /*
        Implement an exception for invalid deck index
         */
        return deck[topOfDeck++];
    }

    @Override
    public String toString() {
        return "Deck" +
                "deck=" + Arrays.toString(deck);
    }
}
