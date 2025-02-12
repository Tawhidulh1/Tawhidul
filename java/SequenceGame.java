import java.util.Scanner;
import java.lang.StringBuilder;
public class SequenceGame {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int tc = 0; tc < t; tc++){
			int n = in.nextInt();
			int ctr = n;
			int x = in.nextInt();
			StringBuilder ret = new StringBuilder();
			ret.append(x);
			for (int i = 1; i < n; i++){
				int cur = in.nextInt();	
				if (x>cur){
					ret.append(" "+1);
					ctr++;
				}
				ret.append(" "+cur);
				x = cur;
			}
			System.out.println(ctr);
			System.out.println(ret);
			
		}
	}
}
