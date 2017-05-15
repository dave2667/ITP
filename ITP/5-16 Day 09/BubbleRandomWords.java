/* Loads the array to sort with random words. A random word is created by using 
   Random.nextInt() to return a number that gives the length of the word, then 
   additional random numbers that correspond to letters e.g. "a" for 0, "b" for 1,
   etc. Once the word is constructed it's added to the array and the process 
   continues until array is full. 

   The array is then sorted as usual */
import java.util.Random;
public class BubbleRandomWords {
	public static void main(String[] args) { 
		String[] bubble = new String[10];
		Random generator = new Random();
		int wordLength = 0;
		String wordWorking="";
		int wordPlace=0;

		// Select a "word" for every element in the array
		for (wordPlace=0; wordPlace<bubble.length; wordPlace++) {
			// Calculate a random word length
			wordLength=generator.nextInt(20);
			// for every character in the word, get a random
			//   number between 0 and 51
			for (int character=0; character<wordLength; character++) {
				int charValue=generator.nextInt(52);
				// Each of these random numbers will be a character.
				// Add the character to the end of the word.
				wordWorking += numberToChar(charValue);
			} // End character<wordLength
			// Add the word to the bubble array
			bubble[wordPlace]=wordWorking;
			wordWorking = ""; // Back to null
		} // End word<bubble.length
		printArray(bubble);
	} // End main()
	/* Method that will translate a number into an alphabet character
	   Values 1 - 52 only  */
	public static String numberToChar (int numberIn) {
		String[] letter= {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
	                      "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", 
	                      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", 
	                      "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		return letter[numberIn];

	} // End numberToChar()

    /* Method to print the entire string of items */
    public static void printArray(String item[]) {
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