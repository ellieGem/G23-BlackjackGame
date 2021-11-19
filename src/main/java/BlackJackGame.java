public class BlackJackGame {
    public static void main(String[] args) {
//        Deck deckCards = new Deck();
//        System.out.println(deckCards);
//        deckCards.shuffle();
//        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//        System.out.println(deckCards);
//
//        System.out.println(deckCards.getTopCard());

        BlackJackEngine engine = new BlackJackEngine();

        engine.start();
        engine.shuffle();
        engine.dealCards();
        engine.hitCheck();
//        Card card1 = new Card(Faces.Jack,Suits.DIAMONDS);
//        System.out.println(card1.getCardValue());
//        System.out.println(deckCards.getLength());

    }
}
//