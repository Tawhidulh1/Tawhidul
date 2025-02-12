import java.util.Scanner;
public class PolycarpAndCoins {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int tc = 0; tc < t; tc++){
			int n = in.nextInt();
			int a = n / 3;
			int b = a;
			if (n % 3 != 0){
				if (n / 3 == (int)(n/3+0.5)){
					a = (n/3)+1;
					b = n /3;
				}
				else{
					a = n/3;
					b = (n/3)+1;
				}
			}
			System.out.println(a+" "+b);
		}
	}
}
