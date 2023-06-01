import java.util.Scanner;

public class Sample {
	float test,lab,assignment,total;
	Scanner scan=new Scanner(System.in);
	public void GetValues() {
		System.out.println("Enter your Test mark=");
		test=scan.nextInt();
		System.out.println("Enter your Lab mark=");
		lab=scan.nextInt();
		System.out.println("Enter your Assignment mark=");
		assignment=scan.nextInt();
	}
	public void Calculate() {
		total=(((test*70)/100) + ((lab*20)/100) + ((assignment*10)/100));
		System.out.println("Grade of the student="+total);
	}
}
