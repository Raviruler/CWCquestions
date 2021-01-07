import java.util.Scanner;
public class Removes {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String str1=scan.nextLine();
		System.out.println("Enter the Second String");
		String str2=scan.nextLine();
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		remove(str1,str2);

	}
	static void remove(String str1,String str2) {

        int strLen1 = str1.length();
        int strLen2 = str2.length();

        for(int i=0; i<strLen1; i++){

            for(int j=0; j<strLen2; j++){

                if(str1.charAt(i) == (str2.charAt(j))){
                    str1 = str1.replace(str1.charAt(i), '\0');
                }
            }
        }
        System.out.println("modified string : "+str1);
		}
		
}
