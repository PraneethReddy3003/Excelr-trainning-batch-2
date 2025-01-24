public class LT004 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }

        public static ListNode deserialize(String data) {
            String[] values = data.split(",");
            ListNode dummyHead = new ListNode(0);
            ListNode current = dummyHead;
            for (String value : values) {
                current.next = new ListNode(Integer.parseInt(value.trim()));
                current = current.next;
            }
            return dummyHead.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;
        
        while (l1 != null || l2 != null) {
            int sum = carry + (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        
        return dummyHead.next;
    }

    public static void main(String[] args) {
        LT004 solution = new LT004();
        
        ListNode l1 = ListNode.deserialize("2,4,3");
        ListNode l2 = ListNode.deserialize("5,6,4");
        printList(solution.addTwoNumbers(l1, l2)); 
        
        ListNode l3 = ListNode.deserialize("0");
        ListNode l4 = ListNode.deserialize("0");
        printList(solution.addTwoNumbers(l3, l4));
        
        ListNode l5 = ListNode.deserialize("9,9,9,9,9,9,9");
        ListNode l6 = ListNode.deserialize("9,9,9,9");
        printList(solution.addTwoNumbers(l5, l6)); 

    }
    
    private static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + (node.next != null ? " -> " : ""));
            node = node.next;
        }
        System.out.println();
    }
}