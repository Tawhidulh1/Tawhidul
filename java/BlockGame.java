import java.io.*;
import java.util.StringTokenizer;
public class BlockGame{
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("blocks.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("blocks.out")));
		int N = Integer.parseInt(in.readLine());
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		int[] ctr = new int[26];		
		String str = "";
		while(in.ready()){
			StringTokenizer st = new StringTokenizer(in.readLine());
			str+=st.nextToken();
			str+=st.nextToken();
		}
		for (int i = 0; i < ctr.length; i++){
			ctr[i] = 0;
		}
		for (int i = 0; i < str.length(); i++){
			String s = str.substring(i,i+1);
			int ind = alphabet.indexOf(s);
			ctr[ind]++;
		}
		for (int i = 0; i < ctr.length; i++){
			out.println(ctr[i]);
		}
		in.close();
		out.close();
	}
}
