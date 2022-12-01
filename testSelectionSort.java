import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {

	
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}
	
    public testSelectionSort() {
    	
    }
    
	@Test
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        
        /** add tests to check for this unit test **/
    }
    
	@Test
    public void testNegative(){
        
        /** Test data contains negative values only **/
    }
    
	@Test
    public void testMixed(){
		
		int length = 5;
        
        /** Test data contains with both positive, negative and zeros **/		
        int[] arr = new int[length];
        arr[0] = 0;
        arr[1] = 9;
        arr[2] = -7;
        arr[3] = 10;
        arr[4] = -2;
        
        int[] expectedSortedArr = new int[5];
        
        expectedSortedArr[4] = -7;
        expectedSortedArr[3] = -2;
        expectedSortedArr[2] = 0;
        expectedSortedArr[1] = 9;
        expectedSortedArr[0] = 10;
        
        SelectionSort selectionSort = new SelectionSort();
        
        int[] sortedArr = selectionSort.basicSelectionSort(arr);
        
        for(int i = 0; i < length; i++)
        {
        	assertSame("Test of mixed has failed at index: " + i, expectedSortedArr[i], sortedArr[i]);
        }
    }
    
	@Test
    public void testDuplicates(){
        
		int length = 5;
		
        /** Test data contains duplicates **/        
		int[] arr = new int[length];
        arr[0] = 0;
        arr[1] = 0;
        arr[2] = -7;
        arr[3] = 10;
        arr[4] = 10;
        
        int[] expectedSortedArr = new int[length];
        
        expectedSortedArr[4] = -7;
        expectedSortedArr[3] = 0;
        expectedSortedArr[2] = 0;
        expectedSortedArr[1] = 10;
        expectedSortedArr[0] = 10;
        
        SelectionSort selectionSort = new SelectionSort();
        
        int[] sortedArr = selectionSort.basicSelectionSort(arr);
        
        for(int i = 0; i < length; i++)
        {
        	assertSame("Test of duplicates failed has failed at index: " + i, expectedSortedArr[i], sortedArr[i]);
        }
    }
}