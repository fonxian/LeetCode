## 爬楼梯
### 题目描述

假设你正在爬楼梯。需要 n 阶你才能到达楼顶。

每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

注意：给定 n 是一个正整数。

```
示例 1：

输入： 2
输出： 2
解释： 有两种方法可以爬到楼顶。
1.  1 阶 + 1 阶
2.  2 阶
示例 2：

输入： 3
输出： 3
解释： 有三种方法可以爬到楼顶。
1.  1 阶 + 1 阶 + 1 阶
2.  1 阶 + 2 阶
3.  2 阶 + 1 阶
```

### 解法

使用动态规划来解，台阶数为n，方案数为d(n)

```

d(n) = d(n-1) + d(n-2)

```
java版

（1）首次提交代码

```java

public class Solution {

    public static int climbStairs(int n) {

        int[] target = new int[n+2];
        int[] result = new int[n+2];

        target[0] = 0;
        target[1] = 1;
        target[2] = 2;
        result[0] = 0;
        result[1] = 1;
        result[2] = 2;

        for (int i = 3; i <= n; i++) {
            target[i] = i;
            result[i] = 0;
            if (target[i] == target[i - 1] + 1) {
                result[i]+= result[i-1];
            }
            if (target[i] == target[i - 2] + 2) {
                result[i]+= result[i-2];
            }

        }
        return result[n];

    }

}



```
（2）简化后，提交代码

```java

public class Solution {

    public static int climbStairs(int n) {

        int[] result = new int[n+2];

        result[0] = 0;
        result[1] = 1;
        result[2] = 2;

        for (int i = 3; i <= n; i++) {
      
            result[i]+= result[i-1] + result[i-2];
            
        }
        return result[n];

    }

}


```




