172. Factorial Trailing Zeroes 
My Submissions Question
Total Accepted: 53024 Total Submissions: 165236 Difficulty: Easy
Given an integer n, return the number of trailing zeroes in n!.

Note: Your solution should be in logarithmic time complexity.

public class Solution {
    public int trailingZeroes(int n) {
        
        int result = 0;
        while(n > 0){
        	n = n / 5;
        	result += n;
        }
        return result;
    }
}