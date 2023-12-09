package org.example;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		String s ;
		ListNode l1 = new ListNode(1,new ListNode(9,new ListNode(6,new ListNode(6,null))));
		ListNode l2 = new ListNode(1,new ListNode(9,new ListNode(6,null)));
		ListNode l3 = Solution1.addTwoNumbers(l1,l2);
		for(int i=0;l3!=null;i++){
			System.out.println(l3.val);
			l3=l3.next;
		}
	}
}
class ListNode {
	int val;
	ListNode next;

	ListNode() {}

	ListNode(int val) {this.val = val;}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

class Solution1 {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		return addTwoNodes(l1,l2,0);
	}
	public static ListNode addTwoNodes(ListNode l1, ListNode l2, int transfered){
		ListNode result = new ListNode();
		if(l1 == null && l2 ==null){
			if(transfered == 1){
				result.val=1;
				result.next = addTwoNodes(null,null,0);
			}
			else
				return null;
		}
		else{
			if(l1 == null){
				if(l2.val + transfered == 10){
					result.val = 0;
					result.next = addTwoNodes(null,l2.next,1);
				}else if(l2.val + transfered > 10){
					result.val = 0;
					result.next = addTwoNodes(null,l2.next,1);
				}else{
					//l2+transfered < 10
					result.val = l2.val+transfered;
					result.next = addTwoNodes(null,l2.next,0);
				}
			}else if(l2 == null){
				if(l1.val+transfered == 10){
					result.val = 0;
					result.next = addTwoNodes(l1.next,null,1);
				}else if(l1.val+transfered > 10){
					result.val = 0;
					result.next = addTwoNodes(l1.next,null,1);
				}else{
					//l2+transfered < 10
					result.val = l1.val+transfered;
					result.next = addTwoNodes(l1.next,null,0);
				}
			}else{
				//ima li ostatyk
				if((l1.val+l2.val + transfered)>10){
					result.val = (l1.val + l2.val + transfered)%10;
					result.next = addTwoNodes(l1.next,l2.next,1);
				}else if((l1.val+l2.val+transfered)==10){
					result.val = 0;
					result.next = addTwoNodes(l1.next,l2.next,1);
				}else{
					result.val = l1.val + l2.val + transfered;
					transfered -= transfered;
					result.next = addTwoNodes(l1.next,l2.next,transfered);
				}
			}
		}

		return result;
	}
}
