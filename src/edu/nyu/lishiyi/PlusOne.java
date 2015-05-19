package edu.nyu.lishiyi;
/**
 * #66 Plus One
 * @author Shiyi
 *
 */

public class PlusOne {

	
	public static int[] plusOne(int[] digits) {
		
		if(digits == null){
			
			return null;
		}
		
		boolean needMoreDigit = true;
		for(int digit : digits){
			if(digit != 9 ){
				needMoreDigit = false;
			}
		}
		
		int len = digits.length;
		long num = 0;
		for (int i = 0 ; i < len ; i++){
			num += Math.pow(10, len - i - 1) * digits[i];
		}
		num += 1;
		
		
		System.out.println(num);
		
		int len2 = needMoreDigit? (digits.length + 1) : (digits.length);
		int[]temp = new int[len2];
		for(int i = 0 ; i < len2 ; i ++){
			
			temp[i] = (int) (num / (int) Math.pow(10, len2 - 1 - i ));
			num %= Math.pow(10, len2 - 1 - i);
		}
		
		
		System.out.println(temp.toString());
		
		return temp;
    }
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		int[] a = new int[] {1,2,3,4,5,6,7,8,9};
		plusOne(a);
		int[] b = new int[] {6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3};
		plusOne(b);
		
		
	}

}
