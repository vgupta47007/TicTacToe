public class tictactoeCheck extends tictactoeChoice {
    String arr[][]=new String[3][3];
    boolean row()
    {
        arr=getter();
        if((arr[0][0].equals("X")&&arr[0][1].equals("X")&&arr[0][2].equals("X"))||(arr[0][0].equals("O")&&arr[0][1].equals("O")&&arr[0][2].equals("O")))
            return true;
        if((arr[1][0].equals("X")&&arr[1][1].equals("X")&&arr[1][2].equals("X"))||(arr[1][0].equals("O")&&arr[1][1].equals("O")&&arr[1][2].equals("O")))
            return true;
        if((arr[2][0].equals("X")&&arr[2][1].equals("X")&&arr[2][2].equals("X"))||(arr[2][0].equals("O")&&arr[2][1].equals("O")&&arr[2][2].equals("O")))
            return true;
        return false;
    }
    boolean column()
    {
        arr=getter();
        if((arr[0][0].equals("X")&&arr[1][0].equals("X")&&arr[2][0].equals("X"))||(arr[0][0].equals("O")&&arr[1][0].equals("O")&&arr[2][0].equals("O")))
            return true;
        if((arr[0][1].equals("X")&&arr[1][1].equals("X")&&arr[2][1].equals("X"))||(arr[0][1].equals("O")&&arr[1][1].equals("O")&&arr[2][1].equals("O")))
            return true;
        if((arr[0][2].equals("X")&&arr[1][2].equals("X")&&arr[2][2].equals("X"))||(arr[0][2].equals("O")&&arr[1][2].equals("O")&&arr[2][2].equals("O")))
            return true;

        return false;
    }
    boolean diagonal()
    {
        arr=getter();
        if((arr[0][0].equals("X")&&arr[1][1].equals("X")&&arr[2][2].equals("X"))||(arr[0][0].equals("O")&&arr[1][1].equals("O")&&arr[2][2].equals("O")))
            return true;
        if((arr[0][2].equals("X")&&arr[1][1].equals("X")&&arr[2][0].equals("X"))||(arr[0][2].equals("O")&&arr[1][1].equals("O")&&arr[2][0].equals("O")))
            return true;


        return false;
    }
}
