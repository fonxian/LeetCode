class MedianFinder {

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
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */