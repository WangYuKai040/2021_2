#include<iostream>
#include<math.h>
using namespace std;
int main()
{
	/*Program By Ghanendra Yadav
	Visit http://www,programmingwithbasics.com/
	*/
	int rad;
	float PI = 3.14159265359, area, ci, vo, su;
	
	cout<<"Enter radius of circle (��J�ꪺ�b�|) : ";
	cin>>rad;
	
	area = PI * pow (rad,2);
	cout<<"Area of circle (�ꪺ���n) :  "<< area<<endl;
	
	ci = 2 * PI * rad;
	cout<<"Circumference (�ꪺ�P��) : "<< ci<<endl;
	
	vo = 4* PI * pow (rad,3)/3;
	cout<<"Volume (�y����n) : "<< vo<<endl;
	
	su = 4 * PI * pow(rad,2);
	cout<<"Surface Area (�y�����n) : "<< su<<endl;
	
	return (0);
}
