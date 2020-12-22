public class BST<E extends Comparable<E>> {

    private class Node{

        private E e;
        private Node left, right;

        public Node(E e){
            this.e = e;
            left = null;
            right = null;
        }
    }

    private Node root;
    private int size;

    public BST(){
        root = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    //将元素e添加到二分搜索树中
    public void add(E e){
        add(root, e);
    }

    //向以node为根的二分搜索树中插入元素e，递归算法
    //返回插入新节点的二分搜索树的根节点
    private Node add(Node node, E e){

        if(node == null){
            size ++;
            return new Node(e);
        }

        if(node.e.compareTo(e) > 0){
            node.left = add(node.left, e);
        } else if(node.e.compareTo(e) < 0){
            node.right = add(node.right, e);
        }
        return node;
    }

    //检查二分搜索树中是否包含元素e
    public boolean contains(E e){
        return contains(root, e);
    }

    //检查以node为根的二分搜索树中是否有元素e，递归算法
    private boolean contains(Node node, E e){

        if(node.e.compareTo(e) == 0){
            return true;
        }

        if(node == null){
            return false;
        } else if(node.e.compareTo(e) > 0){
            return contains(node.left, e);
        } else {
            return contains(node.right, e);
        }
    }

}
