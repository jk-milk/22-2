package university;

public class Quiz2 {

	public static void main(String[] args) {
		
		// 1~50 사이의 중복되지 않은 정수형 난수 25개를 선택하여 2차원 배열에 저장
		
		// 배열을 중복값 없이 채우기
		// 2차원 배열 생성
		final int NUM_OF_ARRAY = 5;
		int Array2D[][] = new int[NUM_OF_ARRAY][NUM_OF_ARRAY];
		
		// 1~50 사이의 정수형 난수 25개 생성
		int newArray[] = new int[NUM_OF_ARRAY*NUM_OF_ARRAY]; //검사용 임시 1차원 배열
		for (int i = 0; i < NUM_OF_ARRAY*NUM_OF_ARRAY; i++) {
			int tmp = (int) (Math.random()*50+1);
				
			// 중복값 검사
			for (int k = 0; k < i; k++) {
				if (newArray[k] == tmp) {
					tmp = (int) (Math.random()*50+1);
					k = -1;
				}
			}
			//검사 완료 - 중복값이 없는 상태
			newArray[i] = tmp;
		}
		// 검사가 끝난 임시 배열의 값을 실제 2차원 배열에 삽입
		for (int i = 0; i < NUM_OF_ARRAY; i++) {
			for (int j = 0; j < NUM_OF_ARRAY; j++) {
				Array2D[i][j] = newArray[i*5+j];
			}
		}
		
		// 2차원 배열 출력
		for (int i = 0; i < NUM_OF_ARRAY; i++) {
			for (int j = 0; j < NUM_OF_ARRAY; j++) {
				System.out.print(Array2D[i][j] + "\t");
			}
			System.out.println("");
		}
		
		// 열 
		// 출력값을 저장할 문자열들 생성
		String colMin = "최소값"+"\t"; // 최소 값
		String colMax = "최대값"+"\t"; // 최대 값
		String colAvg = "중간값"+"\t"; // 중간 값
		
		for (int col = 0; col < NUM_OF_ARRAY; col++) {
			// 열을 임시 1차원 배열에 저장
			int tmpArray[] = new int[NUM_OF_ARRAY];
			for (int i = 0; i<NUM_OF_ARRAY; i++) {
				tmpArray[i] = Array2D[i][col];
			}
			// sort 후 최소 값 최대 값 중간 값 각각 문자열에 저장
			
			//첫 반복문이 완료되면 맨 뒤 원소는 정렬이 완료된 상태이므로 검사하지 않아도 됨.
			for (int i = NUM_OF_ARRAY; i > 0; i--) {
				//정렬이 완료된 뒤쪽 원소는 제외하고 앞의 원소들만 검사
				for (int j = 0; j < i-1; j++) {
					//실제 sort 과정
					if (tmpArray[j+1] < tmpArray[j]) {
						int tmp = tmpArray[j+1];
						tmpArray[j+1] = tmpArray[j];
						tmpArray[j] = tmp;
					}
				}
			}
			colMin += tmpArray[0] + "\t";
			colMax += tmpArray[NUM_OF_ARRAY-1] + "\t";
			colAvg += tmpArray[(NUM_OF_ARRAY-1)/2] + "\t"; //홀수일 때만 가능
			
			//열의 개수만큼 반복
		}
		System.out.println("열");
		System.out.println(colMin);
		System.out.println(colMax);
		System.out.println(colAvg);
		
		
		// 행
		System.out.println();
		System.out.println("행");
		System.out.println("최소값"+"\t"+"최대값"+"\t"+"중간값");
		for (int row = 0; row < NUM_OF_ARRAY; row++) {
			// 행을 임시 1차원 배열에 저장
			int tmpArray[] = new int[NUM_OF_ARRAY];
			for (int i = 0; i < NUM_OF_ARRAY; i++) {
				tmpArray[i] = Array2D[row][i];
			}
			// sort 후 최소 값 최대 값 중간 값 바로 출력
			for (int i = NUM_OF_ARRAY; i > 0; i--) {
				for (int j = 0; j < i-1; j++) {
					if (tmpArray[j+1] < tmpArray[j]) {
						int tmp = tmpArray[j+1];
						tmpArray[j+1] = tmpArray[j];
						tmpArray[j] = tmp;
					}
				}
			}
		
			System.out.println(tmpArray[0]+"\t"+
							   tmpArray[NUM_OF_ARRAY-1]+"\t"+
							   tmpArray[(NUM_OF_ARRAY-1)/2]);
				
		}
		// 전체 최소 값, 최대 값, 중간 값 출력
		// 전체를 1차원 배열에 넣고 정렬
		for (int i = NUM_OF_ARRAY*NUM_OF_ARRAY; i > 0; i--) {
			for (int j = 0; j < i-1; j++) {
				if (newArray[j+1] < newArray[j]) {
					int tmp = newArray[j+1];
					newArray[j+1] = newArray[j];
					newArray[j] = tmp;
				}
			}
		}
		//출력
		System.out.println();
		System.out.println("최소값"+"\t"+newArray[0]);
		System.out.println("최대값"+"\t"+newArray[NUM_OF_ARRAY*NUM_OF_ARRAY-1]);
		System.out.println("중간값"+"\t"+newArray[(NUM_OF_ARRAY*NUM_OF_ARRAY+1)/2]);
		
	}

}
