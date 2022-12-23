package university;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String menu = "";
		
		int inputValue = sc.nextInt();
		
		switch (inputValue) {
		case 1:
			menu = "Ä¿ÇÇ";
			break;
		case 2:
		case 3:
			menu = "³ìÂ÷";
			break;
		case 4, 6:
			menu = "È«Â÷";
			break;
		default:
			menu = ".";
		}
		System.out.println(menu);
		
		
			
	}

}