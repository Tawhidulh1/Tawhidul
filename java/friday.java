import java.io.*;
public class friday {
	public static void main(String[] args)throws IOException{
		BufferedReader in = new BufferedReader(new FileReader("friday.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));
		int N = Integer.parseInt(in.readLine());
		
		int m = 1;
		int d = 1;
		int y = 1900;
		int days = 31;
		while(y != 1900+N-1 && m != 12 && d != 31){
			if (d == days && (m==12||m==2||m==4||m==6||m==7||m==9||m==11)){
				d = 1;
				days = 31;
			}
			else if (d==days&&(m==8||m==3||m==5||m==10)){
				d = 1;
				days = 30;
			}
			else if (d==days && m==1 && y % 4 == 0){
				d = 1;
				days = 29;
			}
			else {
				d = 1;
				days = 28;
			}
		}	
		out.close();
	}
}
