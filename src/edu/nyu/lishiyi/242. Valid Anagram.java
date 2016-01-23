242. Valid Anagram 
My Submissions Question
Total Accepted: 53470 Total Submissions: 133127 Difficulty: Easy
Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.

Follow up:
What if the inputs contain unicode characters? How would you adapt your solution to such case?

public class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s == null && t == null){
        	return true;
        }
        if(s == null || t == null || s.length() != t.length() ){
        	return false;
        }

        char[] a1 = s.toCharArray();
        char[] a2 = t.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        for(int i = 0; i < a1.length; i++){
        	if(a1[i] != a2[i]){
        		return false;
        	}
        }
        return true;
    }

}