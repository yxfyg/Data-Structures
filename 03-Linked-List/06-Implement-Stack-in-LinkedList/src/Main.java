import java.util.Random;

public class Main {

    //测试使用stack运行opCount次push和pop操作所需的时间，单位： 秒
    public static double testStack(Stack<Integer> stack, int opCount) {

        long startTime = System.nanoTime();
        Random random = new Random();

        for(int i = 0 ; i < opCount ; i ++){
            stack.push(random.nextInt(Integer.MAX_VALUE));
        }
        for(int i = 0 ; i < opCount ; i ++){
            stack.pop();
        }

        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;
    }

    public static void main(String[] args) {

        int opCount = 1000000;

        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        System.out.println("ArrayStack, time: " + testStack(arrayStack, opCount) + "s");

        LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();
        System.out.println("LinkedListStack, time: " + testStack(linkedListStack, opCount) + "s");
    }

}
