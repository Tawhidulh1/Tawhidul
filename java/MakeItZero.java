import java.util.Scanner;
public class MakeItZero {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt(); while(t-- > 0) {
			int n = in.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {a[i] = in.nextInt();}
			if (n%2==1){
				System.out.println(4);
				System.out.println(1+" "+(n-1));
				System.out.println(1+" "+(n-1));
				System.out.println(n-1+" "+n);
				System.out.println(n-1+" "+n);
			}	
			else{
				System.out.println(2);
				System.out.println(1+" "+n);
				System.out.println(1+" "+n);
			}
		}
	}	
}
