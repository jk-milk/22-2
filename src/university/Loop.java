package university;

import java.util.Scanner;
public class Loop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//���� �Է�
		System.out.println("������ �Է��Ͻÿ�");
		int inputValue = 0;
		char firstAlpha;
		
		//����ó��
		do {
			inputValue = sc.nextInt();
			
			if (inputValue == 1 || inputValue == 2) {
				firstAlpha = inputValue == 1 ? 'a' : 'A';
				break;
			}
			
		}while(true);
		
		int lineNum = sc.nextInt();
		
		//1�� ��
		//�ҹ��� a~z���� �� ��
		if (inputValue == 1) {
			System.out.println("����� �� ���� �Է��ϼ���");
			lineNum = sc.nextInt();
			for (int i = 0 ; i < lineNum ; i++) {
				for (char alphabet = 'a'; alphabet <='z'; alphabet++) {
					System.out.print(alphabet);
				}
				System.out.println();
			}	
			
		//2�� ��
		//�빮�� A~Z���� �� �� 	
		}else {
			System.out.println("����� �� ���� �Է��ϼ���");
			lineNum = sc.nextInt();
			for (int i = 0 ; i < lineNum ; i++) {
				for (char alphabet = 'A'; alphabet <='Z'; alphabet++) {
					System.out.print(alphabet);
				}
				System.out.println();
			}
		}
		System.out.println("����Ϸ��� �ƹ� Ű�� �����ʽÿ�...");
	}
}