package leetcode.code.linklist;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycleii {

    public ListNode detectCycle(ListNode head) {
        Set<ListNode> checkNodes = new HashSet<>();
        while (head != null) {
            if (checkNodes.contains(head)) {
                return head;
            } else {
                checkNodes.add(head);
                head = head.next;
            }
        }

        return null;
    }
}
