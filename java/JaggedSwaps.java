import java.util.Scanner;
public class JaggedSwaps {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int tc=0; tc<t; tc++){
			int n = in.nextInt();
			boolean worked = false;
			for (int i = 0; i < n; i++){
				int x = in.nextInt();
				if (i == 0 && x == 1){
					worked = true;
				}
			}
			if (worked){
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			
		}
	}
}

