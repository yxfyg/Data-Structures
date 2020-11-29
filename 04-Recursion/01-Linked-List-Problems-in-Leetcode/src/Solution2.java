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
}
