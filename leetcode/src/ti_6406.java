import java.util.Arrays;

public class ti_6406 {
    public static void main(String[] args) {
        
    }
}
class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int ans=0;
        for (int i = 0; i < k; i++) {
            ans+=nums[nums.length-1];
            nums[nums.length-1]++;
        }
        
        return ans;

    }
}