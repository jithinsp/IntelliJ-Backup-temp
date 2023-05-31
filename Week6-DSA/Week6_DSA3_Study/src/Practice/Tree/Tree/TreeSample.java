package Practice.Tree.Tree;

import static java.lang.Long.*;

public class TreeSample {
    TreeNode root;
    private class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int value) {
            this.data = value;
        }
    }
    public void insert(int value){
        insert(root,value);
    }
    public TreeNode insert(TreeNode root, int value){
        if(root==null){
            root = new TreeNode(value);
            return root;
        }
        if(value<root.data){
            root.left=insert(root.left,value);
        }
        if(value>root.data){
            root.right=insert(root.right,value);
        }
        return root;
    }
    public void inOrder(){
        inOrder(root);
    }
    public void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public boolean validate(TreeNode root,long min,long max){
        if(root==null){
            return true;
        }
        if(root.data<=min||root.data>=max){
            return false;
        }
        boolean left = validate(root.left,min,root.data);
        if(left){
            boolean right = validate(root.right,root.data,max);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        TreeSample ts=new TreeSample();
        ts.insert(1);
        ts.insert(3);
        ts.insert(6);
        ts.insert(5);
        ts.inOrder();
        System.out.println(ts.validate(ts.root, MIN_VALUE, MAX_VALUE));
    }
}
