/*
	In a loop of 100 iterations, print "car" if the loop variable
	is a multiple of 3.  Otherwise print "buzz" if it's a multiple
	of 5.
	2) If the variable is multiple of 3 and 5, print "carbuzz"  */

	public class CarBuzzer {
		public static void main(String[] args) {


		for (int index=1; index<=100; index++) {
			int result3 = index%3;
			int result5 = index%5;

			if (result3==0 && result5==0) {
				System.out.println(index + "    carbuzz");
			}
			if (result3==0 && result5>0) {
				System.out.println(index + "    car");
			}
			if (result3>0 && result5==0) {
				System.out.println(index + "    buzz");
			}
			if (result3>0 && result5>0) {
				System.out.println(index);
			}
		}
	}
	}				