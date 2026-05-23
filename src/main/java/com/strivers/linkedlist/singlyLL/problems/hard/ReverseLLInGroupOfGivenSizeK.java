package com.strivers.linkedlist.singlyLL.problems.hard;

import com.strivers.linkedlist.singlyLL.ListNode;

public class ReverseLLInGroupOfGivenSizeK {
  public ListNode reverseKGroup(ListNode head, int k) {
    if (head == null)
      return null;

    ListNode end = head;

    for (int i = 0; i < k; i++) {
      if (end == null)
        return head;
      end = end.next;
    }

    ListNode newHead = reverse(head, end);
    head.next = reverseKGroup(end, k);
    return newHead;

  }

  private ListNode reverse(ListNode curr, ListNode end) {
    ListNode prev = null;

    while (curr != end) {
      ListNode next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }

    return prev;
  }
}
