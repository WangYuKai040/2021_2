#
```
public class Main {

	public static void main(String[] args) {
		int total1, x=17, y=28;
		double total2, i=3.8, j=22.7, k=15.1;
		total1 = _____(1)_____;   
		total2 = _____(2)_____; 
		System.out.printf("%d%n",total1);
		System.out.printf("%f%n",total2);
	}
	
	static int add(int a, int b) {
		return a + b; // 傳回兩個整數相加的結果
	}
	
	static double add(double a, double b, double c) {
		return a + b + c; // 傳回三個倍精確度相加的結果
	}
  
}
```
```
上述程式中填寫結果如下(選出錯誤的)
[A]total1 = add(x, y);   <====(1)
   total2 = add(x, y, k); <=====(2)
   會正確執行
[B]total1 = add(x, y);   <====(1)
   total2 = add(i, j, k); <=====(2)
   會正確執行
[C]total1 = add(i, j);   <====(1)
   total2 = add(i, j, k); <=====(2)
   會正確執行
[D]以上都會正確執行
```
```
[C]
```
# 填充題
```
public class Angle {
	public static void main(String[] args) {
		double angle = 60;				
                double radian = _____________________;   
		
		double sin = Math.sin(radian); 		
                System.out.println("sin=" + sin);	
		double cos = Math.cos(radian); 		
                System.out.println("cos=" + cos);
	 
	}

}
```
```
angle * (Math.PI / 180)
```
```
D:\E040>java Angle.java
sin=0.8660254037844386
cos=0.5000000000000001
```
# 問答題
```
[1]舉例說明　傳值呼叫(call by value)與　參考呼叫(call by reference)
```
傳值呼叫(call by value)
方法中的虛引數宣告為 基本資料 型別，基本資料型別的變數存放在Stack堆疊儲存空間，
呼叫敘述的實引數與被呼叫的虛引數是分別 佔用不同記憶體，
因此，使用傳直呼叫可以防止變數被方法更改。
```
package ex05;
public class CallByVal {
	public static void main(String[] args) {
		int a = 10, b = 15;
		System.out.println(" 傳值呼叫前\ta=" + a + "\tb=" + b ); 
		byVal(a, b); 
		System.out.println(" 傳值呼叫後\ta=" + a + "\tb=" + b ); 
	}

	static void byVal(int x, int y) { //將實引數的內容傳給需引數
		int t; //以變數t作為暫存區，將引數互換
		t = x;
		x = y;
		y = t;
		System.out.println(" 傳值呼叫中\tx=" + x + "\ty=" + y );
	}
}
```
```
D:\E040>java CallByVal.java
 傳值呼叫前     a=10    b=15 //傳直呼叫前的變數值
 傳值呼叫中     x=15    y=10 //實引數與虛引數分別占用不同的記憶體位址，所以若虛引數互相對調其內容並不會引響到實引數
 傳值呼叫後     a=10    b=15 //傳值呼叫後的結果，因為佔不同記憶體所以a仍為10、b為15
```
參考呼叫(call by reference)
方法中的虛引數為 參考資料 型別，呼叫敘述的實引數與被呼叫方法的虛引數，兩者 佔用同一記憶體位址，
也就是在做引數傳遞時，呼叫敘述中的實引數是將自己本身的記憶體位置傳給被呼叫方法的虛引數，
因此，以參考呼叫傳遞引數的好處，就是被呼叫方法可以透過該引數直接將資料傳回給呼叫敘述。
```
package ex05;

class Obj {
	int a, b;

	Obj() {
		a = 10;
		b = 15;
	}
}

public class CallByRef {
	public static void main(String[] args) {
		Obj obj = new Obj();
		System.out.println(" 參考呼叫前\t a = " + obj.a + "\tb = " + obj.b);
		byRef(obj);
		System.out.println(" 參考呼叫後\t a = " + obj.a + "\tb = " + obj.b);
	}

	static void byRef(Obj p) {
		int t;
		t = p.a;
		p.a = p.b;
		p.b = t;
	}
}
```
```
參考呼叫前 a=10 b=15
參考呼叫後 a=15 b=10 //此時實引數與虛引數佔用相同的記憶體位址，所以若虛引數有更改其內容會影響實引數
```
[2]舉例說明　方法多載
方法多載或稱超載、覆載，就是在同一個類別中，允許方法使用相同的名稱，但是後面所接的引數串列必須是資料型別不同、個數或順序不同。
```
void methed(){}
int methed(){}			//不能多載: 雖然傳回值不同但引數個數相同
void methed(int a){}		//成功多載: 比第1行的方法多一個引數
void methed(int b){}		//不能多載: 引數名稱不同，但和第3行的型別和個數相同
void methed(String s){}		//成功多載: 雖然和第3行引數個數相同但類型不同
void methed(int a,String s){}	//成功多載: 引數個數和型別都不同
void methed(String s,int a){}	//成功多載: 和第6行引數個數和型別相同但順序不同
```
下面簡例中，在AddNum類別中定義兩個名稱為「add」的靜態方法，一個add()方法用來傳回兩個整數相加的結果，
另一個add()方法用來傳回三個倍精確度數值相加的結果。
```
package ex05;

public class AddNum {
	public static void main(String[] args) {
		int total1, x=17, y=28;
		double total2, i=3.8, j=22.7, k=15.1;
		total1 = add(x, y);
		total2 = add(i, j, k);
		System.out.printf("%d%n",total1);
		System.out.printf("%f%n",total2);
	}
	static int add(int a, int b) {
		return a + b; // 傳回兩個整數相加的結果
	}
	static double add(double a, double b, double c) {
		return a + b + c; // 傳回三個倍精確度相加的結果
	}
}
```
```
D:\E040>java AddNum.java
45
41.600000
```
```
# 程式設計題 四星彩開獎系統
```
程式執行時會顯示0~9重複亂數號碼。
本期四星彩開獎號碼如下：
9  7  1  8  
```
public class EX_4StarKiJiang {

	// getRnd靜態方法可用來取得n~m之間的num個亂數，並傳給所設定的陣列
	static void getRnd(int[] vArray, int min, int max, int num) {
		int max_dim, rem_num, choice;
		max_dim = max - min + 1;
		int[] t = new int[max_dim];
		for (int i = 0; i <= max_dim - 1; i++) {
			t[i] = min + i;
		}
		rem_num = max_dim;
		for (int i = 0; i <= num - 1; i++) {
			choice = (int) (Math.random() * rem_num);
			vArray[i] = t[choice];
			for (int j = choice; j < rem_num - 1; j++) {
				t[j] = t[j + 1];
			}
			rem_num--;
		}
	}

	public static void main(String[] args) {
		int[] lot = new int[4];
    
		getRnd(lot, 1, 9, 4);	//呼叫靜態方法getRnd
		
    System.out.println("本期四星彩開獎號碼如下：");
    
		for (int i = 0; i < lot.length; i++)
			System.out.print("  " + lot[i]);
	}
}
```
```
D:\E040>java EX_4StarKiJiang.java
本期四星彩開獎號碼如下：
  1  5  4  8
```
```
使用產生1-100的亂數
   int i;
   i = (int) (Math.random() * 100) +1;
```
# n!:遞迴方法 vs iterative
## iterative
```
public class Method1 {
	public static void main(String[] args) {
		factorial(6);
		factorial(9);
	}

	static void factorial(int x) {
		int i = x, j = 1;
		while(i > 0)
			j *= i--;
		System.out.println(x + "! = " + j);
	}
}
```
```
D:\1>java Method1.java
6! = 720
9! = 362880
```
## 遞迴方法
```
終止式　==> 0!=1  1!=1
遞迴式  ==> f(n) = n*(n-1)*(n-2)*....*2*1
                 = n*f(n-1);

static void factorial(int x) {
	if (x == 1)
           return 1;
	else		
	  return (x*factorial(x-1));
	}
```

