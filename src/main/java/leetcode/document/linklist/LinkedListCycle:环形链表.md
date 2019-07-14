# LinkedListCycle:环形链表
### 原文链接
- 英文链接：https://leetcode.com/problems/linked-list-cycle/
- 中文链接：https://leetcode-cn.com/problems/linked-list-cycle/

### 描述
给定一个链表，判断链表中是否有环。

### 我的提示
单向链表中如果有环就只可能有一个环，而且是在链表的尾部的环。

### 解法
官方答案链接：https://leetcode-cn.com/problems/linked-list-cycle/solution/huan-xing-lian-biao-by-leetcode/

#### 思路
1. 用set存储，遍历链表，通过遍历时判断链表地址是否在set中来判断
2. 龟兔赛跑，一步+二步。 必定会相遇，如果快的正好落后慢的一步，下一次就会相遇了。

#### 代码
注意点：

1. 官方答案1：
2. 官方答案2：