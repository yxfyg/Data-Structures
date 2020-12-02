class Solution {
    public ListNode removeElements(ListNode head, int val) {

        while(head != null && head.val == val){
            ListNode delNode = head;
            head = head.next;
            delNode = null;
        }

        if(head == null){
            return null;
        }

        ListNode prev = head;
        while(prev.next != null){
            if(prev.next.val == val){
                ListNode delNode = prev.next;
                prev.next = delNode.next;
                delNode = null;
            }else {
                prev = prev.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {

        int[] nums = {2, 5, 7, 8, 12, 8, 24};

        ListNode head = new ListNode(nums);
        System.out.println(head);

        System.out.println(new Solution().removeElements(head, 8));
    }
}
