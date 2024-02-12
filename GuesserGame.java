package Projects;
import java.util.Scanner;

class Guesser{
    int GuesserNum;
    public int GuessNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser guess the number: ");
        GuesserNum = sc.nextInt();
        return GuesserNum;
    }
}
class Player{
    int PlayerNum;
    public int GuessNum(){
        Scanner sc = new Scanner(System.in);
        PlayerNum = sc.nextInt();
        return PlayerNum;
    }
}

class Umpire{
    int GuesserNum1;
    int PlayerNum1;
    int PlayerNum2;
    int PlayerNum3;

    public void CollectNumFromGuesser(){
        Guesser g = new Guesser();
        GuesserNum1 = g.GuessNum();
    }

    public void CollectNumFromPlayer(){
        Player p1 = new Player();
        System.out.println("player1 guess the number: ");
        PlayerNum1 = p1.GuessNum();

        Player p2 = new Player();
        System.out.println("player2 guess the number: ");
        PlayerNum2 = p2.GuessNum();

        Player p3 = new Player();
        System.out.println("player3 guess the number: ");
        PlayerNum3 = p3.GuessNum();
    }

    public void compare(){
       if(GuesserNum1 == PlayerNum1){

           if(GuesserNum1 == PlayerNum2 && GuesserNum1 == PlayerNum3){
               System.out.println("All Player won the game");
           } else if (GuesserNum1==PlayerNum2) {
               System.out.println("Player1 and Player2 won the game");
           } else if (GuesserNum1==PlayerNum3) {
               System.out.println("Player 1 and 3 won the game");
           }else{
               System.out.println("Player1 won the game");
           }

       } else if (GuesserNum1 == PlayerNum2) {
           if (GuesserNum1 == PlayerNum3){
               System.out.println("Player2 and Player3 won the game ");
           }else {
               System.out.println("Player2 won the game");
           }

       } else if (GuesserNum1 == PlayerNum3) {
           System.out.println("Player3 won the game");
       } else {
           System.out.println("ALl player lost the game");
       }
    }
}
public class GuesserGame {
    public static void main(String[] args) {
        System.out.println("-----Game Start-----");
        Umpire u = new Umpire();
        u.CollectNumFromGuesser();
        u.CollectNumFromPlayer();
        u.compare();
        System.out.println("------Game Over-----");
    }
}
