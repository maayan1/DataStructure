package LeetCode.Graph;

public class GraphTransitivi {
// @Maayan
    final static int V = 4;

    void transitiveClosure(int graph[][]) {

        int reach[][] = new int[V][V];
        int i, j, k;

        //initialize the solution matrix same as input graph matrix
        for (i = 0; i < V; i++) {
            for (j = 0; j < V; j++) {
                reach[i][j] = graph[i][j];
            }
        }
        //find all path including intermediate path

        for (k = 0; k < V; k++) {
            for (i = 0; i < V; i++) {
                for (j = 0; j < V; j++) {
                    reach[i][j] = (reach[i][j] != 0) || ((reach[i][k] != 0) && (reach[k][j] != 0)) ? 1 : 0;
                }
            }
        }
    }

    void printSolution(int reach[][]) {
        System.out.println("Following matrix is transitive closure" +
                " of the given graph");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (i == j)
                    System.out.print("1 ");
                else
                    System.out.print(reach[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        /* Let us create the following weighted graph
           10
        (0)------->(3)
        |         /|\
      5 |          |
        |          | 1
        \|/        |
        (1)------->(2)
           3           */

        /* Let us create the following weighted graph

              10
         (0)------->(3)
          |         /|\
        5 |          |
          |          | 1
         \|/         |
         (1)------->(2)
            3           */
        int graph[][] = new int[][]{{1, 1, 0, 1},
                {0, 1, 1, 0},
                {0, 0, 1, 1},
                {0, 0, 0, 1}
        };

        // Print the solution
        GraphClosure g = new GraphClosure();
        g.transitiveClosure(graph);
    }


}



