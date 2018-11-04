## 数据流的中位数
### 题目描述

中位数是有序列表中间的数。如果列表长度是偶数，中位数则是中间两个数的平均值。

例如，

[2,3,4] 的中位数是 3

[2,3] 的中位数是 (2 + 3) / 2 = 2.5

设计一个支持以下两种操作的数据结构：

- void addNum(int num) - 从数据流中添加一个整数到数据结构中。
- double findMedian() - 返回目前所有元素的中位数。

```
示例：

addNum(1)
addNum(2)
findMedian() -> 1.5
addNum(3) 
findMedian() -> 2
进阶:

如果数据流中所有整数都在 0 到 100 范围内，你将如何优化你的算法？
如果数据流中 99% 的整数都在 0 到 100 范围内，你将如何优化你的算法？

```

### 解法

**方法一：使用大根堆、小根堆来解。【正解】**

``大根堆``放较小的值，``小根堆``放较大的值，这样中间值就集中在两个堆的根节点上。

```java

private static PriorityQueue<Integer> bigRoot;
    private static PriorityQueue<Integer> smallRoot;

    /** initialize your data structure here. */
    public MedianFinder() {
        bigRoot = new PriorityQueue<>(Comparator.reverseOrder());
        smallRoot = new PriorityQueue<>(Integer::compareTo);
    }

    public void addNum(int num) {
        if(bigRoot.size() == 0 || bigRoot.peek() > num){
            bigRoot.offer(num);
        }else{
            smallRoot.offer(num);
        }
        int bigRootSize = bigRoot.size();
        int smallRootSize = smallRoot.size();
        if(bigRootSize-smallRootSize > 1){
            smallRoot.offer(bigRoot.poll());
        }
        if(smallRootSize-bigRootSize > 1){
            bigRoot.offer(smallRoot.poll());
        }
    }

    public double findMedian() {
        int bigRootSize = bigRoot.size();
        int smallRootSize = smallRoot.size();
        if(bigRootSize == smallRootSize){
            return(bigRoot.peek() + smallRoot.peek())/2.0;
        }
        return bigRootSize>smallRootSize?bigRoot.peek():smallRoot.peek();
    }

```


**方法二：使用数组、排序算法来解。【提交结果超时】**

相比于``方法一``，每次查询中间值都会对整个数组进行排序，性能相对较差。方法一的优点在于，每次插入数值，都能以较小的代价来维护堆。



```java

class MedianFinder {
    
    private static int count = 0;
    private static int[] array = {};

    /** initialize your data structure here. */
    public MedianFinder() {
        array = new int[100000];
        count = 0;
    }

    public void addNum(int num) {
        array[count] = num;
        count++;
    }

    public double findMedian() {
        Arrays.sort(array,0,count);
        if(count % 2 == 0){
            return (array[count/2-1] + array[count/2])/2.0;
        }
        return array[count/2];
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */

```
