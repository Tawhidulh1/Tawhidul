import java.util.Scanner;
public class LongestDivisorInteral {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
		int t = in.nextInt(); while (t-- > 0) {
			long n = in.nextLong();
			int ctr = 0;
			int max = 0;
			for (int i = 1; i <= 50; i++) {
				if (i!=0&&n % i == 0) {
					ctr++;
				}
				else if (i!=0 && n % i != 0){
					ctr = 0;
				}
				max = Math.max(ctr,max);
			}
			System.out.println(max);
		}
	}
}
