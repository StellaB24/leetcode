package main.java;

import java.util.HashMap;

public class TwoSum {
    /**
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     *
     * You can return the answer in any order
     */

    public static void main(String[] args) {
        int[] nums = new int[]{2,4,1,3};
        twoSum(nums, 5);

    }

    private static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int complement;
        int[] result = new int[2];

        for(int i = 0; i < nums.length; i++){
            complement = target - nums[i];

            if (map.containsKey(complement)){
                result[0] = i;
                result[1] = map.get(complement);
            }else {
                map.put(nums[i], i);
            }
        }
        return result;
    }
}
