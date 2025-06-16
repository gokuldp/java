class ListNode {
  int val;
  ListNode next;

  ListNode(int val) {
    this.val = val;
  }
}

class Solution {
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if (list1 == null || list2 == null)
      return list1 == null ? list2 : list1;

    if (list1.val > list2.val) {
      ListNode temp = list1;
      list1 = list2;
      list2 = temp;
    }

    list1.next = mergeTwoLists(list1.next, list2);
    return list1;
  }
}

public class leetcode21 {
  public static void printList(ListNode head) {
  while (head != null)   {
      System.out.print(head.val + " -> ");
      head = head.next;
    }
    System.out.println("null");
  }

  public static void main(String[] args) {
    // Create list1: 1 -> 3 -> 5
    ListNode list1 = new ListNode(1);
    list1.next = new ListNode(3);
    list1.next.next = new ListNode(5);

    // Create list2: 2 -> 4 -> 6
    ListNode list2 = new ListNode(2);
    list2.next = new ListNode(4);
    list2.next.next = new ListNode(6);

    Solution solution = new Solution();
    ListNode merged = solution.mergeTwoLists(list1, list2);

    System.out.print("Merged List: "+merged.val);
    printList(merged);

  }
}

  
    

