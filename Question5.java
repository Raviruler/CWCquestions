public class Question5 {
	
	public static long rev(long num) {
		long rev=0;
		long a;
		while(num>0) {
			a=num%10;
			rev=(rev*10)+a;
			num/=10;
		}
		return rev;
	}
	
	public static boolean isPallindrome(long num) {
		return rev(num)==num;
	}
	
	public static long LargPalli(long a,long b) {
		long result=0;
		long larg=0;
		for(long x=a;x>99;x--) {
			for(long y=b;y>99;y--) {
				result=y*x;
				if(isPallindrome(result))
					larg=Math.max(larg, result);
			}
		}
		return larg;
	}
	
	
	public static void main(String[] args) {
		System.out.println(LargPalli(999,999));
		
	}
}