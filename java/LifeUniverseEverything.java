import java.io.*;
public class LifeUniverseEverything {
	public static void main(String[] args){
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String ret = "";
		while(((int n = in.readLine())!= null) && n != 42){
			ret+=n+"\n"
		}
		System.out.println(ret);
	}
}
