
package ex000;
import java.util.Scanner;
public class ex000{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("輸入您的名字:");
		String name = scn.nextLine();
		System.out.print("輸入您的英文名字:");
		String ename = scn.nextLine();
		System.out.print("輸入你的年齡: ");
		int num = scn.nextInt();
		System.out.printf("你好， %s %n你的英文名字: %s %n你的年齡: %d 歲", name, ename, num);
		scn.close();
	}
}