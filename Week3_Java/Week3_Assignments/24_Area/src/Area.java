import java.util.Scanner;
class Area 
{
		Scanner scan=new Scanner(System.in);
		void circle()
		{
			System.out.println("Enter Radius: ");
			int r=scan.nextInt();
			double Area= (3.14*r*r);
			System.out.println("The Area is: "+Area);
		}
		void square()
		{
			System.out.println("Enter Side: ");
			int side=scan.nextInt();
			int Area = side*side;
			System.out.println("The Area is: "+Area);
		}
		void rectangle() 
		{
			System.out.println("Enter the sides: ");
			int side1=scan.nextInt();
			int side2=scan.nextInt();
			int Area = side1 * side2;
			System.out.println("The Area is: "+Area);
		}
		void triangle() 
		{
			System.out.println("Enter length and breadth: ");
			int length=scan.nextInt();
			int breadth=scan.nextInt();
			double Area = (0.5 * length * breadth);
			System.out.println("The Area is: "+Area);
		}
}
