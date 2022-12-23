package university;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//키보드로부터 정수 입력
		System.out.println("점수를 입력 하세요");
		int score = sc.nextInt();
		
		//잘못된 값이 입력되었을 때
		while (score < 0 || score > 100) {
			System.out.println("잘못된 입력 값 입니다. 다시 입력 하세요");
			score = sc.nextInt();
		}
		
		//0~100 사이 정수일 때
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
		
		System.out.println(score+"의 등급은 "+stringScore+" 입니다");
	}
}
