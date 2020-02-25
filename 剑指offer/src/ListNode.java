public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }

    public String toString() {
        if (next == null) return Integer.toString(val);
        else return Integer.toString(val) + " -> " + next.toString();
    }
}