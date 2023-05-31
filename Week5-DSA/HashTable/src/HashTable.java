public class HashTable {
    private HashNode[] buckets;
    private int numOfBuckets; //Capacity
    private int size; //number of key value pairs
    public HashTable(){
        this(10); //default capacity
    }
    public HashTable(int capacity){
        this.numOfBuckets=capacity;
        buckets = new HashNode[capacity];
    }
    private class HashNode{
        private Integer key; //can be generic type
        private String value; //can be generic type
        private HashNode next; //reference to next HashNode
        public HashNode(Integer key, String value){
            this.key=key;
            this.value=value;
        }
    }
    public int size(){
        return size; //method returns its size
    }
    public boolean isEmpty(){
        return size == 0; //Method returns true when the size is 0
    }
    //method to insert values
    public void put(Integer key, String value){
        if(key == null || value == null){
            throw new IllegalArgumentException("key or value equal to null");
        }
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        while (head!=null){
            if(head.key.equals(key)){
                head.value=value;
                return;
            }
            head = head.next;
        }
        size ++;
        head = buckets [bucketIndex];
        HashNode node = new HashNode(key,value);
        node.next = head;
        buckets[bucketIndex] = node;
    }
    public String get(Integer key){
        if(key == null){
            throw new IllegalArgumentException("Key is null");
        }
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        while (head != null){
            if(head.key.equals(key)){
                return head.value;
            }
            head = head.next;
        }
        return null;
    }
    public String remove(Integer key){
        if(key == null){
            throw new IllegalArgumentException("Key is null");
        }
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        HashNode previous = null;

        while (head != null){
            if(head.key.equals(key)){
                break;
            }
            previous = head;
            head = head.next;
        }
        if(head == null){
            return null;
        }
        size--;
        if(previous != null){
            previous.next =head.next;
        }
        else {
            buckets[bucketIndex] = head.next;
        }
        return head.value;
    }
    //Modulo Hash function
    public int getBucketIndex(Integer key){
        return key % numOfBuckets; // buckets.length
    }
    public static void main(String[] args) {
        HashTable table = new HashTable(10);
        table.put(12,"arun");
        table.put(34,"jithin");
        table.put(55,"ud");
        System.out.println(table.size());
        System.out.println(table.get(34));
        System.out.println(table.remove(12));
        System.out.println(table.size());
    }
}