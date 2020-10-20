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

    //在所有元素后添加一个新元素
    public void addLast(int e){
        add(size, e);
    }

    //在所有元素前添加一个新元素
    public void addFirst(int e){
        add(0, e);
    }

    //在index位置插入一个新元素
    public void add(int index, int e){

        if(size == data.length){
            throw new IllegalArgumentException("Add failed. Array is full.");
        }

        if(index < 0 || index > size){
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size");
        }

        for(int i = size - 1 ; i >= index ; i--){
            data[i + 1] = data[i];
        }

        data[index] = e;
        size++;
    }

    //获取index索引位置的元素
    public int get(int index){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("Get failed. Index is illegal.");
        }
        return data[index];
    }

    //修改index索引位置的元素
    public void set(int index, int e){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("Set failed. Index is illegal.");
        }
        data[index] = e;
    }

    @Override
    public String toString(){

        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d , capacity = %d\n", size, data.length));
        res.append("[");
        for(int i = 0 ; i < size ; i++){
            res.append(data[i]);
            if(i != size - 1){
                res.append(",");
            }
        }
        res.append("]");
        return res.toString();
    }
}
