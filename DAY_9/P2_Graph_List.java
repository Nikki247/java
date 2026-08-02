package DAY_9;

import java.util.ArrayList;

class Edge {
    int src;
    int des;

    Edge(int src, int des) {
        this.src = src;
        this.des = des;
    }
}

public class P2_Graph_List {

    public static void create_graph(ArrayList<Edge> graph[]) {

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 0));

        graph[4].add(new Edge(4, 2));
    }

    public static void main() {

        int V = 5;
        ArrayList<Edge> newGraph[] = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            newGraph[i] = new ArrayList<>();
        }

        create_graph(newGraph);

        for (int j = 0; j < V; j++) {
            for (Edge i : newGraph[j]) {
                System.out.print("{" + i.src + "," + i.des + "} ");
            }
            System.out.println();
        }
    }
}
