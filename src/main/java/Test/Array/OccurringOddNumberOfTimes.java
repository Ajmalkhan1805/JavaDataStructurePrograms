package Test.Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class OccurringOddNumberOfTimes {

	
	
	@Test
	public void FindNumbersOccurringOddNumberOfTimes() {
		
		int[] ar = new int[]{20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20};
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < ar.length; i++) {
			
			if(map.get(ar[i]) == null) {
				map.put(ar[i], 1);
			}else {
				map.put(ar[i], map.get(ar[i]) + 1);
			}
		}
		
		for(Entry<Integer, Integer> entry: map.entrySet()) {
			
			if(entry.getValue()%2 == 1) {
				
				System.out.println(entry.getKey());
			}
			
		}
	}
	
	
}
