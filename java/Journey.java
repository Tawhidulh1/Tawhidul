import java.util.Scanner;
public class Journey {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int tc = 0; tc < t; tc++){
			int n = in.nextInt();
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			int d = n / (a+b+c) * 3;
			if (n % (a+b+c) == 0){
				System.out.println(d);
			}
			else if (n % (a+b+c) <= a){
				System.out.println(d+1);
			}
			else if (n%(a+b+c) <= a+b){
				System.out.println(d+2);
			}
			else {
				System.out.println(d+3);
			}
		}
	}
}