# 費氏數列:遞迴方法 vs iterative  ==> 再算　時間複雜度
```
費氏數列值第1及第2 項皆為1，
第3項之後的公式為f(n)= f(n-1) + f(n-2)。

1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233

使用者輸入一個正整數X，計算出費氏數列的第X項並輸出。

計算費氏數列的第X項，請輸入X= 12  
==>  費氏數列的第12項= 144

(1)請使用靜態遞迴方法算出費氏數列。
(2)請使用 iterative方法算出費氏數列。
```
```
public class MainClass {
    public static void main(String[] args) {
        for (int counter = 0; counter <= 10; counter++){
            System.out.printf("Fibonacci of %d is: %d\n", counter, fibonacci(counter));
        }
    }
 
    public static long fibonacci(long number) {
        if ((number == 0) || (number == 1))
            return number;
        else
            return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
```
```
D:\E040>java MainClass.java
Fibonacci of 0 is: 0
Fibonacci of 1 is: 1
Fibonacci of 2 is: 1
Fibonacci of 3 is: 2
Fibonacci of 4 is: 3
Fibonacci of 5 is: 5
Fibonacci of 6 is: 8
Fibonacci of 7 is: 13
Fibonacci of 8 is: 21
Fibonacci of 9 is: 34
Fibonacci of 10 is: 55
```
```
import java.util.*;

public class Fibonacci {
    private List<Integer> fib = new ArrayList<>();
    {
        fib.add(0);
        fib.add(1);
    }
    
    Integer get(int n) {
        if(n >= fib.size()) for(int i = fib.size(); i <= n; i++) {
            fib.add(fib.get(i - 1) + fib.get(i - 2));
        }
        return fib.get(n);
    }
    
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        for(int i = 0; i < 20; i++) {
            System.out.print(fibonacci.get(i) + " ");
        }
    }
}
```
```
D:\E040>java Fibonacci.java
0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181
```
