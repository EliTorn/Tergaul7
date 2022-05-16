import java.util.Stack;

public class HomeWork {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(6);
        s.push(3);
        System.out.println(flip(s));
        System.out.println(chechPolyndrom(s));

    }
    public static Stack<Integer> flip(Stack <Integer>s){
        Stack<Integer> s1 = new Stack<>();
        Stack <Integer>s2 = new Stack<>();
        while(!s.isEmpty()){
            s1.push(s.peek());
            s2.push(s.pop());
        }
        while(!s1.isEmpty()){
            s.push(s1.pop());
        }
        System.out.println("The s is"+s);
        return s2;
    }
    public static boolean chechPolyndrom(Stack <Integer> s){
        Stack <Integer>s1 = new Stack<>();
        Stack <Integer>s2 = new Stack<>();
        Stack <Integer>s3= new Stack<>();
        while(!s.isEmpty()){
            s1.push(s.peek());

            s3.push(s.pop());
        }
        while(!s1.isEmpty()){
            s.push(s1.peek());
            s2.push(s1.pop());
        }
        while(!s3.isEmpty()){
            if(s2.pop() != s3.pop()){
                return false;
            }
        }
       return  true;
    }
    public  static boolean checkPalindrom(Stack <Integer> s){
        Stack <Integer> rev= flip(s);
        Stack<Integer> cur = flip(rev);
        while(!rev.isEmpty() && rev.pop() == cur.pop());
        return rev.isEmpty();
    }
}
