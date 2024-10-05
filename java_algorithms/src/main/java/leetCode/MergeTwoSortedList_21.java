package leetCode;

public class MergeTwoSortedList_21 {
        public static void main(String[] args) {

            ListNode list1 = new ListNode(1);
            list1.next = new ListNode(2);
            list1.next.next = new ListNode(4);

            ListNode list2 = new ListNode(1);
            list2.next = new ListNode(3);
            list2.next.next = new ListNode(4);

            // Merging the lists
            ListNode mergedList = mergeTwoLists(list1, list2);

            // Printing the merged linked list
            printList(mergedList);
        }

        // Helper function to print the linked list
        public static void printList(ListNode head) {
            ListNode current = head;
            while (current != null) {
                System.out.print(current.val + " ");
                current = current.next;
            }
            System.out.println();
        }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode dummy = new ListNode(0);
            ListNode current = dummy;
            while(list1 != null && list2 != null) {
                if(list1.val <= list2.val) {
                    current.next = list1;
                    list1 = list1.next;
                } else  {
                    current.next = list2;
                    list2 = list2.next;
                }
                current = current.next;
            }
            current.next = list1 != null ? list1 : list2;
            return dummy.next;
        }
}
