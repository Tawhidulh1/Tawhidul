import java.util.Scanner;
import java.lang.Math;
public class LostRectangle {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		long A = in.nextLong();
		long p = Long.MAX_VALUE;
		for (long i = 1; i < Math.sqrt(A); i++){
			if (A % i == 0 && A / i * 2 + i*2 < p){
				p=i*2+A/i*2;
			}	
		}
		System.out.println(p);
	}
}
