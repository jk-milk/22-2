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
	
	StudentInfo() {} //�⺻ ������
	
	StudentInfo(String argName, int argId) { //�̸�, ���̵� �Է� ������
		name = argName;
		id   = argId;
	}

}

class Manager {
	final int NUM_OF_STUDENT; //�л� ��
	StudentInfo stdList[]; //�л� ��ü ���������� �迭
	boolean flag; // ���� ���α׷� ���� ���� ���� ����
	
	Manager() {
		NUM_OF_STUDENT = 10;
		stdList = new StudentInfo[NUM_OF_STUDENT];
		flag = true;
	}
	
	// ���� �Էµ� ������ ���� ��ȯ
	int stdNum() {
		for (int i = 0; i < NUM_OF_STUDENT; i++) {
			if (stdList[i] == null) {
				return i;
			}
		}
		return NUM_OF_STUDENT;
	}
	
	//��ü �л��� ���� ��� ��ȯ
	float stdAvg() {
		//���� �Էµ� �л��� 0���� �� ��� ���� 0.0 ��ȯ
		if (stdNum() == 0)
			return 0;
		
		float stdSum = 0; //��� �л��� ���� ��
		//���� �Էµ� �л����� ������ ���� �̸� ������ ������ �Է�
		for (int i = 0; i < stdNum(); i++) {
			stdSum = stdSum + stdList[i].avg;
		}
		return (float) (Math.round((stdSum/stdNum()*100)) / 100.0);
	}
	
	//�޴� ���
	void prtMenu() {
		System.out.println("====================");
		System.out.println("1. �л� ���� �Է�");
		System.out.println("2. �л� ��� ���(�Է� ��)");
		System.out.println("3. ���α׷� ����"+"\n");
		
		System.out.println("�� �Էµ����� ���� : " + stdNum());
		System.out.println("��ü �л� ��� �� : " + stdAvg());
		System.out.println("====================");
	}
	
	//�л� ���� �Է� ���μ���
	void insertStdInfo() {
		int inputNum = stdNum();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�й��� �Է��ϼ���");
		int Id = sc.nextInt();
		
		System.out.println("�̸��� �Է��ϼ���");
		String name = sc.nextLine();
	
		stdList[inputNum] = new StudentInfo(name, Id);
		
		System.out.println("���� ������ �Է��ϼ���");
		stdList[inputNum].scoreKorean = sc.nextInt();
		
		System.out.println("���� ������ �Է��ϼ���");
		stdList[inputNum].scoreEnglish = sc.nextInt();
		
		System.out.println("���� ������ �Է��ϼ���");
		stdList[inputNum].scoreMath = sc.nextInt();
		
		stdList[inputNum].getSum();
		stdList[inputNum].getAvg();
	}
	
	//�л� ��� ���(�Է� ��)
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
	
	//���� ���� ���α׷�
	void run() {
		
		while(flag) {
			prtMenu();
			inputValueProcess();
		}
		System.out.println("���α׷� ����");
	}
	
	//����� �Է� ���� ���� ���μ��� �и� �޼���
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
