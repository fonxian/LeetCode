class Solution {

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

