## 二叉树的后序遍历
### 题目描述

给定一个二叉树，返回它的 后序 遍历。



```
示例:

输入: [1,null,2,3]  
   1
    \
     2
    /
   3 

输出: [3,2,1]
进阶: 递归算法很简单，你可以通过迭代算法完成吗？
```

### 解法

**解法一：使用递归**

```java

class Solution {
    
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        if(root != null){
            traversal(root,list);
        }
        return list;
    }

    public void traversal(TreeNode root,List<Integer> list){

        if(root.left != null){
            traversal(root.left,list);
        }
        if(root.right != null){
            traversal(root.right,list);
        }

        if(root == null){
            return ;
        }

        list.add(root.val);
    }
}

```
