import java.io.*;
public class test2 {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new FileReader("test2.in"));
		String line = "";
		while ((line = r.readLine())!=null){
			System.out.println(line);
		}
	}
}
