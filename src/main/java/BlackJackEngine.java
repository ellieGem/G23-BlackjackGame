import java.util.ArrayList;
import java.util.List;

public class BlackJackEngine {
    private int numberOfPlayers = 3;
    private Deck deckOfCards;
    List<Player> players = new ArrayList<>();
    public void dealCards(){
        for(int deals = 0; deals<2; deals++){
            for (int i = 0; i < numberOfPlayers; i++){
                players.get(i).addCard(deckOfCards.getTopCard());
//                System.out.println(players.get(i));
            }
        }
//        System.out.println(deckOfCards.getTopCard());
    }
    public void gameLoop(){

    }
    public void start(){
        System.out.println("Welcome to G23 BlackJack Game");
        deckOfCards = new Deck();

        for(int i = 0; i < numberOfPlayers;i++){
            Player player = new Player("Michael");
            players.add(player);
        }

        System.out.println(deckOfCards);
        deckOfCards.shuffle();
        System.out.println("shuffle "+deckOfCards);
        dealCards();
        System.out.println("After Deal "+deckOfCards);
        gameLoop();
    }
}
