public class b0318{
	public static void main(String[] args) {
	int sum1, sum2; 
	sum1 = sum2 = 0;
	for (int i =1; i<= 100; i++){
		if(i % 2 == 0){
          		sum1 +=i;
	 		System.out.printf("偶數'%d'",i);
		}else{
	  		sum2 +=i;
			System.out.printf("奇數'%d'",i);
		}
	 }
 
	
   	 System.out.printf("%n 2+4+...+n 答案是: " +sum1);
	 System.out.printf("%n 1+3+...+n 答案是: " +sum2);
	}
}