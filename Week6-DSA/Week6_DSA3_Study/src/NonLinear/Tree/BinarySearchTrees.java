package NonLinear.Tree;
//nidhilaal
import static java.lang.Long.*;

public class BinarySearchTrees {
    public TreeNode root;
    public class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;
        public TreeNode(int data){
            this.data=data;
        }
    }
    //insert using recursion
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
    //insert using iterative method
    public void insert(int data){
        TreeNode current = root;
        if(current == null){
            root = new TreeNode(data);
            return;
        }
        while (true){
            if(data < current.data){
                if(current.left == null){
                    current.left = new TreeNode(data);
                }else {
                    current = current.left;
                }
            } else {
                if(current.right == null){
                    current.right = new TreeNode(data);
                }else {
                    current = current.right;
                }
            }
        }
    }
    public int closestValue(TreeNode root, int target) {
        int closest = root.data;
        while (root != null) {
            if (Math.abs(root.data - target) < Math.abs(closest - target)) {
                closest = root.data;
            }
            root = target < root.data ? root.left : root.right;
        }
        return closest;
    }
    public TreeNode search(int key){
        return search(root,key);
    }
    public TreeNode search(TreeNode root, int key){
        if(root==null||root.data==key){
            return root;
        }
        if(key<root.data){
            return search(root.left,key);
        } else {
            return search(root.right,key);
        }
    }
    public boolean isValid(TreeNode root, long min , long max ){
        if(root==null){
            return true;
        }
        if(root.data<=min || root.data>=max ){
            return false;
        }
        boolean left = isValid(root.left,min,root.data);
        if(left){
            boolean right= isValid(root.right,root.data,max);
            return true;
        }
        return false;
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
    public static void main(String[] args) {
        BinarySearchTrees bst = new BinarySearchTrees();
        bst.insert(1);
        bst.insert(54);
        bst.insert(44);
        bst.insert(5);

        bst.inOrder();

        System.out.println();
        if(null!=bst.search(5)){
            System.out.println("key is found");
        }
        else {
            System.out.println("key is not found");
        }
        System.out.println(bst.isValid(bst.root, MIN_VALUE, MAX_VALUE));
    }
}
