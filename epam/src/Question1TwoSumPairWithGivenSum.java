import java.util.Arrays;
import java.util.HashMap;

/**
 * Problem: Two Sum (Using Collections Framework)
 *
 * Given an array of integers nums and an integer target, return the indices of the two numbers such that they add up to the target. You may assume that each input would have exactly one solution, and you may not use the same element twice. You can return the answer in any order. If no solution is found, return an array with indices [-1, -1].
 *
 * Test Cases:
 *
 * Input: nums = [2, 7, 11, 15], target = 9
 * Output: [0, 1]
 * Explanation: nums[0] + nums[1] = 2 + 7 = 9
 *
 * Input: nums = [3, 2, 4], target = 6
 * Output: [1, 2]
 * Explanation: nums[1] + nums[2] = 2 + 4 = 6
 *
 * Input: nums = [3, 3], target = 6
 * Output: [0, 1]
 */
public class Question1TwoSumPairWithGivenSum {
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i< nums.length; i++){
            int diff = target-nums[i];
            if(map.get(diff)!= null){
                return new int[]{map.get(diff),i};
            } else {
                map.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int nums1[] = {2, 7, 11, 15};
        int target=9;
        System.out.println(Arrays.toString(twoSum(nums1,target))); //0,1
        int nums2[] = {3, 2, 4};
        target=6;
        System.out.println(Arrays.toString(twoSum(nums2,target))); //1,2


    }
}
