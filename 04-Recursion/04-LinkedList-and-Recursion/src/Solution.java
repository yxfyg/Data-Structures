class Solution {

    public ListNode removeElements(ListNode head, int val){

        if(head == null){
            return null;
        }

        ListNode res = removeElements(head.next, val);

        if(head.val == val){
            return res;
        }else {
            head.next = res;
            return head;
        }
    }

    public static void main(String[] args) {

        int[] nums = {2, 5, 7, 8, 12, 8, 24};

        ListNode head = new ListNode(nums);
        System.out.println(head);

        System.out.println(new Solution().removeElements(head, 8));
    }
}
