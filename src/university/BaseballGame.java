package university;

import java.util.Scanner;

public class BaseballGame {

	public static void main(String[] args) {
		
		final int MAX_NUM = 9;
		final int RAND_NUM = 3;
		int computer_num[] = new int[RAND_NUM];
		int user_num[] = new int[RAND_NUM];

		// 0~9 사이 중복되지 않은 난수를 발생하여, 배열에 저장
		for(int i = 0; i < RAND_NUM; i++) {
			int tmp = (int) (Math.random()*(MAX_NUM+1));
			
			//중복값 검사
			for(int j = 0; j < i; j++) {
				//중복값 발견
				if (computer_num[j] == tmp) {
					tmp = (int) (Math.random()*(MAX_NUM+1));
					j = -1;		
				}	
			}
			computer_num[i] = tmp;
			
		}
		
		
		
		int GameCount = 1; // 게임 시도 횟수 
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.println("시도횟수: "+GameCount);
			System.out.println("정수 3개 입력");
			
		// 사용자로부터 0~9 사이 정수 입력
			for(int i = 0; i<RAND_NUM; i++) {
				user_num[i] = sc.nextInt();
			}
			
		// Ball, Strike, Out 판별
			int StrikeCount = 0;
			int BallCount   = 0;
			for(int i = 0; i<RAND_NUM; i++) {
				for(int j = 0; j<RAND_NUM; j++) {
					//불필요한 변수들
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
				System.out.println("Out: 아웃 "+OutCount+"번");
			}
	
			String msg = "";  
			if(StrikeCount > 0)
				msg += "Strike : " + StrikeCount;
			if(BallCount > 0)
				msg += "Ball : " + BallCount;
			
			System.out.println(msg);
			
			/* 
			 * 1:출력할 메시지를 쌓아두고 한번에 출력하기
			 * 2:조건을 좀 더 단순하게
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
			
			
		
		// 게임 조건 확인 후 그에 따른 결과 실행
		//  1) Win : 컴퓨터가 발생한 랜덤 값을 다 맞춘 경우
			if (StrikeCount == 3) {
				System.out.println("GAME WIN");
				break;
			}
		//  2) Lose : 게임 횟수 5회 이상 또는 스트라이크 아웃 2회 이상
			if (GameCount >= 5 || OutCount >= 2) {
				System.out.println("GAME LOSE");
				System.out.print("정답은: ");
				for(int i = 0; i < RAND_NUM; i++) {
					System.out.print(computer_num[i]+" ");
				}
				System.out.println("입니다.");
				break;
			}
		
		// 반복
		}
		
	}

}
