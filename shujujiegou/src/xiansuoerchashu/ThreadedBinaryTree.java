package xiansuoerchashu;


public class ThreadedBinaryTree {
    ThreadedNode root;
    //用于临时存储前驱节点
    ThreadedNode pre = null;
    //设置根节点
    public void setRoot(ThreadedNode root) {
        this.root = root;
    }
    //中序线索化二叉树
    public void threadNodes(){
        threadNodes(root);
    }
    public void threadNodes(ThreadedNode node){
        //当前节点如果为null，直接返回
        if (node==null){
            return;
        }
        //处理左子树
        threadNodes(node.lNode);
        //处理前驱节点
        if (node.lNode==null){
            //让当前节点的左指针指向前驱节点
            node.lNode=pre;
            //改变当前节点左指针类型
            node.LeftType=1;

        }
        //处理前驱的右指针，如果前驱节点的右指针是null（没有指下右子树）
        if (pre!=null&&pre.rNode==null){
            //让前驱节点的右指针指向当前节点
            pre.rNode=node;
            //改变前驱节点的右指针类型
            pre.RightTYpe=1;
        }
        //处理一个节点，当前节点是下一个节点的前驱节点
        pre=node;
        //处理右子树
        threadNodes(node.rNode);

    }
    //获取根节点
    public ThreadedNode getRoot(){
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
    public ThreadedNode frontSearch(int i){
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
