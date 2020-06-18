//LeetCode 234

class Solution {
    public boolean isPalindrome(final ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        slow = reversed(slow);
        fast = head;

        while (slow != null) {
            if (fast.val != slow.val) {
                return false;
            }

            fast = fast.next;
            slow = slow.next;
        }

        return true;
    }

    public ListNode reversed(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            final ListNode next = head.next;
           head.next = prev;
           prev = head;
            head = next;
        }
        
        return prev;
        
    }
}