public class BinaryExponentation {
	public static void main(String[] args){
		System.out.println(powerAlg(2,12));
	}
	public static long powerAlg(long a, long b){
		if (b == 0){
			return 1;
		}
		long res = power(a,b/2);
		if (b % 2 == 1){
			return res * res * a;
		}
		else{
			return res * res;
		}
	}
}
