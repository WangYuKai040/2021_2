import java.util.Scanner;
public class ex006 {
public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int max, min;
		System.out.print("叫块5计(ノフ龄跋筳) : ");
		int n1 = n.nextInt();
		int n2 = n.nextInt();
		int n3 = n.nextInt();
		int n4 = n.nextInt();
		int n5 = n.nextInt();
		
		
		int arr[] = {n1, n2, n3, n4, n5};
		max =  min = arr[0];
		for (int i = 0; i <= 4; i++){
			if (arr[i] >= max){
				max = arr[i];
			}else if (arr[i] <= min){
				min = arr[i];
			}
		}
		System.out.printf("程计琌 : %d%n程计琌 : %d%n",max ,min);
		n.close();
	}
}