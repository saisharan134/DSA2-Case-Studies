class Node {

    int key;
    int height;
    Node left, right;

    Node(int key) {
        this.key = key;
        height = 1;
    }
}

public class BSTRangeQuery {

    static void rangeQuery(
            Node root,
            int low,
            int high) {

        if(root == null)
            return;

        if(root.key > low)
            rangeQuery(
                root.left,
                low,
                high);

        if(root.key >= low &&
           root.key <= high)
            System.out.print(
                root.key + " ");

        if(root.key < high)
            rangeQuery(
                root.right,
                low,
                high);
    }

    public static void main(String[] args) {

        Node root = new Node(30000);

        root.left = new Node(15000);
        root.right = new Node(60000);

        root.left.left =
                new Node(12000);

        root.left.right =
                new Node(25000);

        root.right.left =
                new Node(50000);

        root.right.right =
                new Node(70000);

        System.out.println(
            "Users in Reputation Range:");

        rangeQuery(
            root,
            10000,
            50000);
    }
}