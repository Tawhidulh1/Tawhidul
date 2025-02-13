import java.util.Scanner;
public class ProveHimWrong {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int tc = 0; tc < t; tc++){
			long n = in.nextLong();
			if (n > 19){
				System.out.println("NO");
				continue;
			}
			System.out.println("YES");
			int ret = 1;
			for (int i = 0; i < n; i++){
				System.out.print(ret+" ");	
				ret*=3;
			}
			System.out.println();
		}
	}
}
