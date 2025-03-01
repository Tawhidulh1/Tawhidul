import java.util.Scanner;
import java.util.ArrayList;
public class JellyfishAndUndertale {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt(); while (t-- > 0) {
			int a = in.nextInt(); int b = in.nextInt(); int n = in.nextInt();
			ArrayList<Integer> ar = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				ar.add(Math.min(a,in.nextInt()));
			}
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum+=Math.min(a-1,ar.remove(0));
			}
			System.out.println(sum+b);
		}
	}
}
