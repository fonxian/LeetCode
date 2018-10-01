
### 1、第一次提交

执行时间超时

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

### 2、算法优化后，通过的代码

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
