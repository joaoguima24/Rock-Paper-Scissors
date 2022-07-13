package academy.mindswap;

public class Main {
    public static void main(String[] args) {
        Players player = new Players ();
        Players player2 = new Players ();
        //System.out.println(Players.handWinner(player,player2));
        System.out.println(Players.whoIsTheWinner(Players.handWinner(player,player2)));
        System.out.println(Players.whoIsTheWinner(Players.handWinner(player,player2)));







    }

}
