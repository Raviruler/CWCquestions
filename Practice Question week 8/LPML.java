import java.util.Scanner;
import java.lang.*;
public class LPML {
	public static int lpml(int x,int y,int a,int b,int n) {
		int num=n-Math.min(n,x-a);
		x-=Math.min(n,x-a);
		y-=Math.min(num,y-b);
		return Math.abs(x-y);
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int x,y,a,b,n;
		System.out.println("Enter the value of X");
		x=scan.nextInt();
		System.out.println("Enter the value of Y");
		y=scan.nextInt();
		System.out.println("Enter the value of A");
		a=scan.nextInt();
		System.out.println("Enter the value of B");
		b=scan.nextInt();
		System.out.println("Enter the value of N");
		n=scan.nextInt();
		int aa=lpml(x,y,a,b,n);
		int bb=lpml(y,x,b,a,n);
		System.out.print("Maximum absolute diff : "+Math.max(aa,bb));
	}

}
