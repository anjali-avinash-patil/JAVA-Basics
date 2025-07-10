import java.util.Scanner;
class addition
{
	public static void main(String[] args)
	{
		int a,b,sum;
		Scanner s = new Scanner(System.in); // object creation
		System.out.println("enter first number");
		a = s.nextInt();
		System.out.println("enter second number");
		b = s.nextInt();
		sum = a+b;
		System.out.println("addition is" +sum);
	}
}