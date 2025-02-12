import java.util.Scanner;
public class MinimalCoprime {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int tc = 0; tc < t; tc++){
			int l = in.nextInt();
			int r = in.nextInt();
			if (l == r && l == 1){
				System.out.println(1);
			}
			else {
				System.out.println(r-l);
			}

		}
	}
}
