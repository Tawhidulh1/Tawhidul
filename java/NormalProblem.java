import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
public class NormalProblem {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());
		for (int tc = 0; tc < t; tc++){
			ArrayList<String> ret = new ArrayList<String>();
			String str = in.readLine();
			for (int i = 0; i < str.length(); i++){
				if (str.substring(i,i+1).equals("q")){
					ret.add(0,"p");
				}
				if (str.substring(i,i+1).equals("p")){
					ret.add(0,"q");
				}
				if (str.substring(i,i+1).equals("w")){
					ret.add(0,"w");
				}
			}
			for (int i = 0; i < ret.size(); i++){
				System.out.print(ret.get(i));
			}
			System.out.println();
		}
	}
}
