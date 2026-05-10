package com.strivers.linkedlist.singlyLL.problems.medium;

import com.strivers.linkedlist.singlyLL.ListNode;

public class MiddleOfTheLinkedList {

  public ListNode middleNode(ListNode head) {

    ListNode ptr = head;
    int count = 0;
    while (ptr != null) {
      count++;
      ptr = ptr.next;
    }

    if (count == 1)
      return head;

    int mid = count / 2;
    ptr = head;
    int i = 0;
    while (i < mid - 1) {
      ptr = ptr.next;
      i++;
    }
    return ptr.next;
  }

  public ListNode middleNode2(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    return slow;
  }
}
