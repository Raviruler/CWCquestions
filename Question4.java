import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int days [] = {31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.println("Enter the Date in following manner\nYYYY-MM-DD");
		String s=scan.nextLine();
		int y=Integer.parseInt(s.substring(0,4));
		int m=Integer.parseInt(s.substring(5,7));
		int d=Integer.parseInt(s.substring(8));
		
		//checking leap year
		int Day=d;
		if (m > 2 && y % 4 == 0 &&  
		           (y % 100 != 0 || y % 400 == 0)) {
			Day+=1;
		}
		for(int i=m-2;i>=0;i--) {
			Day+=days[i];
		}
		System.out.println("No of Days : "+Day);
	}

}
