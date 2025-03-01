import java.util.Scanner;
public class WalkingMaster {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			int d = in.nextInt();
			int ds = Math.abs(b-d);
			if (a == c && b == d) {
				System.out.println(0);
				continue;
			}
			if (b > d || a+ds < c) {
				System.out.println(-1);
				continue;
			}
			ds+=Math.abs(a+ds-c);
			System.out.println(ds);
		}
	} 
}
