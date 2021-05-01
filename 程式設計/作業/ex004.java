import java.util.Scanner;
public class ex004 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int num1, num2, num3, max, min;
		System.out.print("叫块3计(ノフ龄跋筳) : ");
		num1 = num.nextInt();
		num2 = num.nextInt();
		num3 = num.nextInt();
		
		max = min = num1;
		if (num1 > max){
			max = num1;
		}else if (num1 < min){ 
			min = num1;
		}
		if (num2 > max){
			max = num2;
		}else if (num2 < min){
			min = num2;
		}
		if (num3 > max){
			max = num3;
		}else if (num3 < min){
			min = num3;
		}
		System.out.printf("程计琌 : %d%n程计琌 : %d%n",max ,min);
		num.close();
	}
}