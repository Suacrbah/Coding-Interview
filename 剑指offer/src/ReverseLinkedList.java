public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode iter = head;
        for (int i = 1; i <= 10; i++) {
            iter.next = new ListNode(i);
            iter = iter.next;
        }
        System.out.println(head);
        System.out.println(ReverseList(head));
    }

    public static ListNode ReverseList(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        ListNode l = head;
        ListNode r = head.next;
        ListNode temp = r;
        head.next = null;

        while (true) {
            temp = r.next;
            r.next = l; l = r;
            if (temp == null) break;
            r = temp;
        }
        return r;
    }
}
