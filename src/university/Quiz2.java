package university;

public class Quiz2 {

	public static void main(String[] args) {
		
		// 1~50 ������ �ߺ����� ���� ������ ���� 25���� �����Ͽ� 2���� �迭�� ����
		
		// �迭�� �ߺ��� ���� ä���
		// 2���� �迭 ����
		final int NUM_OF_ARRAY = 5;
		int Array2D[][] = new int[NUM_OF_ARRAY][NUM_OF_ARRAY];
		
		// 1~50 ������ ������ ���� 25�� ����
		int newArray[] = new int[NUM_OF_ARRAY*NUM_OF_ARRAY]; //�˻�� �ӽ� 1���� �迭
		for (int i = 0; i < NUM_OF_ARRAY*NUM_OF_ARRAY; i++) {
			int tmp = (int) (Math.random()*50+1);
				
			// �ߺ��� �˻�
			for (int k = 0; k < i; k++) {
				if (newArray[k] == tmp) {
					tmp = (int) (Math.random()*50+1);
					k = -1;
				}
			}
			//�˻� �Ϸ� - �ߺ����� ���� ����
			newArray[i] = tmp;
		}
		// �˻簡 ���� �ӽ� �迭�� ���� ���� 2���� �迭�� ����
		for (int i = 0; i < NUM_OF_ARRAY; i++) {
			for (int j = 0; j < NUM_OF_ARRAY; j++) {
				Array2D[i][j] = newArray[i*5+j];
			}
		}
		
		// 2���� �迭 ���
		for (int i = 0; i < NUM_OF_ARRAY; i++) {
			for (int j = 0; j < NUM_OF_ARRAY; j++) {
				System.out.print(Array2D[i][j] + "\t");
			}
			System.out.println("");
		}
		
		// �� 
		// ��°��� ������ ���ڿ��� ����
		String colMin = "�ּҰ�"+"\t"; // �ּ� ��
		String colMax = "�ִ밪"+"\t"; // �ִ� ��
		String colAvg = "�߰���"+"\t"; // �߰� ��
		
		for (int col = 0; col < NUM_OF_ARRAY; col++) {
			// ���� �ӽ� 1���� �迭�� ����
			int tmpArray[] = new int[NUM_OF_ARRAY];
			for (int i = 0; i<NUM_OF_ARRAY; i++) {
				tmpArray[i] = Array2D[i][col];
			}
			// sort �� �ּ� �� �ִ� �� �߰� �� ���� ���ڿ��� ����
			
			//ù �ݺ����� �Ϸ�Ǹ� �� �� ���Ҵ� ������ �Ϸ�� �����̹Ƿ� �˻����� �ʾƵ� ��.
			for (int i = NUM_OF_ARRAY; i > 0; i--) {
				//������ �Ϸ�� ���� ���Ҵ� �����ϰ� ���� ���ҵ鸸 �˻�
				for (int j = 0; j < i-1; j++) {
					//���� sort ����
					if (tmpArray[j+1] < tmpArray[j]) {
						int tmp = tmpArray[j+1];
						tmpArray[j+1] = tmpArray[j];
						tmpArray[j] = tmp;
					}
				}
			}
			colMin += tmpArray[0] + "\t";
			colMax += tmpArray[NUM_OF_ARRAY-1] + "\t";
			colAvg += tmpArray[(NUM_OF_ARRAY-1)/2] + "\t"; //Ȧ���� ���� ����
			
			//���� ������ŭ �ݺ�
		}
		System.out.println("��");
		System.out.println(colMin);
		System.out.println(colMax);
		System.out.println(colAvg);
		
		
		// ��
		System.out.println();
		System.out.println("��");
		System.out.println("�ּҰ�"+"\t"+"�ִ밪"+"\t"+"�߰���");
		for (int row = 0; row < NUM_OF_ARRAY; row++) {
			// ���� �ӽ� 1���� �迭�� ����
			int tmpArray[] = new int[NUM_OF_ARRAY];
			for (int i = 0; i < NUM_OF_ARRAY; i++) {
				tmpArray[i] = Array2D[row][i];
			}
			// sort �� �ּ� �� �ִ� �� �߰� �� �ٷ� ���
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
		// ��ü �ּ� ��, �ִ� ��, �߰� �� ���
		// ��ü�� 1���� �迭�� �ְ� ����
		for (int i = NUM_OF_ARRAY*NUM_OF_ARRAY; i > 0; i--) {
			for (int j = 0; j < i-1; j++) {
				if (newArray[j+1] < newArray[j]) {
					int tmp = newArray[j+1];
					newArray[j+1] = newArray[j];
					newArray[j] = tmp;
				}
			}
		}
		//���
		System.out.println();
		System.out.println("�ּҰ�"+"\t"+newArray[0]);
		System.out.println("�ִ밪"+"\t"+newArray[NUM_OF_ARRAY*NUM_OF_ARRAY-1]);
		System.out.println("�߰���"+"\t"+newArray[(NUM_OF_ARRAY*NUM_OF_ARRAY+1)/2]);
		
	}

}
