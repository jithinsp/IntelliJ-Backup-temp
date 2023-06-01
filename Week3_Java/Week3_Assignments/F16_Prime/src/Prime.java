import java.util.Scanner;
public class Prime {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=sc.nextInt();
		boolean flag=false;
		for(int i=2; i<=number/2; i++)
		{
			if(number%i==0)
			{
				flag=true;
			}
		}
		if(flag|number==0|number==1)
		{
			System.out.println("The number is not a prime number");
		}
		else
		{
			System.out.println("The number is a prime number");
		}
	}
}
