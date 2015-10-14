Implement strStr() 
My Submissions Question Solution 
Total Accepted: 73619 Total Submissions: 321527 Difficulty: Easy
Implement strStr().

Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Update (2014-11-02):
The signature of the function had been updated to return the index instead of the pointer. If you still see your function signature returns a char * or String, please click the reload button  to reset your code definition.

public class Solution {
    public int strStr(String haystack, String needle) {
        
        if(haystack == null || needle == null){
        	return -1;
        }
        if(needle.length() == 0){
        	return 0;
        }

        for(int i = 0; i < haystack.length() - needle.length() + 1; i++){

        	for(int j = 0; j < needle.length(); j++){

        		if(needle.charAt(j) != haystack.charAt(i + j)) 
        			break;
        		if(j == needle.length() - 1){
        			return i;
        		}
        	}
        }

        return -1;
    }
}