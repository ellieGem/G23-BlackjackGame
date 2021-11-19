import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlackJackEngine {
    private int numberOfPlayers = 0;
    private Deck deckOfCards = new Deck();
    List<Player> players = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

//    public void gameLoop(){
//
//    }
    public void start(){
        System.out.println("Welcome to G23 BlackJack Game");
        do{
            System.out.println("How many players are playing");
            numberOfPlayers = input.nextInt();
        }while(numberOfPlayers > 6 || numberOfPlayers < 0);
        for(int i = 0; i < numberOfPlayers;i++){
            System.out.println("What is the name of player "+(i+1));
            String name = input.next();
            Player player = new Player(name);
            players.add(player);
            System.out.println(players.get(i).getName());
        }
//        System.out.println(play);

//        System.out.println(deckOfCards);
//        deckOfCards.shuffle();
//        System.out.println("shuffle "+deckOfCards);
//        dealCards();
//        System.out.println("After Deal "+deckOfCards);
//        gameLoop();
    }

    public void shuffle(){
        deckOfCards.shuffle();
    }

    public void dealCards(){
        for(int deals = 0; deals<2; deals++){
            for (int i = 0; i < numberOfPlayers; i++){
                players.get(i).addCard(deckOfCards.getTopCard());
                System.out.println(players.get(i).getName()+" was dealt with " +players.get(i).getHands()+ " with a total face value of "+ players.get(i).getTotalFaceValue());
            }
        }
    }

    public void hit(Player player){
        player.addCard(deckOfCards.getTopCard());
    }

    public void hitCheck(){
        for (int i = 0; i < numberOfPlayers;i++){
            if(players.get(i).getTotalFaceValue() < 17){

                System.out.println(players.get(i).getName()+ " is hitting");
                System.out.println("");
                hit(players.get(i));
                System.out.println(players.get(i).getName()+" was dealt with " + players.get(i).getHands()+ " with a total face value of "+ players.get(i).getTotalFaceValue());
                System.out.println("");

                if(players.get(i).getTotalFaceValue() < 17){
                    System.out.println(players.get(i).getName()+ " is hitting");
                    System.out.println("");
                    hit(players.get(i));
                    System.out.println(players.get(i).getName()+" Your current hands " + players.get(i).getHands()+ " with a total face value of "+ players.get(i).getTotalFaceValue());
                    System.out.println("");
                }

                else if(players.get(i).getTotalFaceValue() > 21){
                    System.out.println("Sorry "+ players.get(i).getName()+" you got bust and you're out of the game");
                    System.out.println("");
                }

                else {
                    System.out.println("Sorry "+ players.get(i).getName()+" you can't hit, You stick");
                    System.out.println("");
                    System.out.println(players.get(i).getName()+" Your current hands " + players.get(i).getHands()+ " with a total face value of "+ players.get(i).getTotalFaceValue());
                    System.out.println("");
                }
            }

            else if(players.get(i).getTotalFaceValue() > 21){
                System.out.println("Sorry "+ players.get(i).getName()+" you got bust and you're out of the game");
                System.out.println("");
            }

            else {
                System.out.println("Sorry "+ players.get(i).getName()+" you can't hit, You stick");
                System.out.println("");
                System.out.println(players.get(i).getName()+" Your current hands" + players.get(i).getHands()+ " with a total face value of "+ players.get(i).getTotalFaceValue());
                System.out.println("");
            }
        }
    }

//    public void hitOrStick(){
//        String command;
//        for(int i = 0; i < numberOfPlayers;i++){
////            do{
//                System.out.println(players.get(i).getName()+" was dealt with " +players.get(i).getHands()+ " with a total face value of "+ players.get(i).getTotalFaceValue());
//                do{
//                    System.out.println(players.get(i).getName()+" will you Hit or Stick");
//                    command = input.next().toLowerCase();
//                }while(!(command.equals("hit") || command.equals("stick")));
//                if(command.equals("hit")){
//                    players.get(i).addCard(deckOfCards.getTopCard());
//                    System.out.println(players.get(i).getName()+" was dealt with " +players.get(i).getHands()+ " with a total face value of "+ players.get(i).getTotalFaceValue());
//                }
////            } while(!command.equals("stick") && players.get(i).getTotalFaceValue() <= 21);
//        }
//    }

}
