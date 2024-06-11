import java.util.Scanner;
public class ArthematicOperator {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double a,b,res;
int choice=0;
Scanner s=new Scanner(System.in);
System.out.println("enter the value of a");
a=s.nextDouble();
System.out.println("enter the value of b");
b=s.nextDouble();
System.out.println("enter the choice\n 1.sum\n 2.difference\n 3.product\n 4.quotient\n 5.remainder");
		choice=s.nextInt();
		switch(choice)
		{
		case 1:
			res=a+b;
			System.out.println("sum="+res);
			break;
		case 2:
			res=a-b;
			System.out.println("difference="+res);
			break;
			default :
			System.out.println("invalid");
			
			
		}


	}

}
