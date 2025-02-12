public class BinarySearch{
	public static int binarySearch(int[] a, int b){
		int left = 0;
		int right = a.length-1;
		while (left < right){
			int mid = (left+right) /2;
			if (b < a[mid]){
				right = a[mid]-1;
			}
			else if (b > a[mid]){
				left = a[mid]+1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
	public static void main (String[] args){

		System.out.println(binarySearch(new int[]{1,2,3,4,5,6,7,8,9,10}, 3));
	}
}
