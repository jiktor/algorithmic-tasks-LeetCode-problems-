package org.example;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		ListNode listNode1 = new ListNode(1,new ListNode(4,new ListNode(7,new ListNode(9,null))));
		ListNode listNode2 = new ListNode(1,new ListNode(2,new ListNode(2,new ListNode(5,new ListNode(5,null)))));

		ListNode newListNode = Solution.mergeTwoLists(listNode1,listNode2);
		while(newListNode!=null){
			System.out.println(newListNode.val);
			newListNode = newListNode.next;
		}
	}

	  public static class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }

	class Solution {
		public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
			if(list2==null){
				return list1;
			}else if(list1==null){
				return list2;
			}
			if(list1.val<list2.val){
				list1.next = mergeTwoLists(list1.next,list2);
				return list1;
			}else{
				list2.next = mergeTwoLists(list1,list2.next);
				return list2;
			}
		}
	}
}