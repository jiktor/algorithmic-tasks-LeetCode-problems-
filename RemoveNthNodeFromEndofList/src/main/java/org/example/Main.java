package org.example;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		ListNode head = new ListNode(0,null);
		ListNode temp = new ListNode();
		head.next=temp;
		for(int i=1;i<20;i++){
			ListNode listNode = new ListNode(i,null);
			temp.next = listNode;
			temp = temp.next;
		}
		Solution.removeNthFromEnd(head,6);
		while(head != null){
			System.out.println(head.val);
			head=head.next;
		}
	}
	class Solution {
		public static ListNode removeNthFromEnd(ListNode head, int n) {
			ListNode dummy = new ListNode(0,head);
			ListNode left = dummy;
			ListNode right = head;

			while(n>0 && right!=null){
				right = right.next;
				n--;
			}
			while(right != null){
				left = left.next;
				right = right.next;
			}
			left.next = left.next.next;

			return dummy.next;
		}
	}
	 public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}