package mypackage;
import java.util.Scanner;

public class Greater_num {
	public static void main(String[]args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();		 
		if(a>b && a>c)
		    System.out.println("a is greater than b and c");
		else if(a<b && c<b)
		   System.out.println("b is  greater than a and c");
		else if(a==b && a==c)
			System.out.println("a is equal to b and c");
		else
			System.out.println("c is greater to b and  a");
	}

}
