import java.util.Scanner;

class Precedence{
	public static void main (String[] args){
		Scanner s = new Scanner(System.in);
		int a,b,c,d ;
		
		System.out.print("Enter the number a: ");
		a = s.nextInt();
		
		System.out.print("Enter the number b: ");
		b = s.nextInt();
		
		c = (a-b)*(a+b);
		d = (a+b)/2; // here it is stated that the precedence of the number must be followed.
		
		System.out.println("The result is: "+c);
		System.out.println("The result is: "+d);
		s.close();
		
	}
}