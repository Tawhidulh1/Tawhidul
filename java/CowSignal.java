import java.io.*;
import java.util.StringTokenizer;
public class CowSignal {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("cowsignal.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cowsignal.out")));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		String[] lines= new String[M];
		for (int i=0; i<M; i++){
			lines[i] = in.readLine();
		}
		String[] ret= new String[M];
		for (int i = 0; i < lines.length; i++){
			ret[i] = "";
			String str = lines[i];
			for (int j = 0; j < str.length(); j++){
				String s = str.substring(j,j+1);
				for (int m = 0; m < K; m++){
					ret[i]+=s;
				}
			}
		}
		for (int i = 0; i < ret.length; i++){
			String line = ret[i];
			for (int j = 0; j < K; j++){
				out.println(line);
			}
		}
		out.close();
		in.close();
	}
}
