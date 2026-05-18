package com.strivers.linkedlist.doublyLL.problems;

import com.strivers.linkedlist.doublyLL.ListNode;

public class DeleteAllTheOccurencesOfAKeyInDLL {

  public ListNode deleteAllOccurrences(ListNode head, int target) {

    ListNode curr = head;

    while (curr != null) {

      ListNode nextNode = curr.next;

      if (curr.val == target) {
        // updating previous node
        if (curr.prev != null) {
          curr.prev.next = curr.next;
        } else {
          // deleting head
          head = curr.next;
        }
        // updating next node
        if (curr.next != null) {
          curr.next.prev = curr.prev;
        }
      }
      curr = nextNode;
    }
    return head;
  }
}
