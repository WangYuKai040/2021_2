import java.util.Scanner;
public class ex003 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num1, num2, max;
		System.out.print("�п�J2�ӼƦr(�Ϊť���Ϲj) : ");
		num1 = scn.nextInt();
		num2 = scn.nextInt();
		
		if (num1 > num2)
			max = num1;
		else
			max = num2;
		System.out.println("�̤j���Ʀr�O : "+ max);
		scn.close();
	}
}