package university;

import java.util.Scanner;

public class InputChar {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int count = 0; // stage 구분 변수
		boolean IsFirstInput = true; // 변수 이름을 확실히 
		
		while (true) {
			
			//아래 콘솔 입력은 한 번만 사용.
			char inputChar = scn.next().charAt(0);
			
			if (count == 0) {
				if (inputChar == 'a')
					count = 1;
			}
			else {
				if (inputChar == 'b') 
					break;
				else 
				// 위의 if문 안에 들어가지 않았으면 어차피 26번 라인으로 가기 때문에
				// else를 쓸 필요는 없음
					count = 0;
				
			}
		}
		System.out.println("참");
	}

}