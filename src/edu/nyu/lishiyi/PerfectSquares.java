Perfect Squares 

My Submissions Question Solution 
Total Accepted: 2896 Total Submissions: 9277 Difficulty: Medium
Given a positive integer n, find the least number of perfect square numbers 
(for example, 1, 4, 9, 16, ...) which sum to n.

For example, given n = 12, return 3 because 12 = 4 + 4 + 4; 
given n = 13, return 2 because 13 = 4 + 9.

Credits:
Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.

public class Solution {
    public int numSquares(int n) {
    	/*
    	*      |1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|
    	*      |1|2|3|1|2|3|4|2|1| 2| 3| 3| 3| 3| 4| 1|
    	*		Lagrange's four-square theorem

    	*		Legendre's three-square theorem
    	*       In mathematics, Legendre's three-square theorem states that a natural number can be represented as the sum of three squares of integers

                  n = x^2 + y^2 + z^2
                  if and only if n is not of the form n = 4^a(8b + 7) for integers a and b.
    	*/

        int m = n;
        //Here we make: 4^a(8b + 7)  => a(8b + 7)
        while(m % 4 == 0){

        	m /= 4;
        }
        if(m % 8 == 7){

        	return 4;
        }

        int sqrtOfn = (int) Math.sqrt(n);
        if(sqrtOfn * sqrtOfn == n){

        	return 1;
        }

        for(int i = 1; i <= sqrtOfn; i++){

        	int reminder = n - i * i;
        	int sqrtOfnum = (int) Math.sqrt(reminder);
        	if(sqrtOfnum * sqrtOfnum == reminder){
        		return 2;
        	}

        }

        return 3;
    }

}