    public class tictactoe {
    private static String arr[][]={{" "," "," "},{" "," "," "},{" "," "," "}};
    private static String winner="";
    void cross(int x,int y)
    {
        arr[x][y]="X";
    }
    void zero(int x,int y)
    {
        arr[x][y]="O";
    }
    void error()
    {
        System.out.println("please enter correct coords");
    }
    String[][] getter(){
        return arr;
    }
    static String winnergetter(){
        return winner;
    }
    void winner(String winner){
        tictactoe.winner=winner;
    }




}
