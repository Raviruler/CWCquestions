import java.util.Scanner;
public class SwitchVolume {
	
	public static void novolume(String s) {
		int n=s.length();
		String g="";
		for(int i=0;i<n;i++) {
			char ch=s.charAt(i);
			switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				break;
			default:
				g+=ch;
			
			}
		}
		System.out.print(g);
	}
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter a String  :");
		String s=scan.nextLine();
		System.out.println();
		novolume(s);
	}

}
