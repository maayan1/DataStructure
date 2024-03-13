package LeetCode.Graph;

import java.util.Vector;

public class printAdjList {

    //function to add edges
    public static void addEdge(Vector<Integer> adj[], int u, int v){
        adj[u].add(v);
    }

    //function to print adjacencyList
    public static void adjacencyList(Vector<Integer> adj[], int V){
        for (int i = 0; i < V; i++){
            System.out.print(i + "->");
            for (int x : adj[i]){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    //function to initialize the adjacency list of the given graph
    public static void initGraph(int V ,int edges[][], int numOfEdges){
        //to represent graph as adjacency list
        Vector<Integer> adj[] = new Vector[5];
        for (int i = 0 ; i < adj.length; i++){
            adj[i] = new Vector<>();
        }
        // traverse edges array and make edges
        for (int i = 0 ; i < numOfEdges; i++){
            //function call to make an edge
            addEdge(adj,edges[i][0],edges[i][1]);
        }
        //function call to print adjacency list
        adjacencyList(adj,V);
    }
    public static void main(String[] args)
    {
        // Given vertices
        int V = 3;

        // Given edges
        int edges[][] = { {0, 1}, {1, 2}, {1, 3}, {2, 3}, {3, 0} };

        int numOfEdges = 5;

        // Function Call

        initGraph(V, edges, numOfEdges);

    }

}
