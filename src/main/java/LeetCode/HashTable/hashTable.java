package LeetCode.HashTable;

import DataStructures.HashTable;
//import sun.security.krb5.internal.crypto.HmacSha1Aes128CksumType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Hashtable;

public class hashTable {


    public static ArrayList<String> merge(String[] words, String[] more) {
        ArrayList<String> sentence = new ArrayList<String>();
        for (String w : words) sentence.add(w);
        for (String w : more) sentence.add(w);
        return sentence;
    }



    public static void main(String[] args) {
      /*  Hashtable<String,Integer> hashtable = new Hashtable<>();

        hashtable.put("A" , 1);
        hashtable.put("B",  2);
        hashtable.put("C",  3);

        int value = hashtable.get("A");
        System.out.println("Value of A: " +value);

        Enumeration<String> keys = hashtable.keys();
        while(keys.hasMoreElements()){
            String key = keys.nextElement();
            System.out.println("Key:  " +key +",  Value:  " + hashtable.get(key));
            */

        String[] words = {"hello ", "world ","we ","want ","to ","learn ","coding "};
        String[] more = {"java ", "programming ","everything ","will ","be ","just ","fine"};

        ArrayList<String> mergedList = merge(words, more);

        // Print the elements of the ArrayList
        for (String word : mergedList) {
            System.out.print(word);

        }
    }
}



