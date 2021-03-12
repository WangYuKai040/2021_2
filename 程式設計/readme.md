# 遞增和遞減運算子
```
int x=3,y;
```
```
y= ++x;
x=4
y=4
```
```
y= x++;
y=4
x=3
```
# Fibonacci數列
```
public class Fibonacci {

	public static void main(String[] args) {
		
		/*
		 * Write a program to find first 20 numbers of Fibonacci Series
		 * 0 1 1 2 3 5 8 13 21
		 */
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		
		System.out.println(num1);
		System.out.println(num2);
		
		for(int i = 1; i <= 18; i++) {
			num3 = num1 + num2;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;
		}
		

	}

}
```
```
0
1
1
2
3
5
8
13
21
34
55
89
144
233
377
610
987
1597
2584
4181
```
