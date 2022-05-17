import java.util.LinkedList;

public class LinkedListHomeWork {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();

        System.out.println(list1);
        list1.add(1);
        list1.add(3);

        list1.add(7);
        LinkedList<Integer> list2 = new LinkedList<>();

        System.out.println(FindInLast(list1, 2));
        System.out.println(list1);
        DeleteMiddle(list1);
        System.out.println(list1);
        System.out.println(list1.lastIndexOf(list1));

    }

    public static int FindInLast(LinkedList <Integer> list, int n) {
        int size = list.size();
        if (size - n < 0) {
            System.out.println("Error 404");
            return -1;
        }
        return list.get(size - n);
    }
    public static void DeleteMiddle(LinkedList <Integer> list) {
        int size = list.size();
        if (list.size() % 2 == 0) {
            list.remove(list.size() / 2);
            list.remove(list.size()/2);
        }
        else
            list.remove(size/2);

    }
}
