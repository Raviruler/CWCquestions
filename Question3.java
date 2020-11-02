import java.util.*;
public class Question3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=scan.nextInt();
		System.out.print(n+"->");
		
		while(n!=1) {
			if(n%2==0) {
				n=n/2;
				System.out.print(n+"->");
			}
			else {
				n=(3*n+1);
				System.out.print(n+"->");
			}
		}

		
	}

}
