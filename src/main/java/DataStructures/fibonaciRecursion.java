package DataStructures;

public class fibonaciRecursion {

   public static int fibon(int n) {
       if (n == 0 || n == 1)
           return n;
       return fibon(n - 1) + fibon(n - 2);
   }

    public static void main(String[] args) {
       int n = 3;
           fibon(n);
    }
}
