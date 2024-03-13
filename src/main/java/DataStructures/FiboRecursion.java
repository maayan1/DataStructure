package DataStructures;

public class FiboRecursion {


    public static int fib(int n){

        if((n ==0) || (n == 1)){
            return n;
        }
           return fib(n-1) +  fib(n-2);
    }

    public static int fact(int n){
        if(n <=0)
            return 1;
        return n*fact(n-1);
    }


    public static int fibo1(int n){
        if(n==0 || n==1)
            return n;
        return fibo1(n-1) + fibo1(n-2);
    }

    public static void main(String[] args) {

        int n=3;
       System.out.println(fib(n));
       // System.out.println(fact(n));

    }
}
