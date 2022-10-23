import java.util.HashSet;

public class Solution {
        public static boolean hasCycle(ListNode head) {
            HashSet<ListNode> nSet = new HashSet<ListNode>();

            if (head == null || head.next == null) {
                return false;
            } else {
                while (head != null) {
                    if (nSet.contains(head)) {
                        return true;
                    } else {
                        nSet.add(head);
                    }

                    head = head.next;
                }
            }

            return  false;
        }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(-4);

        ListNode head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;

        boolean ret = hasCycle(head);
    }
}
