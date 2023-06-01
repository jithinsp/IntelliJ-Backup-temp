import java.util.Scanner;

public class Array2D 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);	
		System.out.println("Enter the size of the array: \n");
		int count=scan.nextInt();
		ClassSamp s=new ClassSamp();
		s.getArray(count);
		s.displayArray(count);
	}
}
class ClassSamp {
int[][] array=new int[10][10];
Scanner scan=new Scanner(System.in);
void getArray(int count)
{
	System.out.println("Enter the array: ");
	for (int i = 0; i < count; i++) 
	{
		for (int k = 0; k < count; k++) 
		{
		array[i][k]=scan.nextInt();
		}
	}
}
void displayArray(int count)
{
	System.out.println("The array is: ");
	for (int i = 0; i < count; i++) 
	{
		for (int k = 0; k < count; k++) 
		{
		System.out.print(array[i][k]+" ");
		}
		System.out.println();
	}
}
}


