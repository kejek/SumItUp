package com.sumitup;

import java.util.Arrays;

public class SumItUp {
	public int SumItUp(int[] array) throws Exception {
		int size = array.length;
		int max = array[size-1];		
		double a = 0;
		int b = 0;
		
		a = size *(size-1)/2;
		if(a % 1 == 0){
			//a is a whole number
			b = Arrays.stream(array).sum();
			return (int) (b-a);
		}
		else{
			throw  new Exception();
		}
	}

}
