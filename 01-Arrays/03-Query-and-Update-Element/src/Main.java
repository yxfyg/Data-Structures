public class Main {

    public static void main(String[] args) {

        Array arr = new Array(15);
        for(int i = 0; i < 10; i++){
            arr.addLast(i);
        }
        System.out.println(arr);

        arr.addFirst(92);
        System.out.println(arr);

        arr.add(2, 80);
        System.out.println(arr);

        arr.set(5, 86);
        System.out.println(arr);

        System.out.println(arr.get(11));
        System.out.println(arr.getCapacity());;
        System.out.println(arr.getSize());
    }

}
