package Practice.Tree.Tree;

public class BinarySearchTree {
    class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;
        public TreeNode(int data){
            this.data= data;
        }
    }
    public TreeNode insert(TreeNode root,int value){
        if(root==null){
            root = new TreeNode(value);
            return root;
        }
        if (value < root.data) {
            root.left = insert(root.left,value);
        }else{
            root.right = insert(root.right,value);
        }
        return root;
    }
}
