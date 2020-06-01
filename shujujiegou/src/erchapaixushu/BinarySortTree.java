package erchapaixushu;

public class BinarySortTree {
    Node root;
    //向二叉树中添加节点
    public void add(Node node){
        //如果是一颗空树
        if (root==null){
            root=node;
        }else {
            root.add(node);
        }
    }
    //中序遍历二叉树，从小到大的顺序
    public void frontShow(){
        if (root!=null){
           // root.frontShow();
        }
    }
}
