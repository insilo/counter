package counter;

import java.util.Scanner;

class Main {
	  public static void main(String[] args) {
		  try (Scanner s = new Scanner(System.in)) {
			//gathering the user's input
			  System.out.printf("# of quarters: ");
			  double quarters = s.nextDouble();
			  s.nextLine();
			  
			  System.out.printf("# of dimes: ");
			  double dimes = s.nextDouble();
			  s.nextLine();
			  
			  System.out.printf("# of nickels: ");
			  double nickels = s.nextDouble();
			  s.nextLine();
			  
			  System.out.printf("# of pennies: ");
			  double pennies = s.nextDouble();
			  s.nextLine();
			  
			  //converting to money
			  double sum = (quarters * .25 + dimes * .10 + nickels * .05 + pennies *.01);
			  
			  double roundOff = Math.round(sum * 100.0) / 100.0;

			  System.out.println(roundOff);
			  //Separating the # of dollars and the # of cents
			  double doubleNumber = roundOff;
			  String DoubleAsString = String.valueOf(doubleNumber);
			  int indexOfDecimal = DoubleAsString.indexOf(".");
			  
			  //printing the result
			  System.out.printf("you have " + DoubleAsString.substring(0, indexOfDecimal) + " dollars and " + DoubleAsString.substring(indexOfDecimal) + " cents");
		}
		  
		  ;
		  
	    }
	  }
	
