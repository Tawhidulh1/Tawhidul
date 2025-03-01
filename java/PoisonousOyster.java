import java.io.*;
import java.util.StringTokenizer;
public class PoisonousOyster {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));	
		StringTokenizer st = new StringTokenizer(in.readLine());	
		String s1 = st.nextToken();
		String s2 = st.nextToken();
		if (s1.equals("sick")&&s2.equals("sick")){
			System.out.println(1);
		}
		else if (s1.equals("sick")){
			System.out.println(2);
		}
		else if (s2.equals("sick")){
			System.out.println(3);
		}
		else {
			System.out.println(4);
		}
	}
}
