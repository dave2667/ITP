/* 1) Create a bubble sort class that sorts 10 random
       numbers in array 'items'
   2) Print the items that are being considered before swapping
   3) If you swap, print "Swapped"
      items[8]=3 items[9=-3] "Swapped!"
   4) Print the final array at the end.  */

        // Because we're using a random generator,
        //   import the java.util package
import java.util.*;

public class BubbleSortRandom {
    public static void main(String[] args) {


        int[] items = new int[100];
        Random generator = new Random();
        boolean swapped = true;

        // Initialize the integer array with arguments passed in
        for(int index=0; index<items.length; index++) {
        	items[index]=generator.nextInt(5000);
        }
        // Print the array before sorting
        printArray(items);
        // Repeat sorting passes until no more elements are moved
        while (swapped) {
            swapped = false;
            // Sorting pass - Start
            for (int indexLeft=0; indexLeft<items.length-1; indexLeft++) {
                int indexRight = indexLeft + 1;
                if (items[indexLeft] > items[indexRight]) {
                	/* Print the 'swap' line */
                	printSwap(indexLeft, indexRight, items[indexLeft],
                		items[indexRight]);
                	//Hold on to the left value temporarily
                    int itemsTempLeft = items[indexLeft];
                    //Swap left for right and right for left
                    items[indexLeft] = items[indexRight];
                    items[indexRight] = itemsTempLeft; 
                    swapped = true;
                }
            }
        // Sorting pass - End
        }
        // Print the array after sorting
        printArray(items);
    } // End of main

    /* Method to print the entire string of items */
    public static void printArray(int item[]) {
    	System.out.print("items = ");
    	for (int index=0; index<item.length; index++) {
    		System.out.print(item[index]);
    		// Comma separate all values, except for the last
    		if (index<item.length-1) {
    			System.out.print(", ");
    		}
    	}
        System.out.print("\n");
    }  // End of printArray

    /* Method to print any elements in the 'item' array that are 
       being swapped */
    public static void printSwap(int ndx1, int ndx2, int valLeft, int valRight) {
        System.out.println("items[" + ndx1 + "]=" + valLeft + "  " +
        	               "items[" + ndx2 + "]=" + valRight +
        	               " Swapped!");
    } // End of printSwap
}