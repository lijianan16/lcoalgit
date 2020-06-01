package shu;

public class erchashu {
    public static void main(String[] args) {
        //创建一棵树
        BinaryTree binaryTree = new BinaryTree();
        //创建一个根节点
        TreeNode root = new TreeNode(1);
        //把根节点赋给树
        binaryTree.setRoot(root);
        //创建一个左节点
        TreeNode Lroot = new TreeNode(2);
        //把新创建的节点设置为根节点的子节点
        root.setlNode(Lroot);
        //创建一个右节点
        TreeNode Rroot = new TreeNode(3);
        //把新创建的节点设置为根节点的子节点
        root.setrNode(Rroot);
        //为第二层的左节点创建子节点
        Lroot.setlNode(new TreeNode(4));
        Lroot.setrNode(new TreeNode(5));
        //为第二层的右节点创建子节点
        Rroot.setlNode(new TreeNode(6));
        Rroot.setrNode(new TreeNode(7));
        //前序遍历树节点
        binaryTree.frontshow();
        //中序遍历
        binaryTree.midshow();
        //后序遍历
        binaryTree.backshow();
        //删除一个节点
        System.out.println("===============");
        binaryTree.delete(5);
        binaryTree.frontshow();



    }

}
