package XO;

import java.util.Scanner;

public class Game {
    private Players p1;
    private Players p2;
    private Board board;
    private CheckWinner winner;
    public Game(){
        p1=new Players();
        p2=new Players();
        board=new Board();
        winner=new CheckWinner();
    }
    private void takeInput(){
        Scanner iin =new Scanner(System.in);
        System.out.println("Enter First Player Name");
        String name= iin.nextLine();
        p1.setName(name);
        System.out.println("please " + p1.getName()+ " choose your symbol(x,o):");
        char symbol=iin.next().charAt(0);
        while (!p1.setSymbol(symbol,board)){
            System.out.println("please "+ p1.getName()+" choose Only(x,o):");
            symbol=iin.next().charAt(0);
        }
        System.out.println("Enter the Second Player Name");
        name= iin.next();
        p2.setName(name);
        if(p1.getSymbol()=='X'){
            p2.setSymbol('O',board);
        }
        else {
            p2.setSymbol('X',board);
        }

    }
    public void Start(){
        Scanner inn=new Scanner(System.in);
        takeInput();
        int t =1;
        Players currentPlayer=p1;
        while (t<=board.row*board.col){
            board.drawBoard();
            System.out.println(currentPlayer.getName()+ " choose position to play! ");
            int position =inn.nextInt();
            while (!board.placeSymbol(position,currentPlayer.getSymbol())){
                position= inn.nextInt();
            }
            if(winner.isWinner(currentPlayer,board)){
                System.out.println(currentPlayer.getName()+" You are the Winner, Winner ");
                board.drawBoard();
                return;
            }
            if (currentPlayer ==p1){
                currentPlayer=p2;
            }
            else {
                currentPlayer =p1;
            }
            t++;
        }
        board.drawBoard();
        System.out.println("Draw");

    }
}
