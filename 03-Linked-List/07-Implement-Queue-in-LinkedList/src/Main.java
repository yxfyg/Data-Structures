import java.util.Random;

public class Main {

    private static double testQueue(Queue<Integer> queue, int opCount){

        long startTime = System.nanoTime();
        Random random = new Random();

        for(int i = 0 ; i < opCount ; i ++){
            queue.enqueue(random.nextInt(Integer.MAX_VALUE));
        }

        for(int i = 0 ; i < opCount ; i ++){
            queue.dequeue();
        }

        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;
    }

    public static void main(String[] args) {

        int opCount = 100000;

        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        System.out.println("ArrayQueue, time: " + testQueue(arrayQueue, opCount) + "s");

        LoopQueue<Integer> loopQueue = new LoopQueue<>();
        System.out.println("LoopQueue, time: " + testQueue(loopQueue, opCount) + "s");

        LinkedListQueue<Integer> linkedListQueue = new LinkedListQueue<>();
        System.out.println("LinkedListQueue, time: " + testQueue(linkedListQueue, opCount) + "s");
    }

}
