package Test.Array;

import org.testng.annotations.Test;

public class SecondLargestNumber {
	
	@Test
	public void secondLargestNumber() {
		
		int[] ar = {112,23,65,89,631,54,8974,35241,31,8469,654};
		
		int len = ar.length;
		
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		
		for(int i = 0; i < len; i++) {
			
			if(ar[i]>highest) {
				
				secondHighest = highest;
				highest = ar[i];
			}else if(ar[i] > secondHighest) {
				secondHighest = ar[i];
			}
		}
		System.out.println(secondHighest);
	}

}
