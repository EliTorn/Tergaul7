import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Node node = new Node(3);
        Node s1 = new Node(4);
        Node s2 = new Node(7);
        Node s3 = new Node(6);
        node.setNext(s1);
        s1.setNext(s2);
        s2.setNext(s3);
        System.out.println(node);

        System.out.println(ifAfterX(node, 9, 6));
        System.out.println(ifAfterX(node, 6, 9));
        System.out.println("---------------------");
        System.out.println(ifAfterBothSide(node, 9, 6));
        System.out.println(ifAfterBothSide(node, 6, 9));
        System.out.println(ifAfterBothSide(node, 4, 6));
        Stack<Integer> even = new Stack<>();
        Stack<Integer> odd = new Stack<>();
        stackEvenStackOdd(node, even, odd);
        System.out.println(even);
        System.out.println(odd);

       // System.out.println(isTwice8(node));


        System.out.println(startCheck(node,3));

        //System.out.println(isTwice8(node));




    }

    public static void stackEvenStackOdd(Node node, Stack<Integer> even, Stack<Integer> odd) {
        while (node != null) {
            int check = node.getData();
            if (check % 2 == 0) {
                even.add(node.getData());
            } else {
                odd.push(node.getData());
            }
            node = node.next;
        }


    }

    public static int ifAfterX(Node node, int x, int y) {
        while (node != null) {
            if (node.getData() == x) {
                node = node.next;
                if (node == null) {
                    return 0;
                }
                if (node.getData() == y) {
                    return 1;
                }
            }
            node = node.next;

        }
        return 0;
    }

    public static int ifAfterBothSide(Node node, int x, int y) {
        if (ifAfterX(node, x, y) == 1 || ifAfterX(node, y, x) == 1) {
            return 1;
        }
        return 0;
    }


    public static boolean findNumber(Node node, int find) {
        while (node != null) {
            if (node.getData() == find) {
                return true;
            }
            node = node.getNext();
        }
        return false;
    }


    public static int linkFind(Node node) {
        int iFind = -1;
        while (node != null) {
            iFind = node.getData();
            node = node.next;
        }
        return iFind;
    }


    public static boolean isRight(Node node) {
        while (node != null) {
            int temp = node.getData();
            node = node.next;
            if (node == null) {
                return true;
            }
            if (temp > node.getData()) {
                return false;
            }
        }
        return true;
    }
    public static int isTwice8(Node node){
        int look = 0;
        while(node!= null){
            node = startCheck(node,look);
            int x = node.getData();
            node = node.next;
            if(node == null){
                return 1;
            }
            if(x == node.getData()){
                return 0;
            }
            look++;
        }


        return 1;
    }




    public static boolean isContains8(Node node, int x){
        while(node != null){
            if(node.getData() == x){
                return true;
            }
            node =node.next;
        }
        return false;
    }
    public static Node startCheck(Node node, int start){
        for (int i = 0; i < start; i++) {
            if(node != null){
                node = node.next;
            }
        }
        return node;
    }
}

