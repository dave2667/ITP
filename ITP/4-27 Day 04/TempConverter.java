/*
    Intialize and array of 5 Fahrenheit temeratures and outputs a 
    Centigrade value for each
    ***Revision***
    Create a centigrade array to store the C degrees
    */

    public class TempConverter  {
    	public static void main(String[] args)  {
        
        double[] fahrenheitTemps = {-40, 32, 40, 72, 98.6};
        double[] centigradeTemp;
        int index = 0;

        centigradeTemp = new double[fahrenheitTemps.length];

        for (index = 0; index < fahrenheitTemps.length; index++) {
        	//  The formula for converting Fahrenhet to Centigrade is
        	//      Deduct 32, then multiply by 5, then divide by 9
            centigradeTemp[index] = (fahrenheitTemps[index] - 32) * 5 / 9;
            }    
        for (index = 0; index < fahrenheitTemps.length; index++) {
        System.out.printf("%.1f Fahrenheit is %.1f Centigrade \n", 
          	fahrenheitTemps[index], centigradeTemp[index]);
        	}
    	}
    }