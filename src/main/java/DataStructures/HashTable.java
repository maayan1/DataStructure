package DataStructures;

public class HashTable {


    public static class Node {
    private String key;
    private int value;
    private Node next;
    }
    
    private int size =7;
    private  Node [] dataMap;


    public HashTable(){
        dataMap =new Node[size];
    }



}
