public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int target = 5;
        int start = 0;
        int mid;
        int end = nums.length;
        boolean flag=true;
        while(start<=end){
            mid=(start+end)/2;
            if(nums[mid]==target){
                System.out.println("Item found at: "+mid);
                flag=false;
                break;
            }
            if(nums[mid]>target){
                end = mid-1;
            }
            if (nums[mid]<target) {
                start = mid+1;
            }
        }
        if(flag){
            System.out.println("Element not found");
        }
    }
}










//public class BinarySearch {
//    public static void main(String[] args) {
//        int[] nums= {1,2,5,10,56};
//        int start=0;
//        int end=nums.length;
//        int target=10;
//        int mid=start;
//        for (int i = start; i <end; i++) {
//            mid=(start+end)/2;
//            if(target>nums[mid]){
//                start=mid+1;
//            }
//            else{
//                end=mid;
//            }
//        }
//        System.out.println("target: "+nums[mid]+" is: "+mid);
//    }
//}
