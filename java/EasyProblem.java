import java.io.*;
public class EasyProblem {
	public static void main(String[] args)throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());
		int[] a = new int[t];
		for (int i = 0; i < t; i++){
			int n = Integer.parseInt(in.readLine());
			if (n <= 0){
				System.out.println(0);
				return;
			}
			a[i] = n-1;
		}
		for (int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}
}
