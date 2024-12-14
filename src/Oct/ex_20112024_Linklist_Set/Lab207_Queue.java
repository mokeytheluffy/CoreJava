package Oct.ex_20112024_Linklist_Set;

import java.util.PriorityQueue;

public class Lab207_Queue {
    public static void main(String[] args) {
        // Queue--- rarely used in automation
        PriorityQueue pq = new PriorityQueue();
        //FIFO
        pq.offer("1"); // instead of add we use offer
        pq.offer("2");
        pq.offer("3");
        pq.offer("4");
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll()); // to remove in FIFO method/ will give first element
        System.out.println(pq);



    }
}
