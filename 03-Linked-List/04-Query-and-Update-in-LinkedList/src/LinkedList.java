public class LinkedList<E> {

    private class Node{
        public E e;
        public Node next;

        public Node(E e, Node next){
            this.e = e;
            this.next = next;
        }

        public Node(E e){
            this(e, null);
        }

        public Node(){
            this(null, null);
        }

        @Override
        public String toString(){
            return e.toString();
        }
    }

    private Node dummyHead;
    private int size;

    public LinkedList(){
        dummyHead = new Node();
        size = 0;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void addFirst(E e){
//        Node node = new Node(e);
//        node.next = head;
//        head = node;

        add(0, e);
        size ++;
    }

    //在链表的index(0-based)位置添加一个新的元素e（在链表中不常用该操作，此处用作练习）
    public void add(int index, E e){

        if(index < 0 || index > size){
            throw new IllegalArgumentException("Add failed. Illegal index.");
        }

        Node prev = dummyHead;

        for(int i = 0 ; i < index ; i ++){
            prev = prev.next;
        }

//            Node node = new Node(e);
//            node.next = prev.next;
//            prev.next = node;

        prev.next = new Node(e, prev.next);
        size ++;
    }

    //在链表末尾添加元素
    public void addLast(E e){
        add(size , e);
    }

    //获取链表的第index（0-based）位置的元素（在链表中不常用该操作，此处用作练习）
    public E get(int index){

        if(index < 0 || index >= size){
            throw new IllegalArgumentException("Get failed. Illegal index.");
        }

        Node cur = dummyHead.next;
        for(int i = 0 ; i < index ; i ++){
            cur = cur.next;
        }
        return cur.e;
    }

    //获得链表的第一个元素
    public E getFirst(){
        return get(0);
    }

    //获得链表的最后一个元素
    public E getLast(){
        return get(size - 1);
    }

    //修改链表的第index（0-based）位置的元素为e（在链表中不常用该操作，此处用作练习）
    public void set(int index, E e){

        if(index < 0 || index >= size){
            throw new IllegalArgumentException("Set failed. Illegal index.");
        }

        Node cur = dummyHead.next;
        for(int i = 0 ; i < index ; i ++){
            cur = cur.next;
        }
        cur.e = e;
    }

    //查找链表中是否有元素e
    public boolean contains(E e){

        Node cur = dummyHead.next;
        while(cur != null){
            if(cur.e.equals(e)){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    @Override
    public String toString(){

        StringBuilder builder = new StringBuilder();

        for(Node cur = dummyHead.next ; cur != null ; cur = cur.next){
            builder.append(cur + "->");
        }
        builder.append("NULL");

        return builder.toString();
    }
}