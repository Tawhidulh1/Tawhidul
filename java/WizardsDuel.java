import java.util.Scanner;
public class WizardsDuel {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double l = in.nextDouble();	
		double p = in.nextDouble();	
		double q = in.nextDouble();	
		System.out.println(l*(p/(p+q)));

	}
}
