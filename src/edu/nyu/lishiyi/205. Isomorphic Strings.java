205. Isomorphic Strings 
My Submissions Question
Total Accepted: 44532 Total Submissions: 157430 Difficulty: Easy
Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character 
while preserving the order of characters. No two characters may map to the 
	same character but a character may map to itself.

For example,
Given "egg", "add", return true.

Given "foo", "bar", return false.

Given "paper", "title", return true.

Note:
You may assume both s and t have the same length.

Subscribe to see which companies asked this question

Hide Tags Hash Table
Show Similar Problems

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s == null && t == null || s.length() == 0){
            return true;
        }
        
    	Map<Character, Character> map = new HashMap();
    	for(int i = 0; i < s.length(); i++){
    		char sc = s.charAt(i);
    		char tc = t.charAt(i);
    		if(map.containsKey(sc)){
    			//If s -> t0, but s -> t1 this time, return false
    			if(map.get(sc) != tc){
    				return false;
    			}
    		}
    		else{
    			//If s0 -> t, but s1 -> t this time, return false
    			if(map.containsValue(tc)){
    				return false;
    			}
    			map.put(sc, tc);
    		}
    	}
    	return true;
    }
}