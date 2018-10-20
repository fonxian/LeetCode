## 字母异位词分组

### 题目描述

给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。



```
示例:

输入: ["eat", "tea", "tan", "ate", "nat", "bat"],
输出:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
说明：

所有输入均为小写字母。
不考虑答案输出的顺序。

```

### 解法

```java

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


```