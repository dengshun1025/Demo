package com.LeetCode;

/**
 *
 * Created by dengshun on 16-9-26.
 */
public class PalindromeLinkedList {

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode head1 = new ListNode(2);
        ListNode head2 = new ListNode(3);
        ListNode head3 = new ListNode(2);
        ListNode head4 = new ListNode(1);
        head.next = head1;
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        System.out.println(isPalindrome(head));
    }

    private static boolean isPalindrome(ListNode head) {
        ListNode slow = head,fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast == null){
            fast = reverseList(slow);
        }else{
            fast = reverseList(slow.next);
        }
        while(fast != null){
            if(fast.val != head.val)
                return false;
            fast = fast.next;
            head = head.next;
        }
        return true;
    }

    private static ListNode reverseList(ListNode head) {
        ListNode temp,prev;
        prev = null;
        while(head != null)
        {
            temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
}
