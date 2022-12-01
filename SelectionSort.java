public class SelectionSort {
/** Creates a new instance of SelectionSort */
    public SelectionSort() {
    }
    
    /* A simple SelectionSort algorithm
     * pre-condition: 
     * post-condition:
     * inputs:
     * outputs:
     * special conditions:
     */    
    public int[] basicSelectionSort(int[] x) {
        for (int i = 0; i < x.length; ++i) {
        	
        	int minimumIndex = i;
        	
            for (int j= i+1; j < x.length; ++j) {            	           	
                if (x[minimumIndex] > x[j]) {
                	minimumIndex = j;               	
                }
            } // end of inner for loop
            
            int temp;
            temp = x[minimumIndex];
            x[minimumIndex] = x[i];
            x[i] = temp;
        } // end of outer for loop
        return x;
    } // end of basicSelectionSort method
}
