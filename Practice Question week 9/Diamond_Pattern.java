import java.util.Scanner; 
class Diamond_Pattern { 
	void display(int n) 
	{ 
		
		int sp = n / 2, st = 1; 

		for (int i = 1; i <= n; i++) { 

			for (int j = 1; j <= sp; j++) 
				System.out.print(" "); 

			int count = st / 2 + 1; 
			for (int k = 1; k <= st; k++) { 
				System.out.print(count); 
				if (k <= st / 2) 
					count--; 
				else
					count++; 
			} 

			System.out.println(); 
			if (i <= n / 2) { 

				sp = sp - 1; 
				st = st + 2; 
			} 

			else { 

				sp = sp + 1; 
				st = st - 2; 
			} 
		} 
	} 

	public static void main(String[] args) 
	{ 
		Scanner scan=new Scanner(System.in);
		Q p = new Q();
		System.out.println("Enter the value of N");
		int n = scan.nextInt(); 
		p.display(n); 
	} 
} 
