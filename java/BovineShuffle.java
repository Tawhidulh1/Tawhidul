import java.io.*;
import java.util.StringTokenizer;
public class BovineShuffle {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader("shuffle.in")); 
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("shuffle.out")));
		int N = Integer.parseInt(in.readLine());
		int[][] ar = new int[2][N];
		while(in.ready()){
			StringTokenizer st = new StringTokenizer(in.readLine());
			for (int i = 0; i < N; i++){
				ar[0][i] = Integer.parseInt(st.nextToken()); 
			}
			st = new StringTokenizer(in.readLine());
			for (int i = 0; i < N; i++){
				ar[1][i] = Integer.parseInt(st.nextToken());
			}	
		}
		int[] ret = new int[N];	
		for (int j = 0; j < 3; j++){
			int[] upd = new int[N];
			for (int i = 0; i < N; i++){
				upd[ar[0][i]] = ret[i];
			}
			ret = upd;
		}
		for (int each : ret){
			out.println(each);
		}
		out.close();
		in.close();
	}
}
