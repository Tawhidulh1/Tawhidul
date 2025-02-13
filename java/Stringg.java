import java.io.*;
public class Stringg {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());
		for (int tc = 0; tc < t; tc++){
			String str = in.readLine();
			int ctr = 0;
			for (int i = 0; i < str.length(); i++){
				if (str.substring(i,i+1).equals("1")){
					ctr++;
				}
			}
			System.out.println(ctr);
		}
	}
}
