import java.util.HashMap;
import java.util.Map;

public class MajorityElement_169 {
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] nums) {
        int res =0, value=0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.compute(nums[i], (key, val)
                    -> (val == null)
                    ? 1
                    : val + 1));
        }
        for(Map.Entry<Integer, Integer> i : map.entrySet()){
            if(i.getValue()>res){
                res = i.getValue();
                value =  i.getKey();
            }
        }
        if(res>nums.length/2)
        {
            return value;
        }
        else{
            return 0;
        }
    }

}
/*169. Majority Element
Solved
Easy
Topics
Companies
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.



Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
* */
