import java.util.Arrays;
public class BinarySearchUnSorted {
    public int binearysearch(int[] num,int key){
        Arrays.sort(num);

        int low=0;
        int high=num.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(num[mid]==key){
                return mid;
            }
            if(key<num[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={50,65,2,3,100};
        BinarySearchUnSorted bs=new BinarySearchUnSorted();

        System.out.println(bs.binearysearch(arr, 65));
    }
}