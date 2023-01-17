package university1_2.fuyu;

import java.util.Scanner;

class StudentInfo {
	
	String name;
	int id;
	int scoreKorean;
	int scoreEnglish;
	int scoreMath;
	int sum;
	float avg;
	
	void getSum() {
		sum = scoreKorean + scoreEnglish + scoreMath;
	}
	void getAvg() {
		avg = (float) (Math.round(sum/3.0f*10) / 10.0);
	}
	
	StudentInfo() {} //기본 생성자
	
	StudentInfo(String argName, int argId) { //이름, 아이디 입력 생성자
		name = argName;
		id   = argId;
	}

}

class Manager {
	final int NUM_OF_STUDENT; //학생 수
	StudentInfo stdList[]; //학생 객체 참조변수의 배열
	boolean flag; // 실행 프로그램 종료 여부 결정 변수
	
	Manager() {
		NUM_OF_STUDENT = 10;
		stdList = new StudentInfo[NUM_OF_STUDENT];
		flag = true;
	}
	
	// 현재 입력된 데이터 개수 반환
	int stdNum() {
		for (int i = 0; i < NUM_OF_STUDENT; i++) {
			if (stdList[i] == null) {
				return i;
			}
		}
		return NUM_OF_STUDENT;
	}
	
	//전체 학생의 성적 평균 반환
	float stdAvg() {
		//현재 입력된 학생이 0명일 때 평균 성적 0.0 반환
		if (stdNum() == 0)
			return 0;
		
		float stdSum = 0; //모든 학생의 성적 합
		//현재 입력된 학생들의 성적의 합을 미리 지정한 변수에 입력
		for (int i = 0; i < stdNum(); i++) {
			stdSum = stdSum + stdList[i].avg;
		}
		return (float) (Math.round((stdSum/stdNum()*100)) / 100.0);
	}
	
	//메뉴 출력
	void prtMenu() {
		System.out.println("====================");
		System.out.println("1. 학생 성적 입력");
		System.out.println("2. 학생 목록 출력(입력 순)");
		System.out.println("3. 프로그램 종료"+"\n");
		
		System.out.println("현 입력데이터 개수 : " + stdNum());
		System.out.println("전체 학생 평균 값 : " + stdAvg());
		System.out.println("====================");
	}
	
	//학생 성적 입력 프로세스
	void insertStdInfo() {
		int inputNum = stdNum();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학번을 입력하세요");
		int Id = sc.nextInt();
		
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
	
		stdList[inputNum] = new StudentInfo(name, Id);
		
		System.out.println("국어 성적을 입력하세요");
		stdList[inputNum].scoreKorean = sc.nextInt();
		
		System.out.println("영어 성적을 입력하세요");
		stdList[inputNum].scoreEnglish = sc.nextInt();
		
		System.out.println("수학 성적을 입력하세요");
		stdList[inputNum].scoreMath = sc.nextInt();
		
		stdList[inputNum].getSum();
		stdList[inputNum].getAvg();
	}
	
	//학생 목록 출력(입력 순)
	void prtStudents() {
		String msg = "";
		for (int i = 0; i < stdNum(); i++) {
			msg +=  " id : "+ stdList[i].id +
					" name : "+ stdList[i].name + "\t" +
					" kor : "+ stdList[i].scoreKorean + 
					" eng : "+ stdList[i].scoreEnglish +
					" math : "+ stdList[i].scoreMath +
					" sum : "+ stdList[i].sum +
					" avg : "+ stdList[i].avg +
					"\n";
		}
		System.out.println(msg);
	}
	
	//실제 실행 프로그램
	void run() {
		
		while(flag) {
			prtMenu();
			inputValueProcess();
		}
		System.out.println("프로그램 종료");
	}
	
	//사용자 입력 값에 따른 프로세스 분리 메서드
	void inputValueProcess() {
		Scanner sc = new Scanner(System.in);
		switch(sc.nextInt()) {
		case 1:
			insertStdInfo();
			break;
		case 2:
			prtStudents();
			break;
		case 3:
			flag = false;
		}
	}
}

public class Student {

	public static void main(String[] args) {
		
		new Manager().run();

	}

}
