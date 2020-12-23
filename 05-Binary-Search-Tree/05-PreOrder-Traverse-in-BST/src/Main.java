public class Main {

    public static void main(String[] args) {

        BST<Integer> bst = new BST<>();
        int[] nums = {5, 6, 7, 8, 2, 7, 4, 9, 1, 3};

        for(int num : nums){
            bst.add(num);
        }

        bst.preOrder();
        System.out.println();

        System.out.println(bst);
    }
}

    //思考题：重写二分搜索树的toString方法，输出如下形式的字符串
      /////////////////
      //      5      //
      //    /   \    //
      //   3    6    //
      //  / \    \   //
      // 2  4     8  //
      /////////////////
