import java.io.*;
public class Watermelon {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int w = Integer.parseInt(r.readLine());
		if (w > 2 && w % 2 == 0){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}
