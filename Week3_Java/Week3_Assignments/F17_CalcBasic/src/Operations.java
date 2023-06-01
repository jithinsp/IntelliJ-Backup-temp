import java.util.Scanner;

public class Operations {
int number1,number2;
Scanner sc=new Scanner(System.in);
void Add()
{
	int sum=number1+number2;
	System.out.println("Answer is="+sum);
}
void Min()
{
	int min=number1-number2;
	System.out.println("Answer is="+min);
}
void Devide()
{
	int ans=number1/number2;
	System.out.println("Answer is="+ans);
}
void Multi()
{
	int ans=number1*number2;
	System.out.println("Answer is="+ans);
}
void GetNumbers() {
	System.out.println("Enter two numbers: ");
	number1=sc.nextInt();
	number2=sc.nextInt();
}
void GetChoice()
{
	System.out.println("Enter your choice: 1-Addition, 2-Subtraction, 3-Division, 4-Multiplication\n");
	int choice=sc.nextInt();
	switch(choice)
	{
	case 1:
	{
		GetNumbers();
		Add();
		break;
	}
	case 2:
	{
		GetNumbers();
		Min();
		break;
	}
	case 3:
	{
		GetNumbers();
		Devide();
		break;
	}
	case 4:
	{
		GetNumbers();
		Multi();
		break;
	}
	default:
	{
		System.out.println("Invalid input");
		break;
	}
	}
}
}
