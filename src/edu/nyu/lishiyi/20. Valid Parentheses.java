20. Valid Parentheses 
My Submissions Question
Total Accepted: 98569 Total Submissions: 340769 Difficulty: Easy
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" 
and "([)]" are not.

public class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < s.length(); i++){
        	char cur = s.charAt(i);
        	if(stack.isEmpty() || cur == '(' || cur == '[' || cur == '{'){
        		stack.push(cur);
        	}
        	else{
        	 	if(!isValid(stack.pop(), cur)) return false;
        	}
        }
        return stack.isEmpty();
    }

    private boolean isValid(char c1, char c2){

    	return c1 == '(' && c2 == ')' || c1 == '[' && c2 == ']' || c1 == '{' && c2 == '}' ;
    }
}