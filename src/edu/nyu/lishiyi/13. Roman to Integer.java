13. Roman to Integer 
My Submissions Question
Total Accepted: 76461 Total Submissions: 198512 Difficulty: Easy
Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.

public class Solution {
    public int romanToInt(String s) {

        if(s == null || s.length() == 0){
        	return 0;
        }
        Map<Character, Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = map.get(s.charAt(s.length() - 1));
        int pivot = result;
        for(int i = s.length() - 2; i >= 0; i--){
        	int cur = map.get(s.charAt(i));
        	if(cur >= pivot){
        		result += cur;
        	}
        	else{
        		result -= cur;
        	}
        	pivot = cur;
        }
        return result;
    }
}