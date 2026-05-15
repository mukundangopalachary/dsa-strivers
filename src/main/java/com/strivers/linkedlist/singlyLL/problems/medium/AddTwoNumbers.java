package com.strivers.linkedlist.singlyLL.problems.medium;

import com.strivers.linkedlist.singlyLL.ListNode;

public class AddTwoNumbers {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummyHead = new ListNode(0);
    ListNode curr = dummyHead;
    int carry = 0;

    // Loop as long as there are digits to add or a carry to process
    while (l1 != null || l2 != null || carry != 0) {
      int x = (l1 != null) ? l1.val : 0;
      int y = (l2 != null) ? l2.val : 0;

      int sum = carry + x + y;
      carry = sum / 10; // Calculate new carry

      curr.next = new ListNode(sum % 10); // Store units place
      curr = curr.next;

      // Move to next nodes if they exist
      if (l1 != null)
        l1 = l1.next;
      if (l2 != null)
        l2 = l2.next;
    }

    return dummyHead.next;
  }
}
