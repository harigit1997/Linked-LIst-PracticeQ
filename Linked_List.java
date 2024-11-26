package Practice_25Nov;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Linked_List {
    public static void main(String[] args) {
        //LinkedList ===========================
        //Create a LinkedList and perform various operations like add, remove, and iterate over it.
        LinkedList <Integer> ele = new LinkedList<>();
        ele.add(10);
        ele.add(45);
        ele.add(34);
        ele.add(23);
        ele.add(12);
        System.out.println(ele);

        //Implement a Queue using the LinkedList class
        Queue<String> queue = new LinkedList<>();
        queue.add("25");
        queue.add("45");
        queue.add("32");

        queue.remove();
        System.out.println(queue);


        //Implement a Stack using the LinkedList class.
        Stack <String> stack = new Stack<>();
        stack.push("20");
        stack.push("67");
        stack.push("87");
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

        //Write a program to check if two LinkedLists are equal.
        LinkedList <Integer> ele2 = new LinkedList<>(ele);
        System.out.println(ele2);
        System.out.println(ele2.equals(ele));
    }
}
