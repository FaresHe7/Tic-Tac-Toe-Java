package XO;

public  class Out {

    public static void print(int n,Board b){
        switch (n){
            case 1:
                System.out.println("You entered an incorrect character. Please enter only X or O");
                break;
            case 2:
                System.out.println("Wrong number: Please enter a number from 1 to "+ b.col*b.row );
                break;
            case 3:
                System.out.println("The position has been taken, choose another one.");
                break;




        }

    }
public static void print(Board b){
    int num=1;
    for (int i=0;i<b.row;i++){
        for (int j=0;j<b.col;j++){
            if(b.getBoard(i,j)=='X'||b.getBoard(i,j)=='O'){
                System.out.print(" "+b.getBoard(i,j)+" |");
            }
            else {
                System.out.print(" "+num+" |");
            }
            num++;
        }
        System.out.println("\n" + "-".repeat(b.col * 5));
    }
}

    }

