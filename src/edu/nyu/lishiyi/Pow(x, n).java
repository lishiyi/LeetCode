Pow(x, n) 
My Submissions Question Solution 
Total Accepted: 67938 Total Submissions: 251577 Difficulty: Medium
Implement pow(x, n).

public class Solution {
    public double myPow(double x, int n) {
        
        if(n == 0){
        	return 1;
        }
        if(n == 1){
        	return x;
        }
        if(n == -1){
        	return 1 / x;
        }

        double halfPow = myPow(x, n / 2);
        return n % 2 == 0 ? halfPow * halfPow : halfPow * halfPow * (n > 0 ? x : 1 / x); 
    }
}