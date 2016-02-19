package misc;
/**
 * 
 * Remove duplicates from a sorted array in O(n) and return the length of the resulting array in place
 */
public class RemoveDuplicatesFromArray {
	public static void main(String[] args) {
		int[] array = {3,3,4,5,5,6,7,7,7,7};
		int j = 0;
		for (int i = 1; i < array.length; i++) {
			if(array[j] != array[i]){
				array[++j] = array[i];
			}
		}
		for (int i = 0; i <= j; i++) {
			System.out.println(array[i]);
		}
	}
}
