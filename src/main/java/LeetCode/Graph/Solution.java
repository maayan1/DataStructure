package LeetCode.Graph;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<List<Integer>> printGraph(int V, int edges[][]) {
        List<List<Integer>> adjList =new ArrayList<>(V);
        //initialize the adjacency list with empty lists
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
        //Populated  the adjacency list with edges
        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            adjList.get(from).add(to);
        }
        return adjList;
    }

    public static void  printAdjList(int V,List<List<Integer>> adjList){
        // Print the adjacency list
        for (int i = 0; i < V; i++) {
            System.out.print( i + " -> ");
            for (int neighbor : adjList.get(i)) {
                System.out.print(neighbor + "  ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int V = 4; // Number of vertices
        int[][] edges = {{0, 1}, {1, 2}, {2, 3}, {3, 0}}; // Edge information
        int edges1[][] = {{0, 1}, {1, 2}, {1, 3}, {2, 3}, {3, 0}};
       printAdjList(V,printGraph(V,edges));
        System.out.println("----------------------------------------------------");
        printAdjList(V,printGraph(V,edges1));




    }
}