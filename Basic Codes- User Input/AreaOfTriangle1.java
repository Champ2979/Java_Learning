import java.util.Scanner;
class AreaOfTriangle1{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		float a,b,c;
		
		System.out.print("Enter the base: ");
		a = s.nextFloat();
		
		System.out.print("Enter the height: ");
		b = s.nextFloat();
		
		c =(a*b)/2;
		
		System.out.println("Area of the triangle is: "+c);
		s.close();
		
		
		
	}
}