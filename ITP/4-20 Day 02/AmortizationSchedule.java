        /*    Amortization schedule - calcluate and print a simple
          amortization schedule to the console.
   */

    public class AmortizationSchedule {
 
         public static void main(String[] args) {
 
         // Declare and initialize variables
 
         // Define Initial Balance
 
         double balance = 90000.00;
       
         // Define Annual Interest rate
 
         float annualIntRate = 11.f/100;
 
         // Define Monthly payment
 
         double monthlyPayment = 712.00;
 
         // Count the months
 
         float month = 0.f;

 

         //  Print table header
 
         System.out.println("Initial Balance = " + balance);
 
         System.out.println("Annual Interest Rate = " + annualIntRate*100 + "%");
 
         System.out.println("Monthly Payment = " + monthlyPayment);
 
         System.out.println(" ");
 
         System.out.println("Month | Balance");


         

// Loop to calculate monthly output
 
         // print the current month and Balance
 
         System.out.println(month + "    " + balance);
 

         // Calculate the new month and Balance
 
         //   balance = old balance - monthlypayment + 
         //             old balance * annualintrate / 12
         balance = balance - monthlyPayment + balance * annualIntRate / 12;
         month++;
         System.out.println(month + "    " + balance);
 
 
       

  // If new balance is greater than zero, go to the top of the loop

         //   Else exit
 
       }
    
    }
