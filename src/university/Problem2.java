package university;

public class Problem2 {

	public static void main(String[] args) {
		
		//�ҹ��� ���
		for(char smallAlphabet = 97;smallAlphabet<123;smallAlphabet++) {
			//1�� ��� �� 2�� �ǳʶٱ�
			if (smallAlphabet%3 != 1)
				continue;
			System.out.print(smallAlphabet);
		}
		
		System.out.println();
		
		//�빮�� ���
		for(char bigAlphabet = 90;bigAlphabet>64;bigAlphabet--) {
			System.out.print(bigAlphabet);
		}
	}
}
