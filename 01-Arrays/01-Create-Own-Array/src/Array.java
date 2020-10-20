/**
 * 通过对JDK中的数组进行封装，创造自定义的数组
 */
public class Array {

    private int[] data;
    //当前数组中存储的元素个数（也表示数组中第一个没有存储元素的位置的索引）
    private int size;

    //构造函数，传入数组的容量capacity构造Array
    public Array(int capacity){
        data = new int[capacity];
    }

    //无参构造函数，默认数组的容量capacity为10
    public Array(){
        this(10);
    }

    //获取当前数组中存储的元素个数
    public int getSize(){
        return size;
    }

    //获取数组的容量
    public int getCapacity(){
        return data.length;
    }

    //判断数组是否为空
    public boolean isEmpty(){
        return size == 0;
    }

}
