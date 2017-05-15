/* Create a new class called SixShooter that creates a boolean array of 6 elements called 
   truthOrConsequences. All elements will be false by default. Using the java.util.Random 
   class, iterate (loop over) the array until all elements are true. 

     Use the nextInt() method to return randoms between 0 and 5 (why?) and set that element 
     to true. Print the array before stopping. */

        // Because we're using a random generator,
        //   import the java.util package
import java.util.Random;
// import java.util.*;

public class SixShooter {
    public static void main(String[] args) {
    	boolean[] truthOrConsequences = new boolean[6]; // Should default to "false" on init
    	Random generator = new Random();  // Handle for my random number generator
    	boolean loading = true;

    	printLoadout(truthOrConsequences);
    	while (loading) {
    		loading=false;
    		for (int chamber=0; chamber<truthOrConsequences.length; chamber++) {
    			if (truthOrConsequences[chamber]==false) {
   					loading=true;		
    				int isItTrue=generator.nextInt(2);
    				if (isItTrue==1) {
    					truthOrConsequences[chamber]=true;
	    			} // End Random is true
    			} //End chamber is false	
    		} //End iteration 0 - 5// 
    	} // End while
   		printLoadout(truthOrConsequences);
    } // End main
    public static void printLoadout(boolean[] cylinder) {
    	int index;
    	System.out.print("Cylinder is fully loaded? ");
    	for (index=0; index<cylinder.length-1; index++) {
    		System.out.print(cylinder[index] + ", ");
    	}
    	System.out.println(cylinder[index]);

    } // End printLoadout
    
}