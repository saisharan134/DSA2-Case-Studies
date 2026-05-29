import java.util.*;

class Edge {
    int u, v, weight;

    Edge(int u, int v, int weight) {
        this.u = u;
        this.v = v;
        this.weight = weight;
    }
}

public class BellmanFordUber {

    public static void main(String[] args) {

        int V = 7;
        int source = 0;

        String[] names = {
            "IND","KOR","MGR",
            "HSR","BTM","JPN","EC"
        };

        List<Edge> edges = new ArrayList<>();

        edges.add(new Edge(0,1,8));
        edges.add(new Edge(0,3,5));
        edges.add(new Edge(1,2,7));
        edges.add(new Edge(1,4,-5));
        edges.add(new Edge(3,4,6));
        edges.add(new Edge(3,5,-3));
        edges.add(new Edge(2,4,4));
        edges.add(new Edge(2,6,10));
        edges.add(new Edge(4,6,8));
        edges.add(new Edge(5,6,14));

        int[] dist = new int[V];
        int[] parent = new int[V];

        Arrays.fill(dist, Integer.MAX_VALUE);
        Arrays.fill(parent, -1);

        dist[source] = 0;

        for(int i=1;i<V;i++) {

            boolean changed = false;

            for(Edge e : edges) {

                if(dist[e.u] != Integer.MAX_VALUE &&
                   dist[e.u] + e.weight < dist[e.v]) {

                    dist[e.v] =
                        dist[e.u] + e.weight;

                    parent[e.v] = e.u;

                    changed = true;
                }
            }

            if(!changed)
                break;
        }

        boolean negativeCycle = false;

        for(Edge e : edges) {

            if(dist[e.u] != Integer.MAX_VALUE &&
               dist[e.u] + e.weight < dist[e.v]) {

                negativeCycle = true;
            }
        }

        if(negativeCycle) {
            System.out.println(
                "Negative Cycle Detected");
            return;
        }

        System.out.println(
            "Shortest Cost to EC = "
            + dist[6]);
    }
}