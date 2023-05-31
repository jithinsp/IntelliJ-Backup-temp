package Practice.Tree;

public class BTValidater {
    TreeNode root;
    public class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;
        TreeNode(int data){
            this.data=data;
        }
    }
    public void preOrder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public boolean validate(TreeNode root, long min , long max){
        if(root==null){
            return true;
        }
        if(root.data<min||root.data>max){
            return false;
        }
        boolean left= validate(root.left,min,root.data);
        if(left){
            boolean right=validate(root.right,root.data,max);
            return true;
        }
        return false;
    }
    public TreeNode insert(TreeNode root, int value){
        if(root==null){
            root = new TreeNode(value);
            return root;
        }
        if(value<root.data){
            root.left = insert(root.left, value);
        }
        if(value>root.data){
            root.right = insert(root.right,value);
        }
        return root;
    }
}
