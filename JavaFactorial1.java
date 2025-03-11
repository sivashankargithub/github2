public class JavaFactorial1 {
	public static int findFactorial(int num1){
		int fact1 =1;
		for(int i=1;i<num1+1;i++) {
			fact1=fact1*i;
		}
		return fact1;
	}

	public static void main(String[] args) {
		int num1 =5;
		int fact1 =1;
		for(int i=1;i<num1+1;i++) {
			fact1=fact1*i;
		}
		System.out.println("Factorial: "+fact1);
		int factorial1=findFactorial(3);
		System.out.println(factorial1);
	}

}
