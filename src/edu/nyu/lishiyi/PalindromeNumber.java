Palindrome Number
Total Accepted: 79099 Total Submissions: 275810 My Submissions Question Solution 
Determine whether an integer is a palindrome. Do this without extra space.

public class Solution {
    public boolean isPalindrome(int x) {
 		
 		String s = Integer.toString(x);
 		for(int i = 0; i < s.length() / 2; i++){

 			if( s.charAt(i) != s.charAt(s.length() - 1 - i) ){

 				return false;
 			}
 		}

 		return true;       
    }
}