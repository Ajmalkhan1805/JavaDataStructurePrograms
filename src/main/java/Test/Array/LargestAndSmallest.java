package Test.Array;

import org.testng.*;
import org.testng.annotations.Test;

public class LargestAndSmallest {
	
	@Test
	public void Array_LargestAndSmallest() {
		
		int[] array = new int[] {12,555,125,654,88,22,1,2231,684,321,58,86485,3,321,854,55};
		
		int smallest = array[0];
		int largest = array[0];
		
		for(int i = 1; i < array.length; i++) {
			
			if(array[i] > largest) {
				largest = array[i];
			}else if(array[i]<smallest) {
				smallest = array[i];
			}
		}
		
		System.out.println("Smallest --> "+smallest+ " And largest --> "+largest);
		
	}

}
