import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,m,flag=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		m=n-1;
		if (n==0||n==1)
		{
			System.out.println("prime number");
		}
			else
			{
			for (i=2;i<m;i++)
			{
				if (n%2==0)
				{
					System.out.println("not a prime number");
					flag=1;
					break;
				}
			}
			if(flag==0)
			
				System.out.println("it is a prime number");
				
				}
			}
		}
