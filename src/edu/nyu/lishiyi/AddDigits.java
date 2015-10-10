Add Digits 
My Submissions Question Solution 
Total Accepted: 30864 Total Submissions: 66093 Difficulty: Easy
Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

Follow up:
Could you do it without any loop/recursion in O(1) runtime?

public class Solution {
    public int addDigits(int num) {
        
        //https://en.wikipedia.org/wiki/Digital_root  dr(n) = n - 9 * floor((n - 1) / 9)
        return num - (num - 1) / 9 * 9;
    }
}