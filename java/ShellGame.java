import java.io.*;
import java.util.StringTokenizer;
public class ShellGame{
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("shell.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("shell.out")));
		
		int N = Integer.parseInt(in.readLine());
		int[] shells = new int[]{0,1,2,3};
		int[] result = new int[]{0,0,0,0};
		for (int i = 0; i < N; i++){
			StringTokenizer st = new StringTokenizer(in.readLine());
			int a  = Integer.parseInt(st.nextToken()); 
			int b  = Integer.parseInt(st.nextToken()); 
			int g  = Integer.parseInt(st.nextToken()); 
			int temp = shells[a];
			shells[a] = shells[b];
			shells[b] = temp;
			result[shells[g]]++;
		}
		int max = 0;
		if (max < result[1]){
			max = result[1];
		}	
		if (max < result[2]){
			max = result[2];
		}
		if (max < result[3]){
			max = result[3];
		}
		out.println(max);
	
		out.close();
		in.close();

	}
}
