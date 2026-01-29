package XO;

public class Players {
    private String name;
    private char symbol;
    public Players(){}

    public Players(String name){
        this.name=name;
    }
    public Players(String name,char symbol){
        this.name=name;
        this.symbol=symbol;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public boolean setSymbol(char symbol,Board b){
        if(symbol=='X'|| symbol == 'x'){
            this.symbol='X';
            return true;
        }
        if(symbol=='O'|| symbol == 'o'){
            this.symbol='O';
            return true;
        }
        else {
           Out.print(1,b);
            return false;
        }

    }


    public char getSymbol() {
        return symbol;
    }
}
