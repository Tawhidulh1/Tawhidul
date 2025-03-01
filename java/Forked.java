import java.util.Scanner;
import java.util.HashSet;
public class Forked {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
		int t = in.nextInt();
		while (t-- > 0) {
			int a = in.nextInt();
			int b = in.nextInt();
			int x1 = in.nextInt();
			int y1 = in.nextInt();
			int x2 = in.nextInt();
			int y2 = in.nextInt();
			HashSet<String> set1 = new HashSet<>();
            HashSet<String> set2 = new HashSet<>();

            int[] dx = {-1, 1, -1, 1};
            int[] dy = {-1, -1, 1, 1};
            for (int i = 0; i < 4; i++) {
                set1.add((x1 + dx[i] * a) + "," + (y1 + dy[i] * b));
                set1.add((x1 + dx[i] * b) + "," + (y1 + dy[i] * a));
                set2.add((x2 + dx[i] * a) + "," + (y2 + dy[i] * b));
                set2.add((x2 + dx[i] * b) + "," + (y2 + dy[i] * a));
            }
			int ret = 0;
			for (String str : set1) {
				if (set2.contains(str)) {
					ret++;
				}
			}
			System.out.println(ret);
		}
	}
}
