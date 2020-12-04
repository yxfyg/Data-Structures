class Solution2 {

    public ListNode removeElements(ListNode head, int val){

        if(head == null){
            return null;
        }

        head.next = removeElements(head.next, val);

//        if(head.val == val){
//            return head.next;
//        }else {
//            return head;
//        }

        return head.val == val ? head.next : head;
    }

    public static void main(String[] args) {

        int[] nums = {2, 5, 7, 8, 12, 8, 24};

        ListNode head = new ListNode(nums);
        System.out.println(head);

        System.out.println(new Solution2().removeElements(head, 8));
    }
}
