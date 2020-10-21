public class Main {

    public static void main(String[] args) {

        Array<Integer> arr = new Array<>();
        for(int i = 0 ; i < 10 ; i ++){
            arr.addLast(i);
        }
        System.out.println(arr);

        arr.add(2, 86);
        System.out.println(arr);

        arr.addFirst(-35);
        System.out.println(arr);

        arr.remove(6);
        System.out.println(arr);

        arr.removeElement(3);
        System.out.println(arr);

        arr.removeFirst();
        System.out.println(arr);
    }
}
