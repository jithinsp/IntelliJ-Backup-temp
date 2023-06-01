import java.util.Scanner;

class MyClass extends Area
{
public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	Area a=new Area();
	System.out.println("Enter your choice:\n1.Circle\n2.Square\n3.Rectangle\n4.Triangle\n");
	int choice = scan.nextInt();
	switch(choice)
	{
	case 1:
	{
		a.circle();
		break;
	}
	case 2:
	{
		a.square();
		break;
	}
	case 3:
	{
		a.rectangle();
		break;
	}
	case 4:
		a.triangle();
		break;
	}
}
}

