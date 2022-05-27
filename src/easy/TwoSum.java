package easy;

import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] results = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = 1; j < nums.length; j++){
                if(i != j){
                    if(nums[i] + nums[j] == target){
                        results[0] = i;
                        results[1] = j;
                    }
                }
            }
        }
        return results;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8};
        System.out.println(Arrays.toString(twoSum(nums, 10)));

        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }
}
