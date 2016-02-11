212. Word Search II 
My Submissions Question
Total Accepted: 15101 Total Submissions: 83454 Difficulty: Hard
Given a 2D board and a list of words from the dictionary, find all words in the board.

Each word must be constructed from letters of sequentially adjacent cell, 
where "adjacent" cells are those horizontally or vertically neighboring. 
The same letter cell may not be used more than once in a word.

For example,
Given words = ["oath","pea","eat","rain"] and board =

[
  ['o','a','a','n'],
  ['e','t','a','e'],
  ['i','h','k','r'],
  ['i','f','l','v']
]
Return ["eat","oath"].
Note:
You may assume that all inputs are consist of lowercase letters a-z.

public class Solution {

    private class TrieNode{
    	boolean isWord;
    	TrieNode[] children;
    	public TrieNode(){
    		this.isWord = false;
    		this.children = new TrieNode[26];
    	}
    }

    public List<String> findWords(char[][] board, String[] words) {
        
        //Create a Trie
        TrieNode trie = new TrieNode();
        //Put the words into the trie
        for(String word : words){
        	buildTrie(trie, word, 0);
        }

        List<String> result = new ArrayList();
        for(String word : words){

        }

    }

    private boolean exist(char[][] board, int i, int j, TrieNode trie, int len){

    	if(i < 0 || i > board.length || j < 0 || j > board.length) return false;
    	TrieNode cTrie = trie.children[board[i][j] - 'a'];
    	if(cTrie == null) return false;
    	if(cTrie.isWord) return true;
    	char temp = board[i][j];
    	board[i][j] = '#';
    	boolean exist = exist(board, i, j + 1, cTrie, len + 1) ||
    					exist(board, i, j - 1, cTrie, len + 1) ||
    					exist(board, i - 1, j, cTrie, len + 1) ||
    					exist(board, i + 1, j, cTrie, len + 1);
    	board[i][j] = temp;
    	return exist;
    }

    private void buildTrie(TrieNode trie, String word, int len){

    	if(len == word.length() - 1){
    		trie.isWord = true;
    		return;
    	}
    	TrieNode nTrie = new TrieNode();
    	trie.children[word.charAt(len) - 'a'] = nTrie;
    	buildTrie(nTrie, word, len + 1);
    	return;
    }
}