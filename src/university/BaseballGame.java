package university;

import java.util.Scanner;

public class BaseballGame {

	public static void main(String[] args) {
		
		final int MAX_NUM = 9;
		final int RAND_NUM = 3;
		int computer_num[] = new int[RAND_NUM];
		int user_num[] = new int[RAND_NUM];

		// 0~9 ���� �ߺ����� ���� ������ �߻��Ͽ�, �迭�� ����
		for(int i = 0; i < RAND_NUM; i++) {
			int tmp = (int) (Math.random()*(MAX_NUM+1));
			
			//�ߺ��� �˻�
			for(int j = 0; j < i; j++) {
				//�ߺ��� �߰�
				if (computer_num[j] == tmp) {
					tmp = (int) (Math.random()*(MAX_NUM+1));
					j = -1;		
				}	
			}
			computer_num[i] = tmp;
			
		}
		
		
		
		int GameCount = 1; // ���� �õ� Ƚ�� 
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.println("�õ�Ƚ��: "+GameCount);
			System.out.println("���� 3�� �Է�");
			
		// ����ڷκ��� 0~9 ���� ���� �Է�
			for(int i = 0; i<RAND_NUM; i++) {
				user_num[i] = sc.nextInt();
			}
			
		// Ball, Strike, Out �Ǻ�
			int StrikeCount = 0;
			int BallCount   = 0;
			for(int i = 0; i<RAND_NUM; i++) {
				for(int j = 0; j<RAND_NUM; j++) {
					//���ʿ��� ������
					//int tmpUser_num = user_num[i];
					//int tmpComputer_num = computer_num[j];
					if (user_num[i] == computer_num[j]) {
						if (i==j)
							StrikeCount++;
						else
							BallCount++;
					}
				}
			}
			int OutCount = 0;
			if (StrikeCount == 0 && BallCount == 0) {
				OutCount++;
				System.out.println("Out: �ƿ� "+OutCount+"��");
			}
	
			String msg = "";  
			if(StrikeCount > 0)
				msg += "Strike : " + StrikeCount;
			if(BallCount > 0)
				msg += "Ball : " + BallCount;
			
			System.out.println(msg);
			
			/* 
			 * 1:����� �޽����� �׾Ƶΰ� �ѹ��� ����ϱ�
			 * 2:������ �� �� �ܼ��ϰ�
			if (StrikeCount!=0 && BallCount!=0) {
				System.out.println(StrikeCount+" Strike "
									+BallCount+" Ball");
			} else if (StrikeCount!=0) {
				System.out.println(StrikeCount+" Strike");
			} else {
				System.out.println(BallCount+" Ball");
			}
			*/
				
				
			GameCount++;
			
			
		
		// ���� ���� Ȯ�� �� �׿� ���� ��� ����
		//  1) Win : ��ǻ�Ͱ� �߻��� ���� ���� �� ���� ���
			if (StrikeCount == 3) {
				System.out.println("GAME WIN");
				break;
			}
		//  2) Lose : ���� Ƚ�� 5ȸ �̻� �Ǵ� ��Ʈ����ũ �ƿ� 2ȸ �̻�
			if (GameCount >= 5 || OutCount >= 2) {
				System.out.println("GAME LOSE");
				System.out.print("������: ");
				for(int i = 0; i < RAND_NUM; i++) {
					System.out.print(computer_num[i]+" ");
				}
				System.out.println("�Դϴ�.");
				break;
			}
		
		// �ݺ�
		}
		
	}

}
