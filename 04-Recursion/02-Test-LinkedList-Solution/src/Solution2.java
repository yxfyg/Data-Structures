class Solution2 {
    public ListNode removeElements(ListNode head, int val) {

        ListNode dummyNode = new ListNode(-1);

        dummyNode.next = head;

        ListNode prev = dummyNode;
        while(prev.next != null){
            if(prev.next.val == val){
                ListNode delNode = prev.next;
                prev.next = delNode.next;
                delNode = null;
            }else {
                prev = prev.next;
            }
        }

        return dummyNode.next;
    }

    public static void main(String[] args) {

        int[] nums = {2, 5, 7, 8, 12, 8, 24};

        ListNode head = new ListNode(nums);
        System.out.println(head);

        System.out.println(new Solution().removeElements(head, 8));
    }
}
