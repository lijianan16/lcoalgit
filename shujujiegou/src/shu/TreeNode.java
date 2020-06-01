package shu;

public class TreeNode {
    //节点的权
    int value;
    //左儿子
    TreeNode lNode;
    //右儿子
    TreeNode rNode;

    public TreeNode(int value) {
        this.value = value;
    }
    //设置左儿子
    public void setlNode(TreeNode lNode) {
        this.lNode = lNode;
    }
    //设置右儿子
    public void setrNode(TreeNode rNode) {
        this.rNode = rNode;
    }
    //前序遍历
    public void frontShow(){
        //先遍历当前节点的内容
        System.out.print(value);
        //左节点
        if (lNode != null){
            lNode.frontShow();
        }
        //右节点
        if(rNode!=null){
            rNode.frontShow();
        }

    }
    //中序遍历
    public void midShow(){
        //左子节点
        if (lNode !=null){
            lNode.midShow();
        }
        //当前节点
        System.out.print(value);
        //右子节点
        if (rNode!=null){
            rNode.midShow();
        }
    }
    //后序遍历
    public void backShow(){
        //左子节点
        if (lNode!=null){
            lNode.backShow();
        }
        //右子节点
        if (rNode!=null){
            rNode.backShow();
        }
        System.out.print(value);
    }
    //前序查找
    public TreeNode frontSearch(int i){
        TreeNode target=null;
        //当比当前节点的值
        if (this.value==i){
            return this;
            //当前节点的值不是要查找的节点
        }else {
            //查找左儿子
            if (lNode!=null){
                //有可能可以查到，也可以查不到，查不到的话，target还是一个null
                target=lNode.frontSearch(i);
            }
            //如果不为空，说明在左儿子中已经找到
            if (target!=null){
                return target;
            }
            //查找右儿子
            if (rNode!=null){
                target=rNode.frontSearch(i);
            }

        }
        return target;

    }
    //删除子树
    public void delete(int i){
        TreeNode parent = this;
        //判断左儿子
        if (parent.lNode!=null&&parent.lNode.value==i){
            parent.lNode=null;
            return;
        }
        //判断右儿子
        if (parent.rNode!=null&&parent.rNode.value==i){
            parent.rNode=null;
            return;
        }
        //递归检查并删除左儿子
        parent=lNode;
        if (parent!=null){
            parent.delete(i);

        }
        //递归检查并删除右儿子
        parent=rNode;
        if (parent!=null){
            parent.delete(i);
        }

    }
}
