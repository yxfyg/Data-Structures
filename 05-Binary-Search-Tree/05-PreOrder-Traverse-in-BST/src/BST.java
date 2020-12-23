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
        root = add(root, e);
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

    //二分搜索树的前序遍历
    public void preOrder(){
        preOrder(root);
    }

    //前序遍历以node为根的二分搜索树，递归算法
    private void preOrder(Node node){

        if(node == null){
            return;
        }

        System.out.println(node.e);
        preOrder(node.left);
        preOrder(node.right);
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        generateBSTString(root, 0, res);
        return res.toString();
    }

    //生成以node为根节点，深度为depth的描述二叉树的字符串
    private void generateBSTString(Node node, int depth, StringBuilder res){

        String depthString = generateDepthString(depth);
        if(node == null){
            res.append(depthString + "null\n");
            return;
        }

        res.append(depthString + node.e + "\n");
        generateBSTString(node.left, depth + 1, res);
        generateBSTString(node.right, depth + 1, res);
    }

    private String generateDepthString(int depth){
        StringBuilder res = new StringBuilder();
        for(int i = 0 ; i < depth ; i ++){
            res.append("--");
        }
        return res.toString();
    }
}
