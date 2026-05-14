package com.strivers.linkedlist.singlyLL.problems.medium;

import com.strivers.linkedlist.singlyLL.ListNode;

public class IntersectionOfTwoLinkedList {
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode listA = headA;
    ListNode listB = headB;

    while (listA != listB) {
      listA = listA == null ? headB : listA.next;
      listB = listB == null ? headA : listB.next;
    }

    return listB;
  }
}
