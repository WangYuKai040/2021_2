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
	
	cout<<"Enter radius of circle (輸入圓的半徑) : ";
	cin>>rad;
	
	area = PI * pow (rad,2);
	cout<<"Area of circle (圓的面積) :  "<< area<<endl;
	
	ci = 2 * PI * rad;
	cout<<"Circumference (圓的周長) : "<< ci<<endl;
	
	vo = 4* PI * pow (rad,3)/3;
	cout<<"Volume (球的體積) : "<< vo<<endl;
	
	su = 4 * PI * pow(rad,2);
	cout<<"Surface Area (球的表面積) : "<< su<<endl;
	
	return (0);
}
