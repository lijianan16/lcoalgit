package shu;

public class BinaryTree {
    TreeNode root;
    //设置根节点
    public void setRoot(TreeNode root) {
        this.root = root;
    }
    //获取根节点
    public TreeNode getRoot(){
        return root;
    }
    //前序遍历
    public void frontshow(){
        if (root!=null){
            root.frontShow();
        }

    }
    //中序遍历
    public void midshow(){
        if (root!=null){
            root.midShow();
        }
    }
    //后序遍历
    public void backshow(){
        if (root!=null){
            root.backShow();
        }
    }
    //查找
    public TreeNode frontSearch(int i){
        return root.frontSearch(i);
    }

    public void delete(int i){
        if (root.value==i){
            root=null;
        }else {
            root.delete(i);
        }
    }
}
