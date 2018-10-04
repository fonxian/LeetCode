## 无重复字符的最长子串
### 题目描述

给定一个字符串，找出不含有重复字符的最长子串的长度。

```
示例 1:

输入: "abcabcbb"
输出: 3 
解释: 无重复字符的最长子串是 "abc"，其长度为 3。
示例 2:

输入: "bbbbb"
输出: 1
解释: 无重复字符的最长子串是 "b"，其长度为 1。
示例 3:

输入: "pwwkew"
输出: 3
解释: 无重复字符的最长子串是 "wke"，其长度为 3。
     请注意，答案必须是一个子串，"pwke" 是一个子序列 而不是子串。
```

### 解法



java版

```java

public class Solution {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        char[] array = s.toCharArray();
        Queue<String> queue = new LinkedList<String>();
        int maxNum = 0;
        for (int i = 0; i < array.length; i++) {

            if (queue.contains(array[i] + "")) {
                if (queue.size() > maxNum) {
                    maxNum = queue.size();
                }
                while(!queue.poll().equals(array[i]+"")){

                }
            }

            queue.add(array[i] + "");

            if (queue.size() > maxNum) {
                maxNum = queue.size();
            }

        }
        return maxNum;
        
    }


}

```







