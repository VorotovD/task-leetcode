package io.vorotovd.RecursionI;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedListTest {
    @Test
    public void reverseRecursion5Node() {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = new ArrayList<>();
        expected.add(5);
        expected.add(4);
        expected.add(3);
        expected.add(2);
        expected.add(1);

        ReverseLinkedListSolution solution = new ReverseLinkedListSolution();
        ListNode headActual = solution.reverseByRecursion(a);
        do {
            actual.add(headActual.val);
            headActual = headActual.next;
        }
        while (headActual != null);
        Assertions.assertEquals(actual,expected);
    }

    @Test
    public void reverseByBrutForceBy5Node() {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = new ArrayList<>();
        expected.add(5);
        expected.add(4);
        expected.add(3);
        expected.add(2);
        expected.add(1);

        ReverseLinkedListSolution solution = new ReverseLinkedListSolution();
        ListNode headActual = solution.reverseListByBrutForce(a);
        do {
            actual.add(headActual.val);
            headActual = headActual.next;
        }
        while (headActual != null);
        Assertions.assertEquals(actual,expected);
    }
}
