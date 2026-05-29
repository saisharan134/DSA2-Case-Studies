import java.util.*;

class Edge implements Comparable<Edge> {

    String src;
    String dest;
    int weight;

    Edge(String src,
         String dest,
         int weight) {

        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }

    public int compareTo(Edge e) {
        return this.weight - e.weight;
    }
}

public class KruskalMST {

    static Map<String,String> parent =
            new HashMap<>();

    static String find(String x) {

        if(parent.get(x).equals(x))
            return x;

        return find(parent.get(x));
    }

    static void union(String a,
                      String b) {

        String pa = find(a);
        String pb = find(b);

        parent.put(pa, pb);
    }

    public static void main(String[] args) {

        String[] vertices = {
                "DEL","BPL","MUM",
                "NGP","CHN","HYD"
        };

        for(String v : vertices)
            parent.put(v, v);

        List<Edge> edges =
                new ArrayList<>();

        edges.add(new Edge(
                "DEL","BPL",700));

        edges.add(new Edge(
                "DEL","MUM",1400));

        edges.add(new Edge(
                "BPL","MUM",800));

        edges.add(new Edge(
                "BPL","NGP",350));

        edges.add(new Edge(
                "MUM","NGP",850));

        edges.add(new Edge(
                "NGP","HYD",500));

        edges.add(new Edge(
                "NGP","CHN",1100));

        edges.add(new Edge(
                "HYD","CHN",600));

        Collections.sort(edges);

        int totalCost = 0;

        System.out.println(
                "Edges in MST:");

        for(Edge e : edges) {

            if(!find(e.src)
                    .equals(find(e.dest))) {

                System.out.println(
                        e.src + " - "
                        + e.dest + " : "
                        + e.weight);

                totalCost += e.weight;

                union(
                    e.src,
                    e.dest);
            }
        }

        System.out.println(
            "\nTotal Cost = "
            + totalCost);
    }
}