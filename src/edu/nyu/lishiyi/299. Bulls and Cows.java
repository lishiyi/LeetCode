299. Bulls and Cows My Submissions Question
Total Accepted: 17184 Total Submissions: 61249 Difficulty: Easy
You are playing the following Bulls and Cows game with your friend: You write down a number and ask your friend to guess what the number is. Each time your friend makes a guess, you provide a hint that indicates how many digits in said guess match your secret number exactly in both digit and position (called "bulls") and how many digits match the secret number but locate in the wrong position (called "cows"). Your friend will use successive guesses and hints to eventually derive the secret number.

For example:

Secret number:  "1807"
Friend's' guess: "7810"
Hint: 1 bull and 3 cows. (The bull is 8, the cows are 0, 1 and 7.)
Write a function to return a hint according to the secret number and friend's' guess,
 use A to indicate the bulls and B to indicate the cows. In the above example, 
 your function should return "1A3B".

Please note that both secret number and friend's' guess may contain duplicate digits, 
for example:

Secret number:  "1123"
Friend's' guess: "0111"
In this case, the 1st 1 in friend's' guess is a bull, the 2nd or 3rd 1 is a cow, 
and your function should return "1A1B".
You may assume that the secret number and your friend's' guess only contain digits, 
and their lengths are always equal.

public class Solution {
    public String getHint(String secret, String guess) {

        int bull = 0;
        int cow =0;
		int[] digits = new int[10];
		//An array for the 10 digits
        for(int i = 0; i < guess.length(); i++){
        	//if they are at the same positon, bull +1
        	if(secret.charAt(i) == guess.charAt(i)){
        		bull += 1;
        	}
        	//Else. 
        	else{
        		//3. if the secret digit <0, that is, it has been geussed(-1) before,
        		//so let the cow +1, then go to the step 1 to fill.
        		if(digits[secret.charAt(i) - '0'] < 0){
        			cow += 1;
        		}
        		//4. if the guess digit >0, that is, it has been secreted(+1) before,
        		//so let the cow +1, then go to the step 2 to fill.
        		if(digits[guess.charAt(i) - '0'] > 0){
        			cow += 1;
        		}
        		//1. Let the secret +1
				digits[secret.charAt(i) - '0'] += 1;
				//2. Let the guess -1
	    		digits[guess.charAt(i) - '0'] -= 1;        			
        	}

        }

        return "" + bull + "A" + cow + "B";
    }
}