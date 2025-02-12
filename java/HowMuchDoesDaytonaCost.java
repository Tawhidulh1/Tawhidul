import java.util.Scanner;
public class HowMuchDoesDaytonaCost {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int tc = 0; tc < t; tc++){
			int n = in.nextInt();
			int k = in.nextInt();
			int[] a = new int[n];
			boolean kexists = false;
			for (int i = 0; i < n; i++){
				a[i] = in.nextInt();
				if (a[i] == k){
					kexists = true;
				}
			}
			if (kexists){
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}
