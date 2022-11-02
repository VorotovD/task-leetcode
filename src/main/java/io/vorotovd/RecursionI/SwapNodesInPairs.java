package io.vorotovd.RecursionI;

/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 * You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
 * Constraints:
 * The number of nodes in the list is in the range [0, 100].
 * 0 <= Node.val <= 100
 */
public class SwapNodesInPairs {
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

        SwapNodesInPairsSolution solution = new SwapNodesInPairsSolution();
        ListNode next2 = solution.swapPairs(d);
        do {
            System.out.println(next2.val);
            next2 = next2.next;
        }
        while (next2 != null);

    }
}

class SwapNodesInPairsSolution {
    /**Метод меняет местами два соседних узла в списке
     * @param head Первый узел в списке
     * @return Новый первый узел
     */
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode headNext = head.next;
        ListNode headNextNext = headNext.next;
        head.next.next = head;
        head.next = headNextNext;
        ListNode newHead = headNext;
        ListNode newHeadNext = head;
        newHeadNext.next = swapPairs(headNextNext);
        return newHead;
    }
}


