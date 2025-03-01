public class AllPairs{
	public static void main(String[] args){
		int[] array = new int[]{4,6,1,6,4,4,8};
		int ctr = 0;
		for (int c = 0; c < array.length; c++){
			for (int next = c+1; next < array.length; next++){
				if (array[next] == array[c]){
					ctr++;
				}
			}
		}	
		System.out.println(ctr);
	}

}
