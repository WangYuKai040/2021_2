/* Program By Ghanendra Yadav
   Visit http://www.programmingwithbasics.com/
*/
import java.util.Scanner;
class circle
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.print("Enter The Radius of Circle (輸入圓的半徑) : ");
		double radius = sc.nextDouble();
		
	double area = Math.PI * Math.pow (radius,2);
		System.out.println("Circle Area is (圓的面積) : "+ area);
	
	double circumference = 2 * Math.PI *radius;
		System.out.println( "Circle circumference is (圓的周長) : "+ circumference);
	
	double volume = 4 * Math.PI * Math.pow (radius,3)/3;
		System.out.println("Circle volume is (球的體積) : "+ volume);
		
	double SurfaceArea = 4 * Math.PI * Math.pow (radius,2);
		System.out.println("Circle Surface Area is (球的表面積) : "+ SurfaceArea);
	}
}