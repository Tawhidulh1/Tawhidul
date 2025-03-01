import java.util.Scanner;
public class NewWorldNewMeNewArray {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);	
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int k = in.nextInt();
			int p = in.nextInt();
			if (p*n<Math.abs(k)) {
				System.out.println(-1);
				continue;
			}
			double ret = Math.abs(k)*1.0/p;
			if ((int)(ret) * p < Math.abs(k)) {
				System.out.println((int)(ret) + 1);
			}
			else {
				System.out.println((int)(ret));
			}
		}
	}
}
