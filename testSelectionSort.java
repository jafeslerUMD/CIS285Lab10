import static org.junit.Assert.*;
import org.junit.Test;

public class testSelectionSort {
	
    public testSelectionSort() {
    	
    }
    
	@Test
    public void testPositive(){
		int length = 5;
		
		/** Test data contains positive values only **/
        int[] arr = new int[length];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] expectedSortedArr = new int[5];
        expectedSortedArr[0] = 2;
        expectedSortedArr[1] = 7;
        expectedSortedArr[2] = 8;
        expectedSortedArr[3] = 9;
        expectedSortedArr[4] = 10;
        
        SelectionSort selectionSort = new SelectionSort();
        
        int[] sortedArr = selectionSort.basicSelectionSort(arr);
        
        for(int i = 0; i < length; i++)
        {
        	assertSame("Test of only positives has failed at index: " + i, expectedSortedArr[i], sortedArr[i]);
        }		
    }
    
	@Test
    public void testNegative(){
        
		int length = 5;
		
		/** Test data contains negative values only **/
        int[] arr = new int[length];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;
        
        int[] expectedSortedArr = new int[length];
        
        expectedSortedArr[4] = -10;
        expectedSortedArr[3] = -9;
        expectedSortedArr[2] = -8;
        expectedSortedArr[1] = -7;
        expectedSortedArr[0] = -2;
        
        SelectionSort selectionSort = new SelectionSort();
        
        int[] sortedArr = selectionSort.basicSelectionSort(arr);
        
        for(int i = 0; i < length; i++)
        {
        	assertSame("Test of negatives only failed has failed at index: " + i, expectedSortedArr[i], sortedArr[i]);
        }	
    }
    
	@Test
    public void testMixed(){
        
        /** Test data contains with both positive, negative and zeros **/
    }
    
	@Test
    public void testDuplicates(){
        
        /** Test data contains duplicates **/
    }
}