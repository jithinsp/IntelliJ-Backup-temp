public class Pattern2F {
public static void main(String[] args) {
	for(int i=1;i<=3;i++)
	{
		for(int j=1;j<i*2;j++)
		{
			System.out.print("* ");
		}
		for(int k=0;k<=3*i;k++)
		{
			if(i!=3)
			{
			System.out.println("* ");
			}
		}
	}	
}
}