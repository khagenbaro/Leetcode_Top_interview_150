import java.util.Arrays;

public class ProductOfArrayExceptSelf_238 {
    public static void main(String[] args) {
        int[] arr= {-1,1,0,-3,3};
        int res[ ] = productExceptSelf(arr);
        System.out.println(Arrays.toString(res));
    }
    public static int[] productExceptSelf(int[] nums) {
        // first get the product

        int product = 1, temp = 1;
        int res[] = new int[nums.length];
        // to check if it has any zero value
        boolean haveZero = false;
        int  allZero = 0;
        for(int num : nums){
            if(num!=0){
                product = product * num;
            }else{
                allZero++;
                haveZero = true;
            }
        }
        if(allZero>1 || allZero==nums.length){
            product = 0;
        }

        for (int i = 0; i <nums.length ; i++) {
            if(haveZero){
                if(nums[i]==0){
                    res[i] = product;
                }
                else{
                    res[i]= 0;
                }
            }
            else{
                res[i] = product / nums[i];
            }
        }
        return res;
    }
}
/*238. Product of Array Except Self
Solved
Medium
Topics
Companies
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.



Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]*/
