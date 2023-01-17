package university1_2;

public class Lotto {

	public static void main(String[] args) {
		// 1~45 중복x 6개 
		
		final int NUM_OF_MAX = 6;
		// 로또 슷자를 담을 배열
		int lotto[] = new int[NUM_OF_MAX];
		
		// 숫자 6개 담기
		for (int i = 0; i < NUM_OF_MAX; i++) {
			
			int tmp = (int) (Math.random()*45+1);
			
			//중복값 검사
			for (int j = 0; j < i; j++) {
				
				//중복값 발견
				if (lotto[j] == tmp) {
					tmp = (int) (Math.random()*45+1);
					j = -1;
				}
					
			}
			
			lotto[i] = tmp;
			
		}
		
		for (int i = 0; i < NUM_OF_MAX; i++) {
			System.out.println(lotto[i]);
		}

	}

}
