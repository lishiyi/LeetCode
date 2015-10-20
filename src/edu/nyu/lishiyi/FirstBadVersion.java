First Bad Version 
My Submissions Question Solution 
Total Accepted: 15838 Total Submissions: 78628 Difficulty: Easy
You are a product manager and currently leading a team to develop a new product. Unfortunately, 
the latest version of your product fails the quality check. Since each version is developed based 
on the previous version,
all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, 
hich causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which will return whether version is bad. 
Implement a function to find the first bad version. You should minimize the number of calls to the API.

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        if(n <= 1){
        	return 1;
        }

        int start = 1;
        int end = n;
        int mid;

        while(start + 1 < end){

        	mid = start + (end - start) / 2;

        	if(isBadVersion(mid) == true){

        		end = mid;
        	}
        	else{
        		start = mid;
        	}
        }

        return isBadVersion(start) ? start : end;
    }
}