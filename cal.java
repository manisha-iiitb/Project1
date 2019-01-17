import java.util.Scanner;
public class cal
{
	public static void main(String args[])
	{
		float a,b,res;
		char choice,ch;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("1.Add two no.");
			System.out.println("2.Exit");
			System.out.print("Enter your choice:");
			choice=sc.next().charAt(0);
			switch(choice)
			{
				case '1': System.out.print("Enter two number:");
					a=sc.nextFloat();	
					b=sc.nextFloat();
					res=a+b;
					System.out.println("Result = "+res);
					break;
				case '2':System.exit(0);
					break;
				default:System.out.println("Invalid Choice");
					break;
			}
			System.out.println("-------");
		}while(choice!=2);
	}
}
