import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public static int lengthOfLongestSubstring(String s) {

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
