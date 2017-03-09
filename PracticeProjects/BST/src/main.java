/**
 * Created by Tyler on 3/1/2017.
 */
import java.util.Scanner;
import java.io.File;

public class main {



    public static Node createBST(Scanner data) {
        Node root = null;
        while (data.hasNextLine()) {
            String line = data.nextLine();
            long x = Long.parseLong(line);
            bstInsert(root, x);
        }

        return root;
    }

    public static void bstInsert(Node root, long x) {
        Node newNode = new Node(x);
        Node parent = locateParent(root, newNode);
        if (parent == null) {
            root = newNode;
        } else if (x < parent.data) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
    }

    private static Node locateParent(Node root, Node n) {
        Node parent = null;
        Node x = root;
        while (x != null) {
            parent = x;
            if (n.data < x.data) {
                x = x.left;
            } else {
                x = x.right;
            }
        }
        return parent;
    }

    public static long bstSumRange(Node root, int min, int max) {

        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        File dataFile = new File("dataA");
        Scanner data = new Scanner(dataFile);
        Scanner rangeFile = new Scanner("");

        Node root = createBST(data);
        System.out.println(root.data);

    }

