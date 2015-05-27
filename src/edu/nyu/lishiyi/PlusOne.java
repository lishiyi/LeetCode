package edu.nyu.lishiyi;

import java.util.Arrays;

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
		
		
		for(int i = digits.length - 1 ; i >= 0 ; i --){
			int d = digits[i] + 1;
			if( d < 10 ){
				digits[i] = d;
				break;
			}
			else{
				digits[i] = 0;
			}
		}
		
		if(digits[0] != 0){
			return digits;
		}
		else{
			int[] temp = new int[digits.length+1];
			temp[0] = 1;
			for(int i = 0; i<digits.length ; i++){
				temp[i+1]=digits[i];
			}
			return temp;
		}
		/*
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
		*/
    }
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		int[] a = new int[] {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(plusOne(a)));
		
		int[] b = new int[] {6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3};
		System.out.println(Arrays.toString(plusOne(b)));
		
		
	}

}
