/* Program By Ghanendra Yadav
   Visit http://www.programmingwithbasics.com/
*/
import java.util.Scanner;
class circle
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.print("Enter The Radius of Circle (��J�ꪺ�b�|) : ");
		double radius = sc.nextDouble();
		
	double area = Math.PI * Math.pow (radius,2);
		System.out.println("Circle Area is (�ꪺ���n) : "+ area);
	
	double circumference = 2 * Math.PI *radius;
		System.out.println( "Circle circumference is (�ꪺ�P��) : "+ circumference);
	
	double volume = 4 * Math.PI * Math.pow (radius,3)/3;
		System.out.println("Circle volume is (�y����n) : "+ volume);
		
	double SurfaceArea = 4 * Math.PI * Math.pow (radius,2);
		System.out.println("Circle Surface Area is (�y�����n) : "+ SurfaceArea);
	}
}