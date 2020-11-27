import java.util.Scanner;
public class AirPurifire {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the temprature of room in deg C :");
		int temp=scan.nextInt();
		System.out.println("Enter the times door opened :");
		int open=scan.nextInt();
		System.out.println("Operating time of purifire in min :");
		int min=scan.nextInt();
		Purify(temp,open,min);
	}
	
	public static void Purify(int temp,int open,int min) {
		int sum=0;
		if(temp==25) {
			for(int i=1;i<=min-open;i++) {
				sum+=40;
			}
			if(open>0) {
				for(int i=1;i<=open;i++) {
					sum+=30;
				}
			}
		}
		else if(temp>25) {
			temp=temp-25;
			for(int i=1;i<=min-open;i++) {
				sum+=40+(temp*2);
			}
			if(open>0) {
				for(int i=1;i<=open;i++) {
					sum+=30+(temp*2);
				}
			}
			
		}
		else if(temp<25) {
			temp=25-temp;
			for(int i=1;i<=min-open;i++) {
				sum+=40-(temp*2);
			}
			if(open>0) {
				for(int i=1;i<=open;i++) {
					sum+=30-(temp*2);
				}
			}
			
		}
		System.out.print("Purifier purifies "+sum+" sq/min with the given conditions.");
	}

}
