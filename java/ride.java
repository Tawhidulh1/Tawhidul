/* 
ID: tawhidu1
LANG: JAVA
TASK: ride
*/
import java.io.*;
import java.util.*;

public class ride {
	public static void main(String[] args ) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader("ride.in"));		
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
		String A = in.readLine();	
		String B = in.readLine();	
		int a = -1;
		int b = -1;
		for (int i= 0; i < A.length(); i++) {
			int n = A.substring(i,i+1).charAt(0)-'A'+1;
			if (a == -1){
				a=1;
				a*=n;
			}	
			else {
				a*=n;
			}
		}
		for (int i= 0; i < B.length(); i++) {
			int n = B.substring(i,i+1).charAt(0)-'A'+1;
			if (b == -1){
				b=1;
				b*=n;
			}	
			else {
				b*=n;
			}
		}
		if (a % 47 == b % 47){
			out.println("GO");
		}
		else {
			out.println("STAY");
		}
		out.close();
	}
}
