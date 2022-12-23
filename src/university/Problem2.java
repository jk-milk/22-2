package university;

public class Problem2 {

	public static void main(String[] args) {
		
		//소문자 출력
		for(char smallAlphabet = 97;smallAlphabet<123;smallAlphabet++) {
			//1개 출력 후 2개 건너뛰기
			if (smallAlphabet%3 != 1)
				continue;
			System.out.print(smallAlphabet);
		}
		
		System.out.println();
		
		//대문자 출력
		for(char bigAlphabet = 90;bigAlphabet>64;bigAlphabet--) {
			System.out.print(bigAlphabet);
		}
	}
}
