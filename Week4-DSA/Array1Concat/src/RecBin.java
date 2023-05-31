public class RecBin {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        int target = 1;
        int start =0;
        int end = nums.length;
        int mid;
        search(nums,start,end,target);
    }
    static int search(int[] nums, int start, int end, int target){
        int mid=(start+end)/2;
        boolean flag=true;
        if(nums[mid]==target){
            System.out.println("The item is found at: "+mid);
            flag=false;
        }
        if (nums[mid]<target){
            return search(nums,mid,end,target);
        }
        if (nums[mid]>target){
            return search(nums,start,mid,target);
        }
        if(flag){
            System.out.println("Item not found");
        }
        return mid;
    }
}
