290. Word Pattern 
My Submissions Question
Total Accepted: 23939 Total Submissions: 86111 Difficulty: Easy
Given a pattern and a string str, find if str follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern 
and a non-empty word in str.

Examples:
pattern = "abba", str = "dog cat cat dog" should return true.
pattern = "abba", str = "dog cat cat fish" should return false.
pattern = "aaaa", str = "dog cat cat dog" should return false.
pattern = "abba", str = "dog dog dog dog" should return false.
Notes:
You may assume pattern contains only lowercase letters, and str contains lowercase letters 
separated by a single space.

public class Solution {
    public boolean wordPattern(String pattern, String str) {
        
        Map<Character, String> map = new HashMap();
        String[] words = str.split(" ");
        for(int i = 0; i < words.length; i++){

        	char p = pattern.charAt(i);
        	if(map.containsKey(p)){

        		if(!map.get(p).equals(words[i])){
        			return false;
        		}
        	}
        	else{

        		if(map.containsValue(words[i])){
        			return false;
        		}
        		map.put(p, words[i]);
        	}
        }

        return true;
    }
}