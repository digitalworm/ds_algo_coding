import java.util.Scanner;

public class KaprekarNumber {

    // Complete the kaprekarNumbers function below.
    static void kaprekarNumbers(int p, int q) {
        boolean atLeastOneKaprekarFound = false;
        
        for( long i = p; i <= q; i++ ) {
            Long squareInteger = new Long(i*i);
            
            int digitsInSquare = squareInteger.toString().length();
			if(digitsInSquare == 1) {
                //handle special case.
            	if( squareInteger.intValue() == i ) {
            		atLeastOneKaprekarFound = true;
                    System.out.print(i + " ");
            	}
            	
            } else if( digitsInSquare > 1 ) {
            	
                int numberOfDigits = numberOfDigits(i);
                int l = 0, r = 0;
                if( 2 * numberOfDigits == digitsInSquare) {
                	l = Integer.valueOf(squareInteger.toString().substring(0, numberOfDigits)).intValue();
                    r = Integer.valueOf(squareInteger.toString().substring(numberOfDigits)).intValue();
                } else {
                	l = Integer.valueOf(squareInteger.toString().substring(0, numberOfDigits-1)).intValue();
                    r = Integer.valueOf(squareInteger.toString().substring(numberOfDigits-1)).intValue();
                }
				
                if( (l + r == i) && r > 0) {
                    atLeastOneKaprekarFound = true;
                    System.out.print(i + " ");
                }
            } 
            
        }
        
        if(!atLeastOneKaprekarFound) {
            System.out.println("INVALID RANGE");   
        }

    }
    
    private static int numberOfDigits(long n) {
        int numberOfDigits = 0;
        while( n > 0 ) {
            numberOfDigits++;
            n = n / 10;
        }
        
        return numberOfDigits;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        kaprekarNumbers(p, q);

        scanner.close();
    }
}
