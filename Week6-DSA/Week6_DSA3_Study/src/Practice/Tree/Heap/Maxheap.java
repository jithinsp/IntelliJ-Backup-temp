package Practice.Tree.Heap;

public class Maxheap {
    Integer[] heap;
    private int n;
    Maxheap(int capacity){
        heap = new Integer[capacity+1];
        n=0;
    }
    public void insert(int value){
        if(n==heap.length-1){
            resize(2*heap.length);
        }
        n++;
        heap[n]=value;
        swim(n);
    }
    public void swim(int k){
        while (k>1&&heap[k/2]<heap[k]){
            int temp = heap[k/2];
        }
    }
    public void resize(int capacity){
        Integer[] temp = new Integer[capacity];
        for (Integer i=0;i< heap.length;i++){
            temp[i]=heap[i];
        }
        heap=temp;
    }
}
