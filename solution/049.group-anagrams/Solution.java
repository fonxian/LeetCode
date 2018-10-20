class Solution {
    
    public List<List<String>> groupAnagrams(String[] strs) {
        
                Map<String, List<String>> map = new HashMap<String, List<String>>();
        
        for (String str : strs) {
            char[] aArray = str.toCharArray();
            Arrays.sort(aArray);
            String aStr = String.valueOf(aArray);

            if(map.get(aStr) != null){
                map.get(aStr).add(str);
                continue ;
            }
            List<String> array = new ArrayList<String>();
            array.add(str);
            map.put(aStr, array);
        }

        List<List<String>> resultList = new ArrayList<List<String>>();

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            resultList.add(entry.getValue());
        }

        return resultList;
        
    }
    

    
}