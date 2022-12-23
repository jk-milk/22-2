package university;

public class BubbleSort {

	public static void main(String[] args) {
		
		final int NUM_OF_ARRAY = 5;
		int tmpArray[] = new int[] {11,9,7,6,8};
		int tmp = tmpArray[0];
		
		for (int i = NUM_OF_ARRAY; i > 0; i--) {
			for (int j = 0; j < i-1; j++) {
				if (tmpArray[j+1] < tmpArray[j]) {
					tmp = tmpArray[j+1];
					tmpArray[j+1] = tmpArray[j];
					tmpArray[j] = tmp;
				}
			}
		}
		for (int i = 0; i < tmpArray.length; i++)
			System.out.println(tmpArray[i]);

	}

}
