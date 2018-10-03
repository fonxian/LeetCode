
### 1、第一次提交

## 两数之和
### 题目描述

给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。

你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。

示例:
```
给定 nums = [2, 7, 11, 15], target = 9

因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
```

### 解法



java版

```java

public class Solution {

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                int[] result = new int[2];
                result[0] = map.get(target-nums[i]);
                result[1] = i;
                return result;
            }else{
                map.put(nums[i],i);
            }
        }

        return null;
    }

}

```

scala版

```scala

import scala.collection.mutable

object Solution {

    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        var map = new mutable.HashMap[Int, Int]()
        for (i <- 0 to nums.length) {
          if (map.contains(target - nums(i))) {
            return Array(map(target - nums(i)), i)
          } else {
            map += (nums(i) -> i)
          }
        }
        Array(0, 0)
    }
    
}

```

### 提交过程

**提交一:** 执行时间超时



```scala

object Solution {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        for (i <- 0 to nums.length - 2) {
            val index = nums(i)
            for (j <- (i + 1) to nums.length - 1) {
                if (index + nums(j) == target) {
                    return Array(i, j)
                }
            }
        }
        Array(0,0)
    }
}

```


