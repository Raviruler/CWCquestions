public class PrintSeries {

	public static void main(String[] args) {
		int counter=1,c=2,j=1;
        for(int i=1;i<121;i=i*counter) {
        	System.out.print(i+"/"+j+" , ");
        	j=c*c;
        	c++;
        	counter++;
        }
	}

}
