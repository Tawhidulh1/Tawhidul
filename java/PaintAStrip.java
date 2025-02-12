import java.util.Scanner;
public class PaintAStrip {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int tc = 0; tc < t; tc++){
			int n = in.nextInt();
			int ctr = 1;
			int a = 1;
			while(!(a >= n)){
				ctr++;
				a=a*2+2;
			}
			System.out.println(ctr);
		}
		in.close();
	}
}
