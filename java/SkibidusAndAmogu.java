import java.io.*;
public class SkibidusAndAmogu {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());
		for (int tc = 0; tc < t; tc++){
			String w = in.readLine();
			if (w.length()>=2){
				if (w.substring(w.length()-2).equals("us")){
					w = w.substring(0,w.length()-2)+"i";
				}
				else if (w.substring(w.length()-1).equals("i")){
					w = w.substring(0,w.length()-1)+"us";
				}
			}
			else if (w.length() == 1 && w.substring(0,1).equals("i")){
				w = "us";	
			}
			System.out.println(w);
		}
	}
}
