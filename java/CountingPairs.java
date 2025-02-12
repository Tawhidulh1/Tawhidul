import java.util.Scanner;
public class CountingPairs {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		long t = in.nextLong();
		for (int ts = 0; ts < t; ts++){	
			long n = in.nextLong(); long x = in.nextLong(); long y = in.nextLong();
			long[] ar = new long[(int)(n)];	
			for (int i = 0; i < n; i++){
				ar[i] = in.nextLong();
			}
			long sum = 0;
			long ctr = 0;
			for (int i = 0; i < ar.length; i++){
				sum+=ar[i];	
			}
			for (int i = 0; i < ar.length; i++){
				for (int j = i+1; j < ar.length; j++){
					long c = sum - (ar[i]+ar[j]);	
					if (c >= x && c <= y){
						ctr++;
					}
				}
			}
			System.out.println(ctr);	
		}
		in.close();
	}
}
