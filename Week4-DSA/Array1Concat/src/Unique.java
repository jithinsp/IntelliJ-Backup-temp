import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,5,6,7,7};
        int[] ans=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            boolean flag=false;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    flag=true;
                    continue;
                }
            }
            if(flag==false) {
                ans[i] = nums[i];
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
