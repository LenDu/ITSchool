package collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

/**
 * Created by Lena on 1/28/2018.
 */
public class Queue {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<String>();
        Deque<String> queue = new ArrayDeque<String>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        while (!stack.isEmpty())
            System.out.print(stack.pop() + " ");

        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        while (!queue.isEmpty())
            System.out.print(queue.remove() + " ");
        System.out.println(queue);

        PriorityQueue<String> pq = new PriorityQueue<String>();
        pq.offer("Oklahoma");
        pq.offer("Indiana");
        pq.offer("Georgia");
        pq.offer("Texas");
        System.out.println("Priority queue using Comparable: ");
        while (pq.size()>0)
            System.out.println(pq.remove() + " ");

    }

}
