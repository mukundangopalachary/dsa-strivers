package com.strivers.linkedlist.singlyLL.problems.medium;

import com.strivers.linkedlist.singlyLL.ListNode;

public class FindTheStartingPointOfLoop {

  public ListNode detectCycle(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;

    boolean flag = false;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      if (slow == fast) {
        flag = true;
        break;
      }
    }

    if (flag == false)
      return null;

    slow = head;
    while (slow != fast) {
      slow = slow.next;
      fast = fast.next;
    }

    return slow;
  }
}
