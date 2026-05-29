import java.util.PriorityQueue;

class HeapNode implements Comparable<HeapNode> {

    int value;
    int chunkId;
    int index;

    HeapNode(int value,
             int chunkId,
             int index) {

        this.value = value;
        this.chunkId = chunkId;
        this.index = index;
    }

    public int compareTo(HeapNode other) {
        return this.value - other.value;
    }
}

public class KWayMerge {

    public static void main(String[] args) {

        int[][] chunks = {

            {10,25,47,89},
            {12,30,51,75},
            {8,19,41,92},
            {15,33,60,80},
            {22,38,55,88},
            {11,28,49,85}
        };

        PriorityQueue<HeapNode> pq =
                new PriorityQueue<>();

        for(int i=0;i<chunks.length;i++) {

            pq.add(
                new HeapNode(
                    chunks[i][0],
                    i,
                    0));
        }

        System.out.println(
            "Merged Output:");

        while(!pq.isEmpty()) {

            HeapNode node = pq.poll();

            System.out.print(
                node.value + " ");

            int next =
                node.index + 1;

            if(next <
                chunks[node.chunkId].length) {

                pq.add(
                    new HeapNode(
                        chunks[node.chunkId][next],
                        node.chunkId,
                        next));
            }
        }
    }
}