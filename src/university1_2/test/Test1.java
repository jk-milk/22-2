package university1_2.test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		//N���� ���Ҹ� ������ 1���� �迭 ���� �� �迭 ���� ���� ������� ������ �Է� �޾� ����
		
		//���� ���� �Է� �� 1���� �迭 ����
		Scanner sc = new Scanner(System.in);
		System.out.println("1���� �迭�� ���� ������ �Է��ϼ���");
		int n = sc.nextInt();
		int array[] = new int[n];
		
		//�迭 ���� �� �Է�
		for (int count = 1; count <= n; count++) {
			System.out.println(count+" ��° ���� �Է� �ϼ���");
			
			//�Է� count�� Ȧ���� �� ���ʺ���
			if (count % 2 != 0)
				array[(count-1)/2] = sc.nextInt();
			
			//�Է� count�� ¦���� �� �����ʺ���
			else
				array[n-(count/2)] = sc.nextInt();	
		}
				
		//�Էµ� 1���� �迭 �� ���� �� ���
		System.out.println("�Էµ� 1���� �迭 �� ���� ��");
		for (int i = 0; i < n; i++)
			System.out.print(array[i]+"\t");
		
		
	}
}
