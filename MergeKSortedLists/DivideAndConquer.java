package com.dsa.main;

import com.dsa.linkedlists.Node;

public class DivideAndConquer {
    public Node mergeKLists(Node[] lists) {
        if (lists == null || lists.length == 0) return null;
        return divideAndConquer(lists, 0, lists.length - 1);
    }

    private Node divideAndConquer(Node[] lists, int start, int end) {
        if (start == end) return lists[start];

        int mid = start + (end - start) / 2;

        // Recursively split the lists into two halves
        Node left = divideAndConquer(lists, start, mid);
        Node right = divideAndConquer(lists, mid + 1, end);

        // Merge the two resulting lists using our efficient helper
        return mergeTwoLists(left, right);
    }

    // Your efficient "Surgical Stitch" helper
    public Node mergeTwoLists(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.value <= l2.value) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        tail.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }
}
