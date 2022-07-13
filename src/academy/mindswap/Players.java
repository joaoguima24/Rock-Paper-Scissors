package academy.mindswap;
public class Players {

    private static int gamesPlayed;
    private static int numberOfPlayersCreated = 1;

    private String name;
    public int typeOfHand;
    private int gamesWon;

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public String getName() {
        return name;
    }

    public Players (){
        this.name = "Player" + numberOfPlayersCreated;
        numberOfPlayersCreated ++;
        this.gamesWon = 0;
        this.typeOfHand = randomNumber();
    }

    public Players (String name, int typeOfHand){
        this.name = name;
        numberOfPlayersCreated ++;
        this.gamesWon = 0;
        this.typeOfHand = typeOfHand;
    }
    public String getTypeOfHand() {
        switch (typeOfHand){
            case 1:{
                return "Rock";
            }
            case 2:{
                return "Paper";
            }
        }return "Scissors";
    }

    public void GamesPlayed(int gamesPlayed) {
        Players.gamesPlayed ++;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon += gamesWon;
    }

    public int getGamesWon() {
        return gamesWon;
    }



    public static int randomNumber(){
        return (int) (Math.random()* (3 - 1 + 1) + 1);
    }

    public static String whoIsTheWinner (int handWinner){
        if (handWinner == 0) {
            return "It's Draw" ;
        }
        if (handWinner == 1) {
            return "Winner 1";
        } return "Winner 2";
    }

    

    public static int handWinner(Players player , Players player2) {
        player.GamesPlayed(1);
        player2.GamesPlayed(1);
        player.typeOfHand = randomNumber();
        System.out.println(player.name + " had: " + player.getTypeOfHand());
        System.out.println(player2.name + " had: " + player2.getTypeOfHand());
        if (player.typeOfHand == player2.typeOfHand) {
            return 0;
        }
            switch (player.typeOfHand + player2.typeOfHand) {
                case 3 -> {
                    if (player.typeOfHand == 2) {
                        return 1;
                    }
                    return 2;
                }
                case 4 -> {
                    if (player.typeOfHand == 1) {
                        return 1;
                    }
                    return 2;
                }
                case 5 -> {
                    if (player.typeOfHand == 3) {
                        return 2;
                    }
                    return 1;
                }
            }
        return 0;
    }
        /*if (player.typeOfHand == player2.typeOfHand) {
            System.out.println("It's a draw");
            return 0;
        }
        if (player.typeOfHand == 1 && player2.typeOfHand == 2){
            System.out.println("Player 2 Won");
            return 2;
        }
        if (player.typeOfHand ==1){
            System.out.println("Player 1 Won");
            return 1;
        }
        if (player.typeOfHand == 2 && player2.typeOfHand == 3){
            System.out.println("Player 2 Won");
            return 2;
        }
        if (player.typeOfHand ==2){
            System.out.println("Player 1 Won");
            return 1;
        }
        if (player.typeOfHand == 3 && player2.typeOfHand == 1){
            System.out.println("Player 2 Won");
            return 2;
        } System.out.println("Player 1 Won");
        return 1;

         */

    }

