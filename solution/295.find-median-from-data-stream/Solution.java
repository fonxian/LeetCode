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