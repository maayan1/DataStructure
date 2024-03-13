package LeetCode.String;

public class Palindrome {

public static String replaceString(String str){

    String LowCase = str.toLowerCase();
    System.out.println("LowCase: "+LowCase);
    return str = LowCase.replaceAll("[^a-zA-Z0-9]", "");
}

public static boolean IsPalindrome(String str){
    //pointer for beginning and end of string
    int i =0, j = str.length()-1;

    //compare characters
    while( i < j ){
        //if there is a miss match return false
        if(str.charAt(i) != str.charAt(j))
            return false;
        i++;
        j--;
    }
    return true;
}


    public boolean isPalindrome(String s) {

        String LowCase = s.toLowerCase();
        System.out.println("LowCase: "+LowCase);
        s = LowCase.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println("String lowcase without non-alpha  "  +s);


        //pointer for beginning and end of string
        int i =0, j = s.length()-1;

        //compare characters
        while( i < j ){
            //if there is a miss match return false
            if(s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
    return true;
    }



    public static void main(String[] args) {
        String str1 = "@!Geeks-for'Geeks, 123";
      //  System.out.println(replaceString(str1));
      //  System.out.println("***********************************");
        String str2 = "A man, a plan, a canal: Panama";
      //  System.out.println(replaceString(str2));

        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(str2));
    }
}
