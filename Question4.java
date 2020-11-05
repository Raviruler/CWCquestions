import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		/*Scanner scan=new Scanner(System.in);
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
		System.out.println("No of Days : "+Day);*/




		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Date in given Format\n01_st_january_2020\nNote:_ mean space");
		String s=scan.nextLine();
		int a=Integer.parseInt(s.substring(0,2));
	        String m= s.substring(6,9);
	        m=m.toUpperCase();
	        int y=Integer.parseInt(s.substring(s.length()-4));
	        int feb,days=a;
	      
	        if ((y% 4 == 0 && y % 100 != 0 ) || (y % 400 == 0)){
	            feb=29;
	        }
	        else{
	            feb=28;
	        }
	        switch(m){
	        case "FEB":
	        	days += 31;
	            break;
	        case "MAR":
	        	days += 31+feb;
	            break;
	        case "APR":
	        	days += 31+feb+31;
	            break;
	        case "MAY":
	        	days += 31+feb+31+30;
	            break;
	        case "JUN":
	        	days += 31+feb+31+30+31;
	            break;
	        case "JUL":
	        	days += 31+feb+31+30+31+30;
	            break;            
	        case "AUG":
	        	days += 31+feb+31+30+31+30+31;
	            break;
	        case "SEP":
	        	days += 31+feb+31+30+31+30+31+31;
	            break;
	        case "OCT":
	        	days += 31+feb+31+30+31+30+31+31+30;            
	            break;            
	        case "NOV":
	        	days += 31+feb+31+30+31+30+31+31+30+31;            
	            break;                        
	        case "DEC":
	        	days += 31+feb+31+30+31+30+31+31+30+31+30;            
	            break; 
	        default:System.out.println("Enter a Valid Date");
	        }
	        System.out.println("No Of Days: "+days);
	    }
	}
