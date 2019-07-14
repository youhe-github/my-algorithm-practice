package leetcode.code.linklist;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
    /**
     * 最开始写错：使用的是head.next != null判断终止条件，却没有考虑到head本身为null的情况
     * 注意点：
     * 1. head 是否为null
     * 2. 非return出循环说明没有环，返回false
     * 3. 尽量使用head != null来做为循环终止条件吧，可以避免刚才的错误
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        Set<ListNode> nodesCheck = new HashSet<>();

        while (head != null) {
            if (nodesCheck.contains(head)) {
                return true;
            } else {
                nodesCheck.add(head);
            }

            head = head.next;
        }

        return false;
    }

    /**
     * 注意点：
     * 1. head和head.next null判断
     * 2. 出循环的时候应该是返回true
     * 3. 出循环的时候返回true的话关于fast null判断就不能放在循环条件里面，因为这样出循环应该是false，和上面冲突。
     * 4. 重要：fast和slow的初始值不能相等
     * @param head
     * @return
     */
    public boolean hasCycle2(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != slow) {
            if (fast == null || fast.next == null) {
                return false;
            }

            fast = fast.next.next;
            slow = slow.next;
        }

        return true;
    }
}
