package Assignment9;

public class palindrome_linked_list {
    
 // Definition for singly-linked list.
 public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = reverseList(slow.next);
        slow.next = temp;
        ListNode p1 = head;
        ListNode p2 = temp;
        while(p2 != null){
            if(p1.val != p2.val) return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
    public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;
    // refer monu bhaiya lecture 2 on linked list at time-stamp-> 1:26:00
    while(curr != null){
        ListNode  ahead=curr.next;    //step1
        curr.next=prev;              //step2
        prev = curr;                //step3
        curr=ahead;                   //step4
    }
    return prev;
    }
}
}
