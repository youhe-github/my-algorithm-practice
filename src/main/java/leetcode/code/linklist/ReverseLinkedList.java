package leetcode.code.linklist;

import org.junit.Test;

public class ReverseLinkedList {
    @Test
    public void test() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        ListNode head = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

//        while (head != null) {
//            System.out.println(head.val);
//            head = head.next;
//        }
//        if (head == null) {
//            System.out.println("null");
//        }

        head = reverseList(head);

        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
        if (head == null) {
            System.out.println("null");
        }
    }

    /**
     * 注意输入为null
     * 注意只有头节点的情况
     * 注意末尾的null处判断
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        head = null;

        while (current != null) {
            ListNode currNext = current.next;
            current.next = head;
            head = current;
            current = currNext;
        }

        return head;
    }

    /**
     * 注意输入为null
     * 注意只有头节点的情况
     * 注意末尾的null处判断
     * @param head
     * @return
     */
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;
        while (current.next != null) {
            ListNode newHead = current.next;
            current.next = current.next.next;
            newHead.next = head;
            head = newHead;
        }

        return head;
    }
}
