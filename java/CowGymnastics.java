import java.io.*;
import java.util.StringTokenizer;
public class CowGymnastics {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("gymnastics.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gymnastics.out")));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int K =Integer.parseInt(st.nextToken());
		int N =Integer.parseInt(st.nextToken());
		if (K == 1){
			return;
		}
		int[][] ar = new int[K][N];
		int[] a = new int[N];	
		int ind = 0;
		while(in.ready()){
			st = new StringTokenizer(in.readLine());
			for (int i = 0; i < N; i++){
				ar[ind][i] = Integer.parseInt(st.nextToken());
			}
			ind++;
		}
		
		
	}
}
