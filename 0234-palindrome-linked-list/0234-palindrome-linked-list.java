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
        ListNode node = head;
        Deque<Integer> deque = new LinkedList<>();

        while(node != null) {
            deque.push(node.val);
            node = node.next;
        }

        while(!deque.isEmpty() && deque.size() > 1) {
            if(deque.pollFirst() != deque.pollLast()) {
                return false;
            }
        }
        return true;
    }
}