package leetcode.code.linklist;

import org.junit.Test;

import java.util.List;

public class SwapNodesinPairs {

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

        head = swapPairs(head);

        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
        if (head == null) {
            System.out.println("null");
        }
    }

    /**
     * head为null
     * 只有头节点
     * 末尾null判断
     * 奇数节点的情况
     * @param head
     * @return
     */
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode curr = head;
        head = head.next;
        ListNode tempPre = new ListNode(0);

        while (curr != null && curr.next != null) {
            ListNode tempNext = curr.next;
            curr.next = curr.next.next;
            tempNext.next = curr;
            tempPre.next = tempNext;

            curr = curr.next;
            tempPre = tempPre.next.next;
        }

        return head;
    }
}
