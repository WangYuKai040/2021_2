#include<stdio.h>
#include<math.h>
int main()
{
	/*Program By Ghanendra Yadav
	Visit http://www,programmingwithbasics.com/
	*/
	int rad;
	float PI = 3.14159265359, area, ci, vo, su;
	
	printf("\nEnter radius of circle (輸入圓的半徑) : ");
	scanf("%d", &rad);
	
	area = PI * pow (rad,2);
	printf("\nArea of circle (圓的面積) : %f ", area);
	
	ci = 2 * PI * rad;
	printf("\nCircumference (圓的周長) : %f ", ci);
	
	vo = 4* PI * pow (rad,3)/3;
	printf("\nVolume (球的體積) : %f ", vo);
	
	su = 4 * PI * pow (rad,2);
	printf("\nSurface Area (球的表面積) : %f ", su);
	
	return (0);
}
