import java.util.Scanner;
public class ex003 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num1, num2, max;
		System.out.print("請輸入2個數字(用空白鍵區隔) : ");
		num1 = scn.nextInt();
		num2 = scn.nextInt();
		
		if (num1 > num2)
			max = num1;
		else
			max = num2;
		System.out.println("最大的數字是 : "+ max);
		scn.close();
	}
}