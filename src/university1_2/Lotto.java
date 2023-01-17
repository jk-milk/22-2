package university1_2;

public class Lotto {

	public static void main(String[] args) {
		// 1~45 �ߺ�x 6�� 
		
		final int NUM_OF_MAX = 6;
		// �ζ� ���ڸ� ���� �迭
		int lotto[] = new int[NUM_OF_MAX];
		
		// ���� 6�� ���
		for (int i = 0; i < NUM_OF_MAX; i++) {
			
			int tmp = (int) (Math.random()*45+1);
			
			//�ߺ��� �˻�
			for (int j = 0; j < i; j++) {
				
				//�ߺ��� �߰�
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
