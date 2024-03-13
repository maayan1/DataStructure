package LeetCode.Array;

public class canPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if ((n==0) && (flowerbed[0]==0)){
            return true;
        }
        else if ((flowerbed[n-1]==0) && (flowerbed[n+1]==0)){
               return false;
        }
        else if((flowerbed[n-1] == 1) && flowerbed[n] == 0){
        return true;
        }
        return false;
    }
    public static boolean canPlaceFlowers1(int[] flowerbed, int n) {
        int count = 0;
        int i = 0;

        while (i < flowerbed.length) {
            if (flowerbed[i] == 0) {
                int consecutiveEmpty = 0;
                while (i < flowerbed.length && flowerbed[i] == 0) {
                    consecutiveEmpty++;
                    i++;
                }
                if (i == flowerbed.length) {
                    count += consecutiveEmpty / 2;
                } else {
                    if (consecutiveEmpty % 2 == 0) {
                        count += consecutiveEmpty / 2 - 1;
                    } else {
                        count += consecutiveEmpty / 2;
                    }
                }
            }
            i++;
        }

        return count >= n;
    }





    public static void main(String[] args) {
        canPlaceFlowers placeFlowers=new canPlaceFlowers();
        int [] flowerbed ={1,0,0,0,0,0,1};
        int n = 2;
      //  boolean rply =placeFlowers.canPlaceFlowers(flowerbed,n);
       // System.out.println(rply);

        System.out.println("******************************************");

        int[] flowerbed3 = {1,0,0,0,0,0,1};
        int n3 = 2;
        System.out.println(canPlaceFlowers1(flowerbed3, n3));
    }
}
