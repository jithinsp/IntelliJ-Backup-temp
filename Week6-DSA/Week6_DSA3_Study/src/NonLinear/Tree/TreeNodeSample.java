package NonLinear.Tree;
//jithin
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class TreeNodeSample {
    private TreeNode root;
    private class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;
        public TreeNode(int data){
            this.data = data;
        }
    }
    public void createBinaryTree(){
        TreeNode first = new TreeNode(9);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);

        root = first; //Root pointing to the first Node
        first.left = second; //second node pointing to the left pointer of first node
        first.right = third;
        //second--->first--->third

        second.left = fourth;
        //fourth--->second
    }
//*****************************PRE-ORDER TRAVERSAL*******************************
    //PreOrder traversal using recursive method
    public void preOrderR(TreeNode root){
        if(root==null){ //base case
            return;
        }
        System.out.print(root.data+" ");
        preOrderR(root.left);
        preOrderR(root.right);
    }
    //PreOrder traversal using iterative method
    public void preOrderI(){
        if(root==null){
            return;
        }
        Stack <TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");
            if(temp.right!=null){
                stack.push(temp.right);
            }
            if(temp.left!=null){
                stack.push(temp.left);
            }
        }
    }
//*****************************IN-ORDER TRAVERSAL*******************************
    //InOrder traversal using recursive method
    public void inOrderR(TreeNode root){
        if(root==null){ //base case
            return;
        }
        inOrderR(root.left);
        System.out.print(root.data+" ");
        inOrderR(root.right);
    }
    //InOrder traversal using iterative method
    public void inOrderI(){
        if(root==null){
            return;
        }
        Stack <TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while (!stack.isEmpty() || temp!=null){
            if(temp!=null){
                stack.push(temp);
                temp=temp.left;
            } else{
                temp = stack.pop();
                System.out.print(temp.data+" ");
                temp = temp.right;
            }
        }
    }
//*****************************POST-ORDER TRAVERSAL*******************************
//PostOrder traversal using recursive method
public void postOrderR(TreeNode root){
    if(root==null){ //base case
        return;
    }
    postOrderR(root.left);
    postOrderR(root.right);
    System.out.print(root.data+" ");
}
    //InOrder traversal using iterative method
    public void postOrderI(){
        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();
        while (current!=null || !stack.isEmpty()){
            if(current!=null){
                stack.push(current);
                current = current.left;
            }else {
                TreeNode temp = stack.peek().right;
                if(temp == null){
                    temp = stack.pop();
                    System.out.print(temp.data+ " ");
                    while (!stack.isEmpty()&&temp==stack.peek().right){
                        temp = stack.pop();
                        System.out.print(temp.data+" ");
                    }
                } else{
                    current=temp;
                }
            }
        }
}//*****************************LEVEL-ORDER TRAVERSAL*******************************
    public void levelOrderI(){
        if(root==null){
            return;
        }
        Queue <TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode temp = queue.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null){
                queue.offer(temp.left);
            }
            if(temp.right!=null){
                queue.offer(temp.right);
            }
        }
    }
    public static void main(String[] args) {
        TreeNodeSample bt = new TreeNodeSample();
        bt.createBinaryTree();
        System.out.println("pre-order");
        bt.preOrderR(bt.root);
        System.out.println();
        bt.preOrderI();
        System.out.println();
        System.out.println("in-order");
        bt.inOrderR(bt.root);
        System.out.println();
        bt.inOrderI();
        System.out.println();
        System.out.println("post-order");
        bt.postOrderR(bt.root);
        System.out.println();
        bt.postOrderI();
        System.out.println();
        System.out.println("level-order");
        bt.levelOrderI();
    }
}
