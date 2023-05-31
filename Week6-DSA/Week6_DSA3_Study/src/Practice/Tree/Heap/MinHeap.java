package Practice.Tree.Heap;

public class MinHeap {
    Integer[] heap;
    private int n;
    public MinHeap(int capacity){
        heap = new Integer[capacity+1];
        n=0;
    }
    public void insert(int value){
        if(n==heap.length-1){
            resize(2*heap.length-1);
        }
        n++;
        heap[n]=value;
        swim(n);
    }
    public void swim(int k){
        while(k>1 &&heap[k/2]>heap[k]){
            int temp = heap[k/2];
            heap[k/2]=heap[k];
            heap[k]=temp;
            k=k/2;
        }
    }
    public void resize(int capacity){
        Integer[] temp =new Integer[2*capacity];
        for (int i = 0; i < heap.length; i++) {
            temp[i] = heap[i];
        }
        heap=temp;
    }
    public void display(){
        for(Integer i:heap){
            if(i==null){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
