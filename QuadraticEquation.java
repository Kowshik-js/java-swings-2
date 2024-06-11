import java.util.Scanner;
public class QuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double m=0,n=0,a,b,c,determinent,r;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the coefficient of a");
		a=s.nextDouble();
		System.out.println("eneter the coefficient of b");
		b=s.nextDouble();
		System.out.println("enter the coefficient of c ");

		c=s.nextDouble();
		determinent=b*b-4*a*c;
		r=Math.sqrt(determinent);
		if (determinent>0)
		{
			m=(-b+r)/(2*a);
			n=(-b-r)/(2*a);
			System.out.println("the roots are real and destinct m="+m+"n+"+n);
		}
		else if (determinent==0)
		{
			m=(-b)/(2*a);
			n=m;
	
		System.out.println("the roots are real and equal m="+m+"n="+n);
	}
		else {
			System.out.println("the roots are imaginary");
		}
}
}