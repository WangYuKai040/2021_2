
package ex000;
import java.util.Scanner;
public class ex000{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("��J�z���W�r:");
		String name = scn.nextLine();
		System.out.print("��J�z���^��W�r:");
		String ename = scn.nextLine();
		System.out.print("��J�A���~��: ");
		int num = scn.nextInt();
		System.out.printf("�A�n�A %s %n�A���^��W�r: %s %n�A���~��: %d ��", name, ename, num);
		scn.close();
	}
}