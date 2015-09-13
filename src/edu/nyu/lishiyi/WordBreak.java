Word Break 
My Submissions Question Solution 
Total Accepted: 61993 Total Submissions: 265891 Difficulty: Medium
Given a string s and a dictionary of words dict, 
determine if s can be segmented into a space-separated sequence of one or 
more dictionary words.

For example, given
s = "leetcode",
dict = ["leet", "code"].

Return true because "leetcode" can be segmented as "leet code".


public class Solution {
    public boolean wordBreak(String s, Set<String> wordDict) {
        
        if(s == null || s.length() == 0){

        	return false;
        }
        //f[i] is (0...i) to break into dict
        boolean[] f = new boolean[s.length()];
        //Initialize 
        f[0] = wordDict.contains(s.substring(0,1));

        for(int i = 0; i < s.length(); i++){
        	for(int j = 0; j <= i; j++){
        		//if dictionary contains the substring AND (it is the 1st word OR the former words
        		//satisfy f[j - 1] )
        		if(wordDict.contains(s.substring(j, i + 1)) && (j == 0 || f[j - 1])){

        			f[i] = true;
        			break;
        		}
        	}
        }

        return f[s.length() - 1];
    }
}