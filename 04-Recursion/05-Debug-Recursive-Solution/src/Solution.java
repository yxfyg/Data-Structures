class Solution {

    public ListNode removeElements(ListNode head, int val, int depth){

        String depthString = generateDepthString(depth);
        System.out.print(depthString);
        System.out.println("Call: remove " + val + " in " + head);

        if(head == null){
            System.out.print(depthString);
            System.out.println("Return: " + head);
            return null;
        }

        ListNode res = removeElements(head.next, val, depth + 1);
        System.out.print(depthString);
        System.out.println("After: remove " + val + ": " + res);

        ListNode ret;
        if(head.val == val){
            ret = res;
        }else {
            head.next = res;
            ret = head;
        }
        System.out.print(depthString);
        System.out.println("Return: " + ret);

        return ret;
    }

    private String generateDepthString(int depth) {

        StringBuilder depthString = new StringBuilder();
        for(int i = 0 ; i < depth ; i ++){
            depthString.append("--");
        }
        return depthString.toString();
    }

    public static void main(String[] args) {

        int[] nums = {2, 5, 7, 8, 12, 8, 24};

        ListNode head = new ListNode(nums);
        System.out.println(head);

        System.out.println(new Solution().removeElements(head, 8, 0));
    }
}
