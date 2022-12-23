package university;

public class Array3D {

	public static void main(String[] args) {

		// [2][2][2]
		int foo[][][] = new int[][][] 
				{ { {1, 2}, {3, 4} }, { {5, 6}, {7, 8} } };
		
		// N¹øÂ° Matrix
		for(int i = 0; i < foo.length; i++) {
			// Row
			for(int j = 0; j < foo[i].length; j++) {
				// Column
				for(int k = 0; k < foo[i][j].length; k++) {
					System.out.print(foo[i][j][k] + "\t");
				}
				
				System.out.println();
			}
			
			System.out.println("======================");
		}

	}

}
