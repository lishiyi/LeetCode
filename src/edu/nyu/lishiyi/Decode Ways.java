Decode Ways 
My Submissions Question
Total Accepted: 55312 Total Submissions: 330573 Difficulty: Medium
A message containing letters from A-Z is being encoded to numbers using the following mapping:

'A' -> 1
'B' -> 2
...
'Z' -> 26
Given an encoded message containing digits, determine the total number of ways to decode it.

For example,
Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).

The number of ways decoding "12" is 2.

public class Solution {
    public int numDecodings(String s) {
 		
 		if(s == null || s.length() == 0){
 			return 0;
 		}

 		int n = s.length();
 		//f[i] for the ith to the last character has how many combinations.
 		int[] f = new int[n + 1];
 		f[n] = 1;
 		//If the last number is '0', set it to 0.
 		f[n - 1] = s.charAt(n - 1) == '0' ? 0 : 1; 

 		for(int i = n - 2; i >= 0; i--){
 			//If this number is '0', continue for next(that is, if it is the first char, it will be 0)
 			if(s.charAt(i) == '0') continue; // f[i] = 0 already lncluded when initailized.
 			//If these 2 numbers less than 27, that is, it can be encoded to 2 different motheds. 
 			// So f[i] = f[i + 1] + f[i + 2] 
 			if(Integer.parseInt("" + s.charAt(i) + s.charAt(i + 1)) <= 26){
 				
 				f[i] = f[i + 1] + f[i + 2];
 			}
 			else{
 				f[i] = f[i + 1];
 			}
 		}

 		return f[0];
    }
}