260. Single Number III 
My Submissions Question
Total Accepted: 25030 Total Submissions: 58846 Difficulty: Medium
Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.

For example:

Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].

Note:
The order of the result is not important. So in the above example, [5, 3] is also correct.
Your algorithm should run in linear runtime complexity. 
Could you implement it using only constant space complexity?

//Version 1, with extra space
public class Solution {
    public int[] singleNumber(int[] nums) {
         
         Set<Integer> set = new HashSet();
         for(int num : nums){
         	if(!set.contains(num)){
         		set.add(num);
         	}
         	else{
         		set.remove(num);
         	}
         }
         int[] result = new int[2];
         int i = 0;
         for(int num : set){
         	result[i] = num;
         	i++;
         }
         return result;
    }
}
//Version 2, without extra space
public class Solution {
    public int[] singleNumber(int[] nums) {
        
        int xor = 0;
        for(int num : nums){
        	xor = xor ^ num;
        }

        int bit = 0;
        for(int i = 0; i < 32; i++){
        	if(((xor >>> i) & 1) != 0){
        		bit = i;
        		break;
        	}
        }
        xor = (1 << bit);

        int[] result = new int[2];
        int a = 0; 
        int b = 0;

        for(int num : nums){

        	if((num & xor) == 0){
        		a = a ^ num;
        	}
        	else if((num & xor) != 0){
        		b = b ^ num;
        	}
        }
        result[0] = a;
        result[1] = b;
        return result;
    }
}