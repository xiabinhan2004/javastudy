import java.util.Arrays;

public class ti_6404 {
    public static void main(String[] args) {
        int[] nums={3,4,-1};
        System.out.println(Solution.countOperationsToEmptyArray(nums));
    }
}
class Solution {
    public static long countOperationsToEmptyArray(int[] nums) {
        int cnt=0;
        while(nums.length!=0)
        {
            for (int i = 0; i < nums.length; i++) {
                if(nums[0]>nums[i])
                {
                i=0;
                int temp;
                temp=nums[0];
                nums[0]=nums[nums.length-1];
                nums[nums.length-1]=temp;
                }
                cnt++;
                
            }
            nums=Arrays.copyOfRange(nums, 1, nums.length);
            cnt++;
        }
        
        return cnt;
        

    }
}
