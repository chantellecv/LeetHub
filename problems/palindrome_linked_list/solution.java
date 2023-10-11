/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = slow;
        ListNode current = slow.next;
        prev.next = null;
        
        while (current != null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        while (prev != null){
            if (head.val != prev.val){
                return false;
            }
            head = head.next;
            prev = prev.next;
        }
        return true;
    }
}