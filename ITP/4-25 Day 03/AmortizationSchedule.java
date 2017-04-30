
    /*

Day2 in-class code snippet. 

Calculate and print a simple amortization table to the console.
      Payment is accelerated at the one year mark.  Double the payment.

*/


    public class AmortizationSchedule {


    public static void main(String[] args) {
   
     // declare and initialize variables
  
        double balance = 90000.00;
     // working balance
        
        float annualInterestRate = 11.0f;
 
        double monthlyPayment = 712.00;
  
        int month = 0;
        final int MONTHSPERYEAR = 12;
        final int MAXLOANTERM = 40;
        double power = 0;
     // current month
    
 
       // print balance, annualInterestRate, monthlyPayment
 
       power = Math.pow(2.0, 3.0);
       System.out.println("2 cubed  =  " + power);
       System.out.println("Initial Balance = " + balance);
 
       System.out.println("Annual Interest Rate = " + annualInterestRate + "%");
  
      // adjust int rate for calculations
        annualInterestRate = annualInterestRate/100;  
                                                      
              System.out.println("Monthly Payment = " + monthlyPayment);
 
      System.out.println();

 
       // print table header (month and balance)
 
       System.out.println("Month | Balance ");

 
       // Set up a loop.  Return here for the next month
  
       while(balance > 0.00 && month <= MONTHSPERYEAR*MAXLOANTERM)    {
  
          // And just in case of a runaway program... stop after 50 years
  
          if( month == 600 ) {
 
              break;
          
             }

   
         // print current month and balance then 
   
         //   re-calculate new month number and new balance
     
         //   new balance = old balance - monthly payment + 
      
         //                 old balance*interest rate/12
    
         System.out.printf("%d     %10.2f\n", month, balance);
   
          // At the one year mark, double the monthly payment.
          if (month == 12) {
              monthlyPayment = monthlyPayment * 2;
              }
         balance = balance - monthlyPayment + 
    
                 (balance*annualInterestRate/MONTHSPERYEAR);
  
          month++;
  
          
          // for (initialization; test; increment)  { body }
          String name = "Dave";
          for (int i = 1; i<=5; i++) {
          System.out.print(name);
              }
          // if balance > 0 then redo previous step
        

                }
   
       // else stop
   

          }


    }
