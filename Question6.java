
public class Question6 {
	public static boolean isprime(long num) {
		int a=0;
		long sqrt=(long)Math.sqrt(num);
		
		for(long i=1;i<=sqrt;i++) {
			if(num%i==0) {
				a++;
			}
		if(a>1)
			return false;
		}
		return true;
	}
	
	public static long prime(long limit){
		long b=1;
		long result=0;
		
		for(long j=2;b<=limit;j++) {
			if(isprime(j)) {
				result=j;
				b++;
			}
		}
		return result;
	}

	
	public static void main(String[] args) {
		System.out.println("10001st prime number is: "+prime(10001));
	}

}
