import java.util.Scanner;
import java.util.ArrayList;
public class SuperultrasFavoritePermutation {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int tc = 0; tc < t; tc++){
			int N = in.nextInt();
			if (N <= 4){
				System.out.println(-1);
				continue;
			}
			String ret = "";
			for (int i = 1; i <= N; i++){
				if (i % 2 == 0 && (i+1) % 2 == 0){
					ret+=i;
					ret+=i+1;
				}	
				else if (i+(i+1) % 2 == 0){
					ret+=i;
					ret+=i+1;
				}
			}
			System.out.println(ret);
		}
		in.close();
	}
}
