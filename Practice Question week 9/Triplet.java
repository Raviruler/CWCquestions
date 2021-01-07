import java.util.Scanner;
public class Triplet {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the size of the Array");
		int n=scan.nextInt();
		System.out.print("Enter the Array");
		int array[]=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=scan.nextInt();
		}
		System.out.print("Enter the sum");
		int sum=scan.nextInt();
		sumfind(array,sum);

	}
	static void sumfind(int array[],int sum) {
		for (int i = 0; i < array.length - 2; i++) { 
			       
            for (int j = i + 1; j < array.length - 1; j++) { 
  
                for (int k = j + 1; k < array.length; k++) { 
                    if (array[i] + array[j] + array[k] == sum) { 
                        System.out.print("Triplet is " + array[i] + ", " + array[j] + ", " + array[k]+  " "); 
                         break;
                    } 
                    
                } 
            } 
        } 
	}
}
