package DataStructures;

public class power {

public void powerX(int x, int y){
    int result = 1;
    while(y != 0){
        result = result * x;
        y--;
    }
    System.out.println("result is:  "+result);
}
    public static void main(String[] args) {
        int x = 2;
        int  y = 4;
        power Power = new power();
        Power.powerX(x,y);
    }
}
