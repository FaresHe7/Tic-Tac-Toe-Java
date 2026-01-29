package XO;

public class CheckWinner {

    private boolean checkRows(char symbol,Board b){
        for(int i=0;i<b.row;i++){
            int count =0;
            for(int j=0;j<b.col;j++){
                if(b.getBoard(i,j)==symbol){
                    count++;
                }

            }
            if(count==b.row){
                return true;
            }

        }
        return false;

    }
    private boolean checkColumns(char symbol,Board b){
        for(int i=0;i<b.col;i++){
            int count =0;
            for(int j=0;j<b.row;j++){
                if(b.getBoard(j,i)==symbol){
                    count++;
                }

            }
            if(count==b.row){
                return true;
            }
        }
        return false;

    }

 private boolean checkDiagonals(char symbol,Board b){
        int count=0;
        for (int i=0;i<b.row;i++){
            if(b.getBoard(i,i)==symbol){
                count++;
            }

        }
     if(count==b.row){
         return true;
     }
     int t=0;
     for (int i=0,j=b.col-1;i<b.row;i++,j--){
         if(b.getBoard(i,j)==symbol){
             t++;
         }

     }
    return (t==b.row);

    }
    public boolean isWinner(Players p,Board b){
        return checkRows(p.getSymbol(), b)||
                checkColumns(p.getSymbol(), b)||
                checkDiagonals(p.getSymbol(), b);

    }

}
