public class Main extends tictactoePlay{
    static void main(String[] args) {
        tictactoePlay game=new tictactoePlay();
        game.runner();
        System.out.println(winnergetter()+" WINS!!");
    }
}
