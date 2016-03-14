326. Power of Three 
My Submissions Question
Total Accepted: 27168 Total Submissions: 76211 Difficulty: Easy
Given an integer, write a function to determine if it is a power of three.

Follow up:
Could you do it without using any loop / recursion?

public class Solution {
    public boolean isPowerOfThree(int n) {
        
        if(n <= 0){
        	return false;
        }
        while(n % 3 == 0){
        	n = n / 3;
        }
        return n == 1;
    }
}