package UsingJava;

public class ex {


    public static int solution(int a ){
        int i;
        for(i=0;i<a;i++)
        {
            i+=1;
            System.out.println(i);
        }
        return i;
    }
    public static void main(String[] args) {

        int a=8;
        solution(a);
    }
}
