package university;

import java.util.Scanner;

public class InputChar {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int count = 0; // stage ���� ����
		boolean IsFirstInput = true; // ���� �̸��� Ȯ���� 
		
		while (true) {
			
			//�Ʒ� �ܼ� �Է��� �� ���� ���.
			char inputChar = scn.next().charAt(0);
			
			if (count == 0) {
				if (inputChar == 'a')
					count = 1;
			}
			else {
				if (inputChar == 'b') 
					break;
				else 
				// ���� if�� �ȿ� ���� �ʾ����� ������ 26�� �������� ���� ������
				// else�� �� �ʿ�� ����
					count = 0;
				
			}
		}
		System.out.println("��");
	}

}