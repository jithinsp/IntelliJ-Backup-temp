public class LinearSearch {
    public int search(int[] arr,int n,int x){
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        LinearSearch ll=new LinearSearch();
        int[] arr={1,2,3,4};
        System.out.println(ll.search(arr, 04, 2));

    }

}