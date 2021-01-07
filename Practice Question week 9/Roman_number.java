import java.util.*;
public class Roman_number {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number between 0 to 1000");
		int num=scan.nextInt();
		String m[] = {"", "M"};
        String c[] = {"", "C", "CC", "CCC", "CD", "D", 
                            "DC", "DCC", "DCCC", "CM"};
        String x[] = {"", "X", "XX", "XXX", "XL", "L", 
                            "LX", "LXX", "LXXX", "XC"};
        String i[] = {"", "I", "II", "III", "IV", "V", 
                            "VI", "VII", "VIII", "IX"};
             
        String thousands = m[num/1000];
        String hundereds = c[(num%1000)/100];
        String tens = x[(num%100)/10];
        String ones = i[num%10];
             
        String ans = thousands + hundereds + tens + ones;
        System.out.println("Roman Number : "+ans);   
        
	}

}
