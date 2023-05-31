public class Main {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new DynamicStack(5);
//        CustomStack stack = new CustomStack(5);
        stack.push(34);
        stack.push(54);
        stack.push(37);
        stack.push(94);
        stack.push(67);
        stack.push(100);

//        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}