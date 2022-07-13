package academy.mindswap;

public class Main {
    public static void main(String[] args) {
        Players player = new Players ();
        Players player2 = new Players ();
        //System.out.println(Players.handWinner(player,player2));
        while (player.getGamesWon() < 3 && player2.getGamesWon() < 3){
            System.out.println(Players.whoIsTheWinner(Players.handWinner(player,player2)));
        }
        System.out.println(player.getName() + ": " + player.getGamesWon());
        System.out.println(player2.getName() + ": " + player2.getGamesWon());








    }

}
