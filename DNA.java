import java.util.*;
public class DNA{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Give Input");
        String s=scan.nextLine();
        int n=s.length();
        String a="";
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='G') {
            	a+="C";
            }
            if(s.charAt(i)=='C') {
            	a+="G";
            }
            if(s.charAt(i)=='T') {
            	a+="A";
            }
            if(s.charAt(i)=='A') {
            	a+="U";
            }
	    else {
            	System.out.println("Wrong Input");
            	break;
            }
    }
        System.out.print(a);
    }
}