import java.util.Scanner;
public class SkibidusAndOhio {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int tc = 0; tc < t; tc++){
			String str = in.next();
			int ret = str.length();
			for (int i = 0; i < str.length()-1; i++){
				if (str.substring(i,i+1).equals(str.substring(i+1,i+2))){
					ret = 1;
				}
			}
			System.out.println(ret);
		}
	}
}
