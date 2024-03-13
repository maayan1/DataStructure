package LeetCode.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class GroupeAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> strAnagram = new ArrayList<>();
        for (int i=0; i < strs.length ; i++){
            String[] results = strs[i].split("(?<=\\G.{" + 1 + "})");

            for (int j=0; i<strs.length;j++){
                strs[i].contains(results[j]);
            }

        }






        return strAnagram;
    }


    public static List<String> usingSplitMethod(String text, int n) {
        String[] results = text.split("(?<=\\G.{" + n + "})");

        return Arrays.asList(results);
    }





    public static void main(String[] args) {
        int n = 1;
        String str = "Hello, World!";
       // String[] parts = str.split("\\");
       // System.out.println(parts[0]);
        //System.out.println(parts[1]);

       // List<String> result = usingSplitMethod(str,n);

       // System.out.println(Arrays.toString(result.toArray()));


        String s1="hello";
        char[] ch=s1.toCharArray();

        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
            System.out.println();
        }


    }
}
