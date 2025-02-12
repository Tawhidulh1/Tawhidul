import java.util.Scanner;
import java.lang.StringBuilder;
public class SkibidusAndRizz {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int tc = 0; tc < t; tc++){
			StringBuilder ret = new StringBuilder();
			int n = in.nextInt();
			int m = in.nextInt();
			int k = in.nextInt();
			int max = -1;
			int x = 0;
			for (int i = 0; i < n+m; i++){
				for (int j = i; j<n+m; j++){
					int val = Math.abs(j-x);
					max = Math.max(max,val);
					x = val;
					ret.append(val);
				}
			}
			System.out.println(ret);

		}
	}
}
