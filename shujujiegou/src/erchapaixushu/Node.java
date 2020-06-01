package erchapaixushu;

public class Node  {
    int value;
    Node left;
    Node right;
    public Node(int value){
        this.value=value;
    }
    //向子树中添加节点
    public void add(Node node){
        if (node==null){
            return;
        }
        //判断传入的节点的值比当前子树的根节点的值大还是小
        //添加的节点比当前节点的值更小
        if (node.value<this.value){
            //如果左节点为空
            if (this.left==null){
                this.left=node;
                //如果不为空
            }else{
                this.left.add(node);
            }
        }else {
            if (this.right==null){
                this.right=node;
            }else{
                this.right.add(node);
            }
        }
    }
    //中序遍历
    public void frontShow(Node node) {
        if (node==null){
            return;
        }
        node.left.frontShow(node);
        System.out.println(node.value);
        node.right.frontShow(node);
    }
}
