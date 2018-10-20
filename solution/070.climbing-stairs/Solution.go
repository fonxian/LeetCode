func climbStairs(n int) int {
    
    var array [10000]int

    array[0] = 0
    array[1] = 1
    array[2] = 2

    for i := 3; i <= n; i++ {
        array[i] = array[i-1] + array[i-2]
    }

    return array[n]
    
}
