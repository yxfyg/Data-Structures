import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        BST<Integer> bst = new BST<>();
        Random random = new Random();

        //test removeMin
        for(int i = 0 ; i < 1000 ; i ++){
            bst.add(random.nextInt(10000));
        }

        ArrayList<Integer> nums = new ArrayList<>();
        while(!bst.isEmpty()){
            nums.add(bst.removeMin());
        }

        System.out.println(nums);

        for(int i = 1 ; i < nums.size() ; i ++){
            if(nums.get(i - 1) > nums.get(i)){
                throw new IllegalArgumentException("Error!");
            }
        }
        System.out.println("removeMin test completed.");

        //test removeMax
        for(int i = 0 ; i < 1000 ; i ++){
            bst.add(random.nextInt(10000));
        }

        nums = new ArrayList<>();
        while(!bst.isEmpty()){
            nums.add(bst.removeMax());
        }

        System.out.println(nums);

        for(int i = 1 ; i < nums.size() ; i ++){
            if(nums.get(i - 1) < nums.get(i)){
                throw new IllegalArgumentException("Error!");
            }
        }
        System.out.println("removeMax test completed.");
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
