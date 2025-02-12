import java.util.*;

public class MagicSquare {

  public static void main(String args[]) {

    int[][] square = makeRandomSquare(3);
    boolean found = isMagicSquare(square);
    while (!found) {
      square = makeRandomSquare(3);
      found = isMagicSquare(square);
    }
    printSquare(square);
    System.out.println("The sum of each length is " + sumArray(square[0]));
  }// end of main

  /*
   * Given a 2D array of ints return true if it forms a Magic Square
   * Return false otherwise. HINT: the sum variable contains one of the
   * many sums that must be equal. If any other sum is NOT equal to sum
   * return false. if you ever make it to the bottom of the method and not
   * a single check was false,, you have a Magic Square, return true.
   */
  public static boolean isMagicSquare(int[][] square) {
	  if (square.length != square[0].length){
		  return false;
	  }
	  int s1 = sumArray(getDiagonalOne(square));
	  int s2 = sumArray(getDiagonalTwo(square));
	  if (s1 != s2){
		  return false;
	  }
	  for (int r = 0; r < square.length; r++){
		  if (sumArray(square[r]) != s1){
			  return false;
		  }
	  }
	  return true;
  }

  /*
   * Make a 2D integer array in the shape of a square with side
   * lengths equal to the parameter. Fill it with randomly placed unique
   * values from 1 to (sideLength * sideLength ).
   * HINT: Fill an ArrayList initially and take from there for uniqueness
   */
  public static int[][] makeRandomSquare(int sideLength) {
	ArrayList<Integer> ar = new ArrayList<Integer>();
	for (int i = 0; i < sideLength*sideLength; i++){
		ar.add(i+1);
	}
    int[][] ret = new int[sideLength][sideLength];
    for (int i = 0; i < sideLength; i++) {
      for (int j = 0; j < sideLength; j++) {
		  ret[i][j] = ar.remove((int)(Math.random()*ar.size()));
      }
    }
    return ret;
  }

  /* HELPER METHODS FOR CHECKING */

  /*
   * Given a 2D array and a specified column, return a 1D array
   * filled with that columns values
   */
  public static int[] getColumn(int[][] square, int col) {
    int[] ret = new int[square[0].length];
    for (int i = 0; i < square.length; i++) {
      for (int j = 0; j < square[0].length; j++) {
        ret[i] = square[i][j];
      }
    }
    return ret;
  }

  /*
   * Given a 2D array, return a 1D array filled with the values
   * of the diagonal cells starting from the top-left to the
   * bottom-right. HINT: Straight line means single loop
   */
  public static int[] getDiagonalOne(int[][] square) {
	  int[] ret = new int[square.length];
	  for (int i = 0; i < square.length; i++){
		ret[i] = square[i][i];	
	  }
	  return ret;
  }

  /* Same as above but top-right to bottom-left */
  public static int[] getDiagonalTwo(int[][] square) {
	  int[] ret = new int[square.length];
	  int r = 0;
	  for (int i = square.length-1; i >= 0; i--){
		  ret[i] = square[r][i];
		  r++;
	  }
	  return ret;
  }

  // Given a 1D array, return the sum
  public static int sumArray(int[] ary) {
	  int s = 0;
	  for (int i : ary){
		s+=i;
	  }
	  return s;
  }

  // Print the contents of the 2D array
  public static void printSquare(int[][] square) {
    for (int[] eachRow : square) {
      for (int eachCell : eachRow) {
        System.out.print(eachCell + "\t");
      }
      System.out.println();
    }
  }

}// end of class
