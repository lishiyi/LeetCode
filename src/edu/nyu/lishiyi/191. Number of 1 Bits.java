191. Number of 1 Bits 
My Submissions Question
Total Accepted: 79970 Total Submissions: 213024 Difficulty: Easy
Write a function that takes an unsigned integer and returns the number of ’1' 
bits it has (also known as the Hamming weight).

For example, the 32-bit integer ’11' has binary representation 
00000000000000000000000000001011, so the function should return 3.

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
        int result = 0;
        //Cannot use n > 0, because Java does not have unsigned int
        while(n != 0){

        	result += (n & 1);
        	n = n >>> 1;
        }
        return result;
    }
}