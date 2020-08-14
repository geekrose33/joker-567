package com.company.leekou;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Joker_Dong
 * @date 2020-8-14 8:46
 */

public class leekou01 {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] nums,int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            if (map.containsKey(num)){
                return new int[]{map.get(num),i};
            }
            map.put(nums[i],i);
        }

        return null;
    }

}
