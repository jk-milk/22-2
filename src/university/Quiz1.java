package university;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("배열 개수 입력");
		
		//양의 정수 N 입력 
		int N = sc.nextInt();
		//N이 1~100인지 검사
		while (true) {
			if (1 <= N && N <= 100)
				break;
			N = sc.nextInt();
		}
		
		//원소의 개수가 N인 1차원 정수 배열 선언
		int myArray[] = new int[N];
		
		//배열을 중복값 없는 난수로 채우기
		//-50~50 사이 난수 생성
		for (int i = 0; i < N; i++) {
			int tmp = (int) (Math.random()*101-50);
			
			//중복값 검사
			for (int j = 0; j < i; j++) {
				//중복값 발견
				if (myArray[j] == tmp) {
					tmp = (int) (Math.random()*101-50);
					j = -1;
				}
			}
			myArray[i] = tmp;
		}
		
		//최대 값 계산
		int max = -50;
		for (int i = 0; i < N; i++) {
			if (myArray[i]>=max) {
				max = myArray[i];
			}
		}
		
		//최소 값 계산
		int min = 50;
		for (int i = 0; i < N; i++) {
			if (myArray[i]<=min) {
				min = myArray[i];
			}
		}
		
		//평균 값 계산
		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum+=myArray[i];
		}
		double avg = (double) sum/N;
		
		
		//배열의 원소의 개수
		//배열 내 난수 값
		//최대 값
		//최소 값
		//평균 값 
		//출력
		System.out.println("배열의 개수 : "+N);
		System.out.print("배열 내 난수 값 : ");
		for (int i = 0; i < N; i++) {
			System.out.print(myArray[i]+", ");
		}
		System.out.println("");
		System.out.println("최대 값 : " + max);
		System.out.println("최소 값 : " + min);
		System.out.println("평균 값 : " + avg);
		
		//히스토그램 출력
		final int MAX_OF_ARRAY = 50;
		System.out.println("히스토그램");
		for (int j = -50; j<MAX_OF_ARRAY-10; j+=10) {
			String msg = j+" ~ "+(j+9)+" : ";
			for (int i = 0; i < N; i++) {
				if (j <= myArray[i] && myArray[i] <= j+9) {
					msg += "*";
				}
			}
			System.out.println(msg);
		}
		//히스토그램 마지막 줄 출력
		String msg = MAX_OF_ARRAY-10+" ~ "+MAX_OF_ARRAY+" : ";
		for (int i = 0; i < N; i++) {
			if (MAX_OF_ARRAY-10 <= myArray[i] && myArray[i] <= MAX_OF_ARRAY) {
				msg += "*";
			}
		}
		System.out.println(msg);
		
	}

}
