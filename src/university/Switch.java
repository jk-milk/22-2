package university;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String menu = "";
		
		int inputValue = sc.nextInt();
		
		switch (inputValue) {
		case 1:
			menu = "Ŀ��";
			break;
		case 2:
		case 3:
			menu = "����";
			break;
		case 4, 6:
			menu = "ȫ��";
			break;
		default:
			menu = ".";
		}
		System.out.println(menu);
		
		
			
	}

}