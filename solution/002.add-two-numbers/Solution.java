public class Solution {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode tmpL1 = l1;
        ListNode tmpL2 = l2;
        ListNode l3 = null;
        int jinwei = 0;

        while (tmpL1 != null || tmpL2 != null || jinwei == 1) {

            int value1 = tmpL1 == null ? 0 : tmpL1.val;
            int value2 = tmpL2 == null ? 0 : tmpL2.val;

            int value = value1 + value2 + jinwei;

            if (tmpL1 != null) {
                tmpL1 = tmpL1.next;
            }
            if (tmpL2 != null) {
                tmpL2 = tmpL2.next;
            }

            ListNode newNode = new ListNode(value % 10);
            jinwei = value >= 10 ? 1 : 0;

            if (l3 == null) {
                l3 = newNode;
            } else {
                ListNode temp = l3;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }

        }
        return l3;

    }


}
