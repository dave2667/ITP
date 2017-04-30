    /*
      Returns a payment amount for a given loan setup:
      Principal amount
      annual interest rate
      desired term (in years)

      LoanPaymentCalc(double principal, float annualRatePercent, int loanTermInYears)
      */

      public class AmortizationFormulaArray  {

      public static void main(String[] args)  {
      	/*  
      	    A = P  r(1+r)^n
      	          -------------
                   (1+r)^n - 1
      	    where
                 A = payment Amount per period
                 P = initial Principal (loan amount)
                 r = interest rate per period
                 n = total number of payments or periods      
                                                           */

          String parmPrincipal         = " "; 
      	  //String parmAnnualRatePercent = args[1]; 
      	  String parmLoanTermInYears   = " ";
          double principal        = 90000.00;  // this is "P"
      	  float annualRatePercent = 11.0f; 
      	  int loanTermInYears     = 30;
          double[] interestRates  = {1.95, 17.99, 29.95, 36., 120.};

          double paymentAmountInDollars = 0.00;   // this is "A"
          float annualRateFactor = 0f;
          float monthlyRateFactor = 0f;
          double rPlusOneToTheNth = 0;
          int paymentAmountInCents = 0;
          int loanTermInMonths = 0;
          int index = 0;
          final int MONTHSPERYEAR = 12;

          // Bring in Principal from the arguments
          System.out.println("args 0 = " + parmPrincipal);
          if(args.length>=1)  {
              parmPrincipal    = args[0]; 
              principal        = Double.parseDouble(parmPrincipal); 
              }
          if(args.length>=2)  {
              parmLoanTermInYears  = args[1]; 
              loanTermInYears      = Integer.parseInt(parmLoanTermInYears); 
              }
          // Loop through the rates in the array and compute the payment
          for(index=0; index<interestRates.length; index++) {
              loanTermInMonths = loanTermInYears*MONTHSPERYEAR;       // this is "n"
//              annualRateFactor = annualRatePercent/100;
              annualRateFactor = (float)interestRates[index]/100;
              monthlyRateFactor = (annualRateFactor/MONTHSPERYEAR);   // this is "r"
              rPlusOneToTheNth = Math.pow(monthlyRateFactor+1, loanTermInMonths);
              // and put it all together
              paymentAmountInDollars = (principal * monthlyRateFactor *
                                        rPlusOneToTheNth) /
                                       (rPlusOneToTheNth-1);

              // Round to dollars and cents with half adjust on the cents
                 // int truncates without half adjust.  Manually half adjust.                      
              paymentAmountInCents = (int)((paymentAmountInDollars*100) + .5);
              paymentAmountInDollars = (double)paymentAmountInCents/100;

              System.out.println("For a loan of $" + principal + " paid back over " +
          	                      loanTermInYears + " years with an \n    annual rate of " +
          	                      interestRates[index] + "%, the monthly payment will be\n     $" +
//                                  annualRatePercent + "%, the monthly payment will be\n     $" +
          	                      paymentAmountInDollars);
               }

          }

      }