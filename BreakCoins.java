/*                 P R O G R A M      Break Coins                     */
/* Author   : KuroP                                     */
/* Date     : 2019-9-16                                               */
/* Program  : Lab3 ex8                                                */
/* Input    : amount of dollars                                       */
/* Output   :  minimum of coins                                       */
/* Description: users input an amount, and then calculate the minimum number of coins
for corresponding amounts of dollars                                  */
import java.util.*;
public class BreakCoins{
	public static void main (String[] args) {
	    //varible dictionary
		int amount;
		int tendollar;
		int fivedollar;
		int twodollar;
		int onedollar;
		
	    Scanner input = new Scanner(System.in);
		// Create a Scanner object for console input
		System.out.print( "Input an amount:");
		amount = input.nextInt ();
		System.out.println( "The minimum numbers of coins for "+ amount +" dollars are:");
		
		
		
	    //computing the amount
		tendollar  = amount/10;
		amount     = amount%10;
		fivedollar = amount/5;
		amount     = amount%5;
		twodollar  = amount/2;
		amount     = amount%2;
		onedollar  = amount/1;
		
	     // all output statments 
		System.out.println("10-dollars coin(s):" + tendollar);
		System.out.println("5-dollars coin(s):" + fivedollar);
		System.out.println("2-dollars coin(s):" + twodollar);
		System.out.println("1-dollars coin(s):" + onedollar);
		
	
		
		
	}
}
