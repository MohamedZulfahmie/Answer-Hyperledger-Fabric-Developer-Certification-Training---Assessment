import java.math.BigInteger;
public class sumOfDigits_100 {
	
   public static void main(String args[]) {

	// initialize BigInteger
    BigInteger result = new BigInteger("1");	
	  
	// calculate factorial
	for (int i = 100; i >= 1; i--) {
	result = result.multiply(BigInteger.valueOf(i));
	}	
	
	// calculate sum of digits
	String digits = result.toString();
    char digits_array[] = digits.toCharArray();
    int sum = 0, number = 0;
	
    for (int i = 0; i <digits_array.length; i++) {

        number = digits_array[i] - '0';
        sum += number;    
    }

	// display output
	System.out.println("The sum of the digits in the number 100! is: " + sum);	  

   }
}