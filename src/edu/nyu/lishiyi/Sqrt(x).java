Sqrt(x) 
My Submissions Question Solution 
Total Accepted: 69678 Total Submissions: 293808 Difficulty: Medium
Implement int sqrt(int x).

Compute and return the square root of x.

public class Solution {
    public int mySqrt(int x) {
        
        if(x <= 1){
        	return x;
        }

        int start = 1;
        int end = x;
        int mid;
        while(start + 1 < end){

        	mid = start + (end - start) / 2;
        	if(mid > x / mid){
        		end = mid;
        	}
        	else{
        		start = mid;
        	}
        }

        return start;
    }
}