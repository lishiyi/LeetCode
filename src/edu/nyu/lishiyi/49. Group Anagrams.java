49. Group Anagrams 
My Submissions Question
Total Accepted: 64908 Total Submissions: 245915 Difficulty: Medium
Given an array of strings, group anagrams together.

For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], 
Return:

[
  ["ate", "eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note:
For the return value, each inner list's' elements must follow the lexicographic order.
All inputs will be in lower-case.

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> result = new ArrayList();
        HashMap<String, List<String>> map = new HashMap();

        for(String str : strs){

        	char[] chars = str.toCharArray();
        	Arrays.sort(chars);
        	String sortedStr = new String(chars);
        	if(!map.containsKey(sortedStr)){
        		List<String> list = new ArrayList();
        		list.add(str);
        		map.put(sortedStr, list);
        	}
        	else{
        		map.get(sortedStr).add(str);
        	}
        }

        for(List<String> value : map.values()){

        	Collections.sort(value);
        	result.add(value);
        }

        return result;
    }
}