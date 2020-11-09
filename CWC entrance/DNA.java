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
        	char ch=s.charAt(i);
        	if(!(ch=='G'||ch=='C'||ch=='T'||ch=='A')) {
        		a="Invalid Input";
        		break;}
        	
        	else {	
            if(ch=='G') {
            	a+='C';
            }
            if(ch=='C') {
            	a+='G';
            }
            if(ch=='T') {
            	a+='A';
            }
            if(ch=='A') {
            	a+='U';
            }
            
    }
        }
        System.out.print(a);

	}

}
