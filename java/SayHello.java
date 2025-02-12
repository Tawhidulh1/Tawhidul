import java.io.*;
public class SayHell {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Hello, "+in.readLine());
	}
}
