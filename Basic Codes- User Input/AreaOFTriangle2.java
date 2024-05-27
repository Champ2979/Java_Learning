import java.util.Scanner;

class AreaOFTriangle2{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		int side1, side2, side3;
		double S, area;
		
		System.out.print("Enter the side1: ");
		side1 = s.nextInt();
		
		System.out.print("Enter the side2: ");
		side2 = s.nextInt();
		
		System.out.print("Enter the side3: ");
		side3 = s.nextInt();
		
		S= (side1+side2+side3)/2 ;
		area = Math.sqrt(S*(S-side1)*(S-side2)*(S-side3));
		
		System.out.println("Hence the area of triangle is: "+area);
		s.close();
		
	}
}