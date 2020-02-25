import java.util.Arrays;

public class ReOrderArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(reOrderArray(nums)));
    }

    public static int[] reOrderArray(int [] nums) {
        int[] ans = new int[nums.length];
        int even = 0;
        int odd = 0;
        
        for (int i = 0; i < nums.length; i++)
            if (nums[i] % 2 == 1) even += 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1)
                ans[odd++] = nums[i];
            else
                ans[even++] = nums[i];
        }

        return ans;
    }
}