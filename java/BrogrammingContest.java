import java.io.*;
public class BrogrammingContest {
	public static void main(String[] argh) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());
		for (int tc = 0; tc < t; tc++){
			int n = Integer.parseInt(in.readLine());
			String s = in.readLine();
			String d = "";
			int spot = s.indexOf("1");
			int ctr = 0;
			if (spot != -1){
				boolean foundOne = false;
				boolean foundZero = false;
				for (int i = spot; i < s.length(); i++){
					if (s.substring(i,i+1).equals("1") && !foundOne){
						foundOne = true;
						foundZero = false;
						ctr++;
					}
					if (s.substring(i,i+1).equals("0") && !foundZero){
						foundOne = false;
						foundZero = true;
						ctr++;
					}
				}
			}
			System.out.println(ctr);
		}
	}
}
