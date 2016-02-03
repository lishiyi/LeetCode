204. Count Primes 
My Submissions Question
Total Accepted: 50114 Total Submissions: 216886 Difficulty: Easy
Description:

Count the number of prime numbers less than a non-negative number, n.

Credits:
Special thanks to @mithmatt for adding this problem and creating all test cases.

public class Solution {
    public int countPrimes(int n) {
        
   		int count = 0;
   		boolean[] notPrime = new boolean[n];

   		for(int i = 2; i < n; i++){

   			if(notPrime[i] == false){
   				count++;
   				if(i * i < 0) continue;
	   			for(int j = i; j * i < n; j++){
	   				notPrime[j * i] = true;
	   			}
   			}
   		}

   		return count;
    }
}