package com.strivers.linkedlist.doublyLL.problems;

import com.strivers.linkedlist.doublyLL.ListNode;

public class RemoveDuplicatesFromSortedDLL {

  public ListNode distinctList(ListNode head) {

    if (head == null)
      return null;

    ListNode ptr = head;

    while (ptr != null && ptr.next != null) {

      if (ptr.val == ptr.next.val) {
        ListNode duplicate = ptr.next;
        ptr.next = duplicate.next;
        if (duplicate.next != null) {
          duplicate.next.prev = ptr;
        }
        duplicate.next = null;
        duplicate.prev = null;
      } else {
        ptr = ptr.next;
      }
    }

    return head;
  }
}
