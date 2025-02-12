import java.util.Scanner;
public class AmbitiousKid {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		int ret = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++){
			ar[i] = in.nextInt();
			if (ret > Math.abs(ar[i])){
				ret = Math.abs(ar[i]);
			}
		}
		System.out.println(ret);
	}
}
