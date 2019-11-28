package Test.Array;

import org.testng.annotations.Test;

public class FindMissingNumber {
	
	@Test
	public void findingMissingNumber() {
		
		int[] ar = {1,2,4,6,5,7,8,9,10};
		
		int n = ar.length + 1;
		int sum = n * (n+1) / 2;
		int restSum = 0;
		for(int i = 0; i < ar.length; i++) {
			restSum = restSum + ar[i];
		}
		System.out.println(sum - restSum);
	}
}
