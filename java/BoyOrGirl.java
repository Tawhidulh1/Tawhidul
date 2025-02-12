import java.util.Scanner;
public class BoyOrGirl {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int ctr = 0;
		boolean isDupe = false;
		for (int i = 0; i < str.length(); i++){
			for (int j = i; j < str.length(); j++){
				if (j != i && str.substring(i,i+1).equals(str.substring(j,j+1))){
					isDupe = true;
					continue;
				}
			}
			if (!isDupe){
				ctr++;
			}
			isDupe = false;
		}
		if (ctr % 2 == 0){
			System.out.println("CHAT WITH HER!");
		}
		else {
			System.out.println("IGNORE HIM!");
		}
	}
}
