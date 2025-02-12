import java.util.Scanner;
public class MexTable {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int tc = 0; tc < t; tc++){
			int n = in.nextInt();
			int m = in.nextInt();
			System.out.println(Math.max(m,n)+1);
		}
	}
}
