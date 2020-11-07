//A man walks in 4 directions respectively .
//He can walk in north,south,east and west directions only.
//Your program should take those directions as input and finally return the user’s set w.r.t. its initial position.
//If after travelling along all 4 directions he reaches to initial position then the program should print “Travelling wasted”.

import java.util.Scanner;
public class Additional_Question {
	
	public static void direction(String st){
		int n=0,s=0,e=0,w=0,vp,hp;
		for(int i=0;i<st.length();i++) {
			if(st.charAt(i)=='N')
				n++;
			else if(st.charAt(i)=='S')
				s++;
			else if(st.charAt(i)=='E')
				e++;
			else if(st.charAt(i)=='W')
				w++;
		}
		hp=(e-w);
		vp=(n-s);
		if(vp==0&&hp==0) {
			System.out.println("Travlling Wasted");
		}
			else
		System.out.print(Math.abs(hp)+Math.abs(vp)+" Steps");
		
			
	}
	
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		String s="",st="";
		System.out.println("Enter North,South,East and West\nEnter the position the man move first : ");
		s=scan.nextLine();
		st+=s.substring(0, 1);
		System.out.println("Enter the position the man move Second : ");
		s=scan.nextLine();
		st+=s.substring(0, 1);
		System.out.println("Enter the position the man move Third : ");
		s=scan.nextLine();
		st+=s.substring(0, 1);
		System.out.println("Enter the position the man move Fourth : ");
		s=scan.nextLine();
		st+=s.substring(0, 1);
		st=st.toUpperCase();
		direction(st);
	}
}
