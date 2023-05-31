package Practice.Tree.Tree;
import static java.lang.Long.*;
public class BstValidTry {
    TreeNode root;
    public class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }
//        public void createBST(){
//            TreeNode first = new TreeNode(1);
//            TreeNode second = new TreeNode(2);
//            TreeNode third = new TreeNode(3);
//            TreeNode fourth = new TreeNode(4);
//
//            root=first;
//            first.left=second;
//            first.right=third;
//            second.left=fourth;
//        }
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
            if(root.data<min||root.data>max){
                return false;
            }
            boolean left = validate(root.left,min,root.data);
            if(left){
                boolean right = validate(root.right,root.data,max);
                return true;
            }
            return false;
        }
        public void insert(int value){
            insert(root,value);
        }
        public TreeNode insert(TreeNode root, int value){
        if(root==null){
            root=new TreeNode(value);
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

    public static void main(String[] args) {
        BstValidTry bst =new BstValidTry();
        bst.insert(1);
        bst.insert(23);
        bst.insert(5);
        bst.insert(8);
        bst.inOrder(bst.root);
        System.out.println(bst.validate(bst.root, MIN_VALUE, MAX_VALUE));
    }
}
