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
