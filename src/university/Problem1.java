package university;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Ű����κ��� ���� �Է�
		System.out.println("������ �Է� �ϼ���");
		int score = sc.nextInt();
		
		//�߸��� ���� �ԷµǾ��� ��
		while (score < 0 || score > 100) {
			System.out.println("�߸��� �Է� �� �Դϴ�. �ٽ� �Է� �ϼ���");
			score = sc.nextInt();
		}
		
		//0~100 ���� ������ ��
		String stringScore = "";
		
		if (score >= 90) 
			stringScore = "A";
		else if (score >= 80)
			stringScore = "B";
		else if (score >= 70)
			stringScore = "C";
		else if (score >= 60)
			stringScore = "D";
		else
			stringScore = "F";
		
		System.out.println(score+"�� ����� "+stringScore+" �Դϴ�");
	}
}
