36. Valid Sudoku 
My Submissions Question
Total Accepted: 62135 Total Submissions: 211548 Difficulty: Easy
Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.

The Sudoku board could be partially filled, where empty cells are filled with the character '.'.


A partially filled sudoku which is valid.

Note:
A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.

public class Solution {

	private boolean isValidP(char[][] board, int rowStart, int rowEnd, int colStart, int colEnd){

		Set<Character> set = new HashSet();
		for(int i = rowStart; i <= rowEnd; i++){
			for(int j = colStart; j <= colEnd; j++){
				if(set.contains(board[i][j])){
					return false;
				}
				else if(board[i][j] != '.'){
					set.add(board[i][j]);
				}
			}
		}
		return true;
	}

    public boolean isValidSudoku(char[][] board) {
        
    	for(int i = 0; i < 9; i++){
    		if(isValidP(board, i, i, 0, 8) == false){
    			return false;
    		}
    		if(isValidP(board, 0, 8, i, i) == false){
    			return false;
    		}
    	}

        for(int i = 0; i < 3; i++){
        	for(int j = 0; j < 3; j++){
        		if(isValidP(board, 3 * i, 3 * i + 2, 3 * j, 3 * j + 2) == false){
        			return false;
        		}
        	}
        }

        return true;
    }
}