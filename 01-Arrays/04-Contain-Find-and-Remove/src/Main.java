public class Main {

    public static void main(String[] args) {

        Array arr = new Array(10);
        for(int i = 0; i < 10; i++){
            arr.addLast(i);
        }
        System.out.println(arr);

        System.out.println(arr.contains(16));
        System.out.println(arr.find(7));
        System.out.println(arr.remove(4));
        System.out.println(arr);
        System.out.println(arr.removeFirst());
        System.out.println(arr);
        System.out.println(arr.removeLast());
        System.out.println(arr);
        arr.removeElement(8);
        System.out.println(arr);
    }
}
