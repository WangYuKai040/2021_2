#include<stdio.h>
#include<math.h>
int main()
{
	/*Program By Ghanendra Yadav
	Visit http://www,programmingwithbasics.com/
	*/
	int rad;
	float PI = 3.14159265359, area, ci, vo, su;
	
	printf("\nEnter radius of circle (��J�ꪺ�b�|) : ");
	scanf("%d", &rad);
	
	area = PI * pow (rad,2);
	printf("\nArea of circle (�ꪺ���n) : %f ", area);
	
	ci = 2 * PI * rad;
	printf("\nCircumference (�ꪺ�P��) : %f ", ci);
	
	vo = 4* PI * pow (rad,3)/3;
	printf("\nVolume (�y����n) : %f ", vo);
	
	su = 4 * PI * pow (rad,2);
	printf("\nSurface Area (�y�����n) : %f ", su);
	
	return (0);
}
