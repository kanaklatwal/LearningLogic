package Collections;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayDeque;
public class QueueBasics {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(10);
        q1.add(20);
        q1.add(30);
        System.out.println("The queue is: " + q1);
        q1.offer(40);
        q1.offer(50);
        q1.offer(60);
        System.out.println("The new queue is : "+ q1);
        System.out.println(q1.element());//10
        System.out.println(q1);//[10, 20, 30, 40, 50, 60]
        System.out.println(q1.peek());//10
        System.out.println(q1);//[10, 20, 30, 40, 50, 60]
        System.out.println(q1.remove());//10
        System.out.println(q1);//[20, 30, 40, 50, 60]
        System.out.println(q1.poll());//20
        System.out.println(q1);//[30, 40, 50, 60]

        Queue<Integer> q2 = new ArrayDeque<>();
        q2.offer(10);
        q2.offer(20);
        q2.offer(30);
        System.out.println(q2);
        System.out.println("Removing "+ q2.poll());
        System.out.println(q2);
        System.out.println("Peeking " + q2.peek());
    }
}
