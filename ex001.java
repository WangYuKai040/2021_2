package ex001;
import java.util.Scanner;
public class ex001 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num1, num2, num3, num4, max;
		System.out.print("enter 4 num");
		num1 = scn.nextInt();
		num2 = scn.nextInt();
		num3 = scn.nextInt();
		num4 = scn.nextInt();
		if (num1 > num2) 
			{        
			if (num1 > num3)
			{
				if (num1 > num4)
					max = num1;
				else 
					max = num4;
			}
			else
			{
				if (num3 > num4)
					max = num3;
				else
					max = num4;
			}
		} 
		else 
		{
			if (num2 > num3)
			{
				if (num2 > num4)
					max = num2;
				else
					max = num4;
			}
			else
			{
				if	(num3 > num4)
					max = num3;
				else
					max = num4;
			}
		}
		System.out.println("max is"+ max);
		scn.close();
	}
}