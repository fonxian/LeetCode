## 两数相加
### 题目描述

给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。

你可以假设除了数字 0 之外，这两个数字都不会以零开头。

示例：


```
输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
输出：7 -> 0 -> 8
原因：342 + 465 = 807
```

### 解法



java版

```java

public class Solution {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode tmpL1 = l1;
        ListNode tmpL2 = l2;
        ListNode l3 = null;
        int jinwei = 0;

        while (tmpL1 != null || tmpL2 != null || jinwei == 1) {

            int value1 = tmpL1 == null ? 0 : tmpL1.val;
            int value2 = tmpL2 == null ? 0 : tmpL2.val;

            int value = value1 + value2 + jinwei;

            if (tmpL1 != null) {
                tmpL1 = tmpL1.next;
            }
            if (tmpL2 != null) {
                tmpL2 = tmpL2.next;
            }

            ListNode newNode = new ListNode(value % 10);
            jinwei = value >= 10 ? 1 : 0;

            if (l3 == null) {
                l3 = newNode;
            } else {
                ListNode temp = l3;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }

        }
        return l3;

    }


}

```







