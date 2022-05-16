import java.util.Stack;

public class Trying {
    public static void main(String[] args) {
        Node node = new Node(9);
        Node s1 = new Node(8);
        Node n2 = new Node(7);
        Node n3 = new Node(499);

        node.setNext(s1);
        s1.setNext(n3);
        n2.setNext(n3);
        System.out.println(node);

        //System.out.println(FindLast(node));
       // System.out.println(CheckEquals(node));
       // System.out.println(IfTheyOneAfterOne(node, 499, 7));

        Stack <Integer> even = new Stack<>();
        Stack <Integer> odd = new Stack<>();
        System.out.println(even);
        System.out.println(odd);
        foo(node,even,odd);
        System.out.println(even);
        System.out.println(odd);

    }

    public static int FindLast(Node node) {
        int temp = 0;
        while (node != null) {
            temp = node.getData();
            node = node.next;
        }

        return temp;
    }

    public static int CheckEquals(Node node) {
        while (node != null && node.next.next != null) {
            if (node.next.getData() < node.next.next.getData()) {
                return 0;
            }
            node = node.next;
        }
        return 1;
    }

    public static int Equals2(Node node) {
        while (node != null) {
            int a = node.getData();
            node = node.next;
            if (a < node.getData()) {
                return 0;
            }
        }
        return 1;
    }

    public static int IfTheyOneAfterOne(Node node, int x, int y) {
        while (node != null) {
            if (node.getData() == x && node.next.getData() == y || node.getData() == y && node.next.getData() == x) {
                return 1;
            }
            node = node.next;
        }
        return 0;
    }

    public static void foo(Node node, Stack<Integer> even, Stack<Integer> odd) {
        while (node != null) {
            if (node.getData() % 2 == 0) {
                even.push(node.getData());
            } else {
                odd.push(node.getData());
            }
            node = node.next;
        }
    }

}
