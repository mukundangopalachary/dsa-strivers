package com.strivers.linkedlist.singlyLL.problems.medium;

import com.strivers.linkedlist.singlyLL.ListNode;

public class CheckPalindrome {

  public boolean isPalindrome(ListNode head) {
    if (head == null || head.next == null)
      return true;

    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    if (fast != null) {
      slow = slow.next;
    }

    ListNode first = head;
    ListNode second = reverse(slow);

    while (second != null) {
      if (first.val != second.val)
        return false;

      first = first.next;
      second = second.next;
    }

    return true;
  }

  public ListNode reverse(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;

    while (curr != null) {
      ListNode next = curr.next;

      curr.next = prev;
      prev = curr;

      curr = next;
    }

    return prev;
  }
}
