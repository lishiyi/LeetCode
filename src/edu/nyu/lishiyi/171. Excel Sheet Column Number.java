171. Excel Sheet Column Number 
My Submissions Question
Total Accepted: 69664 Total Submissions: 170980 Difficulty: Easy
Related to question Excel Sheet Column Title

Given a column title as appear in an Excel sheet, return its corresponding 
column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 

public class Solution {
    public int titleToNumber(String s) {
        
        if(s == null || s.length() == 0){
        	return 0;
        }

        int result = 0;
        int unit = 1;
        for(int i = s.length() - 1; i >= 0; i--){

        	result += unit * (s.charAt(i) - 'A' + 1);
        	unit *= 26;
        }
        return result;
    }
}