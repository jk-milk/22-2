package university1_2.test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		//N개의 원소를 가지는 1차원 배열 생성 후 배열 원소 값을 지그재그 순서로 입력 받아 저장
		
		//원소 개수 입력 후 1차원 배열 생성
		Scanner sc = new Scanner(System.in);
		System.out.println("1차원 배열의 원소 개수를 입력하세요");
		int n = sc.nextInt();
		int array[] = new int[n];
		
		//배열 원소 값 입력
		for (int count = 1; count <= n; count++) {
			System.out.println(count+" 번째 값을 입력 하세요");
			
			//입력 count가 홀수일 때 왼쪽부터
			if (count % 2 != 0)
				array[(count-1)/2] = sc.nextInt();
			
			//입력 count가 짝수일 때 오른쪽부터
			else
				array[n-(count/2)] = sc.nextInt();	
		}
				
		//입력된 1차원 배열 내 원소 값 출력
		System.out.println("입력된 1차원 배열 내 원소 값");
		for (int i = 0; i < n; i++)
			System.out.print(array[i]+"\t");
		
		
	}
}
