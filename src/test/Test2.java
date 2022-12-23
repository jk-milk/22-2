package test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// N X N 2차원 배열을 생성하고 중복되지 않은 -20 ~ 20 사이 정수를
		// 배열 원소로 채운 후 조건에 따른 평균, 합계 값을 출력하라
		
		// 2차원 배열 생성을 위한 N값 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("N X N 2차원 배열 생성을 위한, N값을 입력하세요");
		int n = sc.nextInt();
		
		// -20 ~ 20 사이 중복되지 않은 난수로 2차원 배열 채우기
		int array2D[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				
				int tmp = (int) (Math.random()*41)-20;
				//중복값 검사
				
				array2D[i][j] = tmp;
					
			}	
		}
		
		
		// 메뉴 출력
		while (true) {
			System.out.println("================================");
			System.out.println("1. N X N 내 모든 원소에 대한 평균 값");
			System.out.println("2. N X N 내 좌 -> 우 대각선 원소 합계 값");
			System.out.println("3. N X N 모든 원소 값 출력");
			System.out.println("4. 프로그램 종료");
			
			int p = sc.nextInt(); //사용자 입력 값
			
			//1. N X N 내 모든 원소에 대한 평균 값
			if (p == 1) {
				int sum = 0;
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						sum += array2D[i][j];
					}
				}
				System.out.println((double)sum/n*n);
			}
			
			
			//2. N X N 내 좌 -> 우 대각선 원소 합계 값
			if (p == 2) {
				int sum2 = 0;
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						if (i == j)
							sum2 += array2D[i][j];
					}
				}
				System.out.println(sum2);
			}
			
			//3. N X N 모든 원소 값 출력
			if (p == 3) {
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						System.out.print(array2D[i][j]+"\t");
					}
					System.out.println();
				}
			}
			
			//4. 프로그램 종료
			if (p == 4) 
				break;
		}
	}	
}

