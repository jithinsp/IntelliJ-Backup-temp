import java.util.Scanner;

public class Tax {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your annual income: ");
		int income=scan.nextInt();
		if(income<=250000)
		{
			System.out.println("No tax");
		}
		else if(income<=500000)
		{
			float tax=((income*5)/100);
			System.out.println("Income tax amount: "+tax);
		}
		else if(income<=1000000)
		{
			float tax=((income*20)/100);
			System.out.println("Income tax amount: "+tax);
		}
		else if(income<=5000000)
		{
			float tax=((income*30)/100);
			System.out.println("Income tax amount: "+tax);
		}
		else
		{
			System.out.println("invalid input");
		}
	}

}
