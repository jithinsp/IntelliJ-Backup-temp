public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    public CustomStack(){
        this(DEFAULT_SIZE); //Calling a constructor in a constructor. Copy constructor
    }
    public CustomStack(int size){
        this.data=new int[size]; //Creating a new integer array to store data
    }
    int ptr=-1;
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack in full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return false;
    }
    public int pop() throws StackException {
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty stack!!");
        }
/*
        int removed = data[ptr];
        ptr--;
        return removed;
*/
        return data[ptr--];
    }
    public int peek() throws StackException {
        if(isEmpty()){
            throw new StackException("Cannot peek from an empty stack!!");
        }
        return data[ptr];
    }
    public boolean isFull(){
        return ptr==data.length-1;
    }
    public boolean isEmpty(){
        return ptr==-1;
    }
}
