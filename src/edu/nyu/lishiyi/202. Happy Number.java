202. Happy Number 
My Submissions Question
Total Accepted: 52583 Total Submissions: 148599 Difficulty: Easy
Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, 
replace the number by the sum of the squares of its digits, 
and repeat the process until the number equals 1 (where it will stay), 
or it loops endlessly in a cycle which does not include 1. 
Those numbers for which this process ends in 1 are happy numbers.

Example: 19 is a happy number

1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
Credits:
Special thanks to @mithmatt and @ts for adding this problem and creating all test cases.

Subscribe to see which companies asked this question

public class Solution {
    public boolean isHappy(int n) {
        
    	Set<Integer> set = new HashSet();
    	while(true){

    		n = sum(n);
    		//if the square sum is 1, happy
    		if(n == 1){
    			return true;
    		}
    		//if repeated, that is, it loops endlessly, not happy.
    		else if(set.contains(n)){
    			return false;
    		}
    		set.add(n);
    	}
    }	

    private int sum(int n){

    	int sum = 0;
    	//digit by digit
    	while(n > 0){
    		sum += (n % 10) * (n % 10);
    		n /= 10;
    	}
    	return sum;
    }
}