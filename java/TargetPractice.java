import java.util.Scanner;
public class TargetPractice {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);	
		int[] nums = {1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,1,1,2,3,3,3,3,3,3,2,1,1,2,3,4,4,4,4,3,2,1,1,2,3,4,5,5,4,3,2,1,1,2,3,4,5,5,4,3,2,1,1,2,3,4,4,4,4,3,2,1,1,2,3,3,3,3,3,3,2,1,1,2,2,2,2,2,2,2,2,1,1,1,1,1,1,1,1,1,1,1};
		int t = in.nextInt();
		in.nextLine();
		for (int tc = 0;tc < t;tc++){
			int s = 0;
			for (int i = 0; i < 10;i++){
				String str = in.nextLine();
				for (int j = 0; j < 10; j++){
					if (str.substring(j,j+1).equals("X")){
						s+=nums[i*10+j];
					}
				}
			}
			System.out.println(s);
		}
	}
}
