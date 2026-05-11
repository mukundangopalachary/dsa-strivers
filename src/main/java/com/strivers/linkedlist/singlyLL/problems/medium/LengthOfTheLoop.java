package com.strivers.linkedlist.singlyLL.problems.medium;

import com.strivers.linkedlist.singlyLL.ListNode;

public class LengthOfTheLoop {

  public int getLengthOfTheLoop(ListNode head) {

    ListNode fast = head;
    ListNode slow = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      if (fast == slow) {
        int count = 0;

        while (fast != slow) {
          ++count;
          fast = fast.next;
        }

        return count;
      }
    }

    return 0;
  }
}
