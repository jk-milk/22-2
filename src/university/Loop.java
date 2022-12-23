package university;

import java.util.Scanner;
public class Loop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//정수 입력
		System.out.println("정수를 입력하시오");
		int inputValue = 0;
		char firstAlpha;
		
		//예외처리
		do {
			inputValue = sc.nextInt();
			
			if (inputValue == 1 || inputValue == 2) {
				firstAlpha = inputValue == 1 ? 'a' : 'A';
				break;
			}
			
		}while(true);
		
		int lineNum = sc.nextInt();
		
		//1일 때
		//소문자 a~z까지 한 줄
		if (inputValue == 1) {
			System.out.println("출력할 줄 수를 입력하세요");
			lineNum = sc.nextInt();
			for (int i = 0 ; i < lineNum ; i++) {
				for (char alphabet = 'a'; alphabet <='z'; alphabet++) {
					System.out.print(alphabet);
				}
				System.out.println();
			}	
			
		//2일 때
		//대문자 A~Z가지 한 줄 	
		}else {
			System.out.println("출력할 줄 수를 입력하세요");
			lineNum = sc.nextInt();
			for (int i = 0 ; i < lineNum ; i++) {
				for (char alphabet = 'A'; alphabet <='Z'; alphabet++) {
					System.out.print(alphabet);
				}
				System.out.println();
			}
		}
		System.out.println("계속하려면 아무 키나 누르십시오...");
	}
}