package io.vorotovd.RecursionI;

import java.util.Stack;

/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * Constraints:
 * The number of nodes in the list is the range [0, 5000].
 * -5000 <= Node.val <= 5000
 */
public class ReverseLinkedList {
    public static void main(String[] args) {

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;

        ListNode next = a;
        do {
            System.out.println(next.val);
            next = next.next;
        }
        while (next != null);

        System.out.println("Reverse");
        ReverseLinkedListSolution solution2 = new ReverseLinkedListSolution();
        ListNode node = solution2.reverseByRecursion(a);
        do {
            System.out.println(node.val);
            node = node.next;
        }
        while (node != null);

        System.out.println("Reverse");
        ReverseLinkedListSolution solution = new ReverseLinkedListSolution();
        ListNode next2 = solution.reverseListByBrutForce(d);
        do {
            System.out.println(next2.val);
            next2 = next2.next;
        }
        while (next2 != null);


    }
}

class ReverseLinkedListSolution {
    /**
     * Метод разворачивает LinkedList используя рекурсию
     * @param head Голова LinkedList
     * @return Новая голова, развернутого LinkedList
     */
    public ListNode reverseByRecursion(ListNode head) {
        if(head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode newHead = reverseByRecursion(head.next);
        ListNode tail = newHead;
        while (tail.next !=null) {
            tail = tail.next;
        }
        tail.next = head;
        head.next = null;
        return newHead;

    }

    /**
     * Метод разворачивает LinkedList используя перебор
     * @param head Голова LinkedList
     * @return Новая голова, развернутого LinkedList
     */
    public ListNode reverseListByBrutForce(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        do {
            stack.add(head);
            head = head.next;
        }
        while (head != null);
        ListNode newHead = stack.get(stack.size()-1);
        for (int i = stack.size()-1; i > -1; i--) {
            ListNode newHead2 = stack.get(i);
            if (i-1 == -1) {
                newHead2.next = null;
            } else {
                newHead2.next = stack.get(i-1);
            }
        }
        return newHead;
    }


}

