package XO;

import java.util.Scanner;

public class Board {
    protected char board[][];
    int row;
    int col;

    public Board() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter board size (e.g., 3 for 3x3)");
        this.row = in.nextInt();
        this.col = row;
        board = new char[row][row];

    }




    public void drawBoard() {
        Out.print(this);

    }

    public char getBoard(int i, int j) {
        return board[i][j];
    }

    public boolean placeSymbol(int position, char symbol) {
        if (position < 1 || position > row * col) {
            Out.print(2, this);
            return false;
        }
        int rows = (int) (position - 1) / col;
        int colu = (int) (position - 1) % col;
        if (board[rows][colu] == 'X' || board[rows][colu] == 'O') {
            Out.print(3, this);
            return false;

        }
        board[rows][colu] = symbol;
        return true;
    }

}
