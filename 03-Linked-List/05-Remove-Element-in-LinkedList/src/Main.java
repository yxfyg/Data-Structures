public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        for(int i = 0 ; i < 10 ; i ++){
            linkedList.addFirst(i);
            System.out.println(linkedList);
        }

        linkedList.add(3, 800);
        System.out.println(linkedList);

        linkedList.remove(3);
        System.out.println(linkedList);

        linkedList.removeFirst();
        System.out.println(linkedList);

        linkedList.removeLast();
        System.out.println(linkedList);

        linkedList.removeElement(5);
        System.out.println(linkedList);
    }
}
