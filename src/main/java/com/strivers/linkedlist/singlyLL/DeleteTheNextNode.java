package com.strivers.linkedlist.singlyLL;

public class DeleteTheNextNode {

  public void deleteNode(ListNode node) {
    node.val = node.next.val;
    node.next = node.next.next;
  }
}
