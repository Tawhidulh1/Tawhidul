import java.util.Scanner;
public class DigitalStringMaximization {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		String[] max = new String[t];
		for (int tc = 0; tc < t; tc++){
			in = new Scanner(System.in);
			String str = in.nextLine();		
			max[tc] = "0";
			String r1 = str;
			for (int j = 0; j < 5; j++){
				for (int i = 1; i < r1.length(); i++){
					String prev = r1.substring(i-1,i);
					r1 = doit(r1);
				}
				if (Long.parseLong(r1) > Long.parseLong(max[tc])){
					max[tc] = r1;
				}	
				
			}
		}
		for (int i = 0; i < t; i++){
			System.out.println(max[i]);
		}
	}
	static String doit(String str){
		for (int i = 1; i < str.length(); i++){
			String prev = str.substring(i-1,i);
			if (Long.parseLong(str.substring(i,i+1)) > Long.parseLong(prev)){
				str = str.substring(0,i-1)+(Long.parseLong(str.substring(i,i+1))-1)+prev+str.substring(i+1);
			}
		}	
		return str;
	}
}
