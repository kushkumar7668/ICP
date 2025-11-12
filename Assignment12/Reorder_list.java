public class Reorder_list {

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public void reorderList(ListNode head) {
            if (head == null)
                return;

            // Step 1: Find the middle of the list ->
            ListNode slow = head, fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            // Step 2: Reverse the second half of the list
            ListNode second = slow.next;
            slow.next = null;
            ListNode prev = null;

            while (second != null) {
                ListNode ahead = second.next;
                second.next = prev;
                prev = second;
                second = ahead;
            }

            // Step 3: Merge the two halves
            ListNode first = head;
            second = prev;

            while (second != null) {
                ListNode ahead1 = first.next, ahead2 = second.next;
                first.next = second;
                second.next = ahead1;
                first = ahead1;
                second = ahead2;
            }
        }
    }
}
