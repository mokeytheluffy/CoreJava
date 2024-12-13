package Oct.ex_20112024_Linklist_Set;

import java.util.Stack;

public class Lab199_Stack {
    public static void main(String[] args) {
        //Stack
        //Last in--- first out
// We will use this to insert and remove
       /* Stack s = new Stack();
        s.add("Aniket");
        s.add("Sakshi");
        System.out.println(s);
    */
        Stack s = new Stack<>();
        s.push("Aniket");
        s.push("Sakshi");
        s.add("Pappu");
        System.out.println(s.size());// to show size
        System.out.println(s);
        System.out.println(s.peek());// indicates top of the stack
        System.out.println(s);
        System.out.println(s.pop()); // to remove top of the stack
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.empty()); // shows if the stack is empty or not
        System.out.println(s.add("Pandu")); // add and push works the same
        System.out.println(s);
        s.add(0, "Praful"); // this will add element at specific spot using index in stck
        System.out.println(s);
        System.out.println(s.get(0)); // will print specific element of stack

    }

}
