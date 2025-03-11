package pkg1;

public class JavaFactorial1 {
	public static void main(String[] args) {
		int num1 =5;
		int fact1 =1;
		for(int i=1;i<num1+1;i++) {
			fact1=fact1*i;
		}
		System.out.println("Factorial: "+fact1);
	}

}
