public class LLDemo {
    public static void main(String[] args) {
        LL list=new LL();
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(8);
        list.insertLast(27);
        list.insert(100,3);
        System.out.println(list.deleteFirst());
        list.display();
        list.deleteLast();
        list.display();
    }
}
class LL{
    private Node head;
    private Node tail;
    private int size;
    public LL(){ //constructor
        this.size=0;
    }
    //Method to insert an element in the first position
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    //Method to insert last position
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail = node;
        size++;
    }
    //Method to add elements to a particular index
    public void insert(int val, int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        Node node= new Node(val,temp.next);
        temp.next=node;
        size++;
    }
    //Method to remove element at first pos
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head==null) {
            tail = null;
        }
        size--;
        return val;
    }
    //Method to delete last element
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast= get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }
    //To delete
    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }
    //Method to get the refference pointer of that node
    public Node get(int index){
        Node node =head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }
    //Method to find
    public Node find(int value){
        Node node =head;
        while (node!=null){
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }
    //Method to display the List items
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+ " ");
            temp=temp.next;
        }
        System.out.println();
    }
    class Node{
        private int value;
        private Node next;
        public Node(int value){ //constructor
            this.value = value;
        }
        public Node(int value, Node next) { //constructor
            this.value = value;
            this.next = next;
        }
    }
}
