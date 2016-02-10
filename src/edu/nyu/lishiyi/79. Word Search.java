79. Word Search 
My Submissions Question
Total Accepted: 65192 Total Submissions: 293997 Difficulty: Medium
Given a 2D board and a word, find if the word exists in the grid.

The word can be constructed from letters of sequentially adjacent cell, 
where "adjacent" cells are those horizontally or vertically neighboring. 
The same letter cell may not be used more than once.

For example,
Given board =

[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]
word = "ABCCED", -> returns true,
word = "SEE", -> returns true,
word = "ABCB", -> returns false.

public class Solution {

    public boolean exist(char[][] board, String word) {
        
        char[] chars = word.toCharArray();
        for(int i = 0; i < board.length; i++){
        	for(int j = 0; j < board[0].length; j++){
        		if(exist(board, i, j, chars, 0)){
        			return true;
        		}
        	}
        }
        return false;
    }

    private boolean exist(char[][] board, int i, int j, char[] chars, int len){

    	if(i < 0 || i == board.length || j < 0 || j == board[0].length) return false;
    	if(board[i][j] != chars[len]) return false;
    	if(len == chars.length - 1) return true;
    	char temp = board[i][j];
    	board[i][j] = '#';
    	boolean exist = exist(board, i, j + 1, chars, len + 1) || 
    					exist(board, i, j - 1, chars, len + 1) ||
    					exist(board, i + 1, j, chars, len + 1) ||
    					exist(board, i - 1, j, chars, len + 1);
    	board[i][j] = temp;
    	return exist;
    }
}