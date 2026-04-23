public class tictactoePlay extends tictactoeCheck{
    //printing in format
    void printing(){
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(get()[i][j]);
                if (j < 2)
                    System.out.print("|");
            }
            System.out.println();
        }
    }
    String[][] get(){
        return getter();
    }
    void runner()
    {
        int a;int b;String arr[][];int turns=0;String player;
        while(true)
        {

            if(turns==9)
            {
                System.out.println("draw");
                return;
            }
            if(turns==0){
                printing();
                choose();
            }

            arr=get();
            System.out.println("enter x-y coordinates");
            a=sc.nextInt();
            b=sc.nextInt();
            if(a==-1&&b==-1)
            {
                System.out.println("exiting");
                return;
            }
            if(a<0||a>2||b<0||b>2)
            {
                error();
                continue;
            }
            if(arr[a][b]!=" ")
            {
                error();
                continue;
            }


            turns++;
            player=turn(turns);
            if(player.equals("Player1"))
            {
                System.out.println("Player 1 played their turn");
                if(Player.Player1=='X')
                    cross(a,b);
                else if(Player.Player1=='O')
                    zero(a,b);

            }
            else if(player.equals("Player2"))
            {
                System.out.println("Player 2 played their turn");
                if(Player.Player2=='X')
                    cross(a,b);
                else if(Player.Player2=='O')
                    zero(a,b);

            }
            printing();
            if(row()||column()||diagonal()){
                winner(player);
                return;
            }

        }
    }
    String turn(int turns) {
            if(turns%2!=0)
                return "Player1";
            else
                return "Player2";
    }
}
