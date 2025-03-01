import java.util.Scanner;
import java.util.HashSet;
public class SubtractOperation {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int tc = 0; tc < t; tc++){
			int n = in.nextInt();
			int k = in.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++){a[i]=in.nextInt();}
			boolean works = false;
			HashSet<Integer> set = new HashSet<Integer>();
			for (int i = 0; i < n; i++){
				if (set.contains(a[i] - k) || set.contains(a[i] +k)){
					works = true;
					break;
				}
				set.add(a[i]);
			}
			if (works){
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}
