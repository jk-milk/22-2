package university;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�迭 ���� �Է�");
		
		//���� ���� N �Է� 
		int N = sc.nextInt();
		//N�� 1~100���� �˻�
		while (true) {
			if (1 <= N && N <= 100)
				break;
			N = sc.nextInt();
		}
		
		//������ ������ N�� 1���� ���� �迭 ����
		int myArray[] = new int[N];
		
		//�迭�� �ߺ��� ���� ������ ä���
		//-50~50 ���� ���� ����
		for (int i = 0; i < N; i++) {
			int tmp = (int) (Math.random()*101-50);
			
			//�ߺ��� �˻�
			for (int j = 0; j < i; j++) {
				//�ߺ��� �߰�
				if (myArray[j] == tmp) {
					tmp = (int) (Math.random()*101-50);
					j = -1;
				}
			}
			myArray[i] = tmp;
		}
		
		//�ִ� �� ���
		int max = -50;
		for (int i = 0; i < N; i++) {
			if (myArray[i]>=max) {
				max = myArray[i];
			}
		}
		
		//�ּ� �� ���
		int min = 50;
		for (int i = 0; i < N; i++) {
			if (myArray[i]<=min) {
				min = myArray[i];
			}
		}
		
		//��� �� ���
		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum+=myArray[i];
		}
		double avg = (double) sum/N;
		
		
		//�迭�� ������ ����
		//�迭 �� ���� ��
		//�ִ� ��
		//�ּ� ��
		//��� �� 
		//���
		System.out.println("�迭�� ���� : "+N);
		System.out.print("�迭 �� ���� �� : ");
		for (int i = 0; i < N; i++) {
			System.out.print(myArray[i]+", ");
		}
		System.out.println("");
		System.out.println("�ִ� �� : " + max);
		System.out.println("�ּ� �� : " + min);
		System.out.println("��� �� : " + avg);
		
		//������׷� ���
		final int MAX_OF_ARRAY = 50;
		System.out.println("������׷�");
		for (int j = -50; j<MAX_OF_ARRAY-10; j+=10) {
			String msg = j+" ~ "+(j+9)+" : ";
			for (int i = 0; i < N; i++) {
				if (j <= myArray[i] && myArray[i] <= j+9) {
					msg += "*";
				}
			}
			System.out.println(msg);
		}
		//������׷� ������ �� ���
		String msg = MAX_OF_ARRAY-10+" ~ "+MAX_OF_ARRAY+" : ";
		for (int i = 0; i < N; i++) {
			if (MAX_OF_ARRAY-10 <= myArray[i] && myArray[i] <= MAX_OF_ARRAY) {
				msg += "*";
			}
		}
		System.out.println(msg);
		
	}

}
