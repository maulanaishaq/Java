package java_collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeueApp {
    public static void main(String[] args) {

        Deque<String> stack = new LinkedList<>(); //tumpukan

        stack.offerLast("Eko");
        stack.offerLast("Kurniawan");
        stack.offerLast("Khannedy");

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        Deque<String> queue = new LinkedList<>(); //antrian
        queue.offerLast("Eko");
        queue.offerLast("Kurniawan");
        queue.offerLast("Khannedy");

        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());

    }
}