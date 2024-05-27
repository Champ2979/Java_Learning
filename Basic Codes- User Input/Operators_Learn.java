import java.util.Scanner;
// code for getting the quoient & remainder.
class Operators_Learn{
	public static void main( String[] args){
	Scanner s = new Scanner(System.in);
	
	System.out.print("Enter the number a: ");
	// float a = s.nextFloat();
	byte a = s.nextByte();
	
	System.out.print("Enter the number b: ");
	// float b = s.nextFloat();
	int b = s.nextInt();
	
	int c = a-b;
	// float c = a/b;
	// float r = a%b;
	System.out.println("The answer is: "+c);
	// System.out.println("Hence the quotient is: "+c);
	// System.out.println("Hence the remainder is: "+r);
	/*Here it is stated that the byte and int givees Int, Float and Int gives Float, and the 
	Double with Int or Float gives double. Actually this is the rule in the arithemetic operators.*/
	s.close();
	
	}
}