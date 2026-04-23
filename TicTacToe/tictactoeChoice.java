import java.util.Scanner;

public class tictactoeChoice extends tictactoe{
    Scanner sc = new Scanner(System.in);
        void choose()
        {
            System.out.println("Choose X or O for Player1");
            char choice = sc.next().charAt(0);
            switch (choice) {
                case 'X':{
                    Player.Player1 ='X';
                    Player.Player2='O';
                }
                break;
                case 'O':{
                    Player.Player1 ='O';
                    Player.Player2='X';
                }
                break;
            }
        }
    class Player{
        static char Player1;
        static char Player2;

    }
}
