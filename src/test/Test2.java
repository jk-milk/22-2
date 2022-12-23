package test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// N X N 2���� �迭�� �����ϰ� �ߺ����� ���� -20 ~ 20 ���� ������
		// �迭 ���ҷ� ä�� �� ���ǿ� ���� ���, �հ� ���� ����϶�
		
		// 2���� �迭 ������ ���� N�� �Է�
		Scanner sc = new Scanner(System.in);
		System.out.println("N X N 2���� �迭 ������ ����, N���� �Է��ϼ���");
		int n = sc.nextInt();
		
		// -20 ~ 20 ���� �ߺ����� ���� ������ 2���� �迭 ä���
		int array2D[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				
				int tmp = (int) (Math.random()*41)-20;
				//�ߺ��� �˻�
				
				array2D[i][j] = tmp;
					
			}	
		}
		
		
		// �޴� ���
		while (true) {
			System.out.println("================================");
			System.out.println("1. N X N �� ��� ���ҿ� ���� ��� ��");
			System.out.println("2. N X N �� �� -> �� �밢�� ���� �հ� ��");
			System.out.println("3. N X N ��� ���� �� ���");
			System.out.println("4. ���α׷� ����");
			
			int p = sc.nextInt(); //����� �Է� ��
			
			//1. N X N �� ��� ���ҿ� ���� ��� ��
			if (p == 1) {
				int sum = 0;
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						sum += array2D[i][j];
					}
				}
				System.out.println((double)sum/n*n);
			}
			
			
			//2. N X N �� �� -> �� �밢�� ���� �հ� ��
			if (p == 2) {
				int sum2 = 0;
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						if (i == j)
							sum2 += array2D[i][j];
					}
				}
				System.out.println(sum2);
			}
			
			//3. N X N ��� ���� �� ���
			if (p == 3) {
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						System.out.print(array2D[i][j]+"\t");
					}
					System.out.println();
				}
			}
			
			//4. ���α׷� ����
			if (p == 4) 
				break;
		}
	}	
}

