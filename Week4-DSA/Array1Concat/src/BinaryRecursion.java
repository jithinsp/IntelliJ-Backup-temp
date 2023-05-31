public class BinaryRecursion {
        public int search(int arr[],int low,int high,int key){
            if(low>high){
                return -1;
            }
            int mid=(low+high)/2;

            if (arr[mid]==key){
                return mid;
            }
            if(key<arr[mid]){
                return search(arr, 0,mid-1,key);
            }else{
                return search(arr,mid+1, high, key);
            }
        }
        public static void main(String[] args) {
            int arr[]={1,2,4,6,7,9};
            BinaryRecursion objbinarysearch1=new BinaryRecursion();
            System.out.println(objbinarysearch1.search(arr,0, 5, 9));

        }
    }
