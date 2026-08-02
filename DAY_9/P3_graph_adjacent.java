package DAY_9;

class GraphMatrix {
    private int[][] matrix;
    private int numVertices;

    // Constructor
    public GraphMatrix(int numVertices) {
        this.numVertices = numVertices;
        matrix = new int[numVertices][numVertices];
    }

    // Add a weighted edge (Undirected)
    public void addWeightedEdge(int u, int v, int weight) {
        if (isValidVertex(u) && isValidVertex(v)) {
            matrix[u][v] = weight;
            matrix[v][u] = weight; // Remove if directed
        }
    }

    // Check if an edge exists between two vertices
    public boolean hasEdge(int u, int v) {
        if (isValidVertex(u) && isValidVertex(v)) {
            return matrix[u][v] != 0;
        }
        return false;
    }

    // Remove an edge
    public void removeEdge(int u, int v) {
        if (isValidVertex(u) && isValidVertex(v)) {
            matrix[u][v] = 0;
            matrix[v][u] = 0; // Remove if directed
        }
    }

    // Print the adjacency matrix
    public void printMatrix() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    private boolean isValidVertex(int v) {
        return v >= 0 && v < numVertices;
    }
}

public class P3_graph_adjacent {

    public static void main(String[] args) {

        GraphMatrix g = new GraphMatrix(4);

        // Add weighted edges
        g.addWeightedEdge(0, 1, 4);
        g.addWeightedEdge(0, 2, 1);
        g.addWeightedEdge(1, 3, 3);
        g.addWeightedEdge(2, 3, 2);

        g.printMatrix();

        System.out.println("\nEdge 0-1 exists: " + g.hasEdge(0, 1));

        g.removeEdge(0, 1);

        System.out.println("\nAfter removing edge 0-1:");
        g.printMatrix();
    }
}