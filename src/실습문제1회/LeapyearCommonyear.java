package �ǽ�����1ȸ;

import java.util.Scanner;

public class LeapyearCommonyear {

	public static void main(String[] args) {
		//�غ�
		int year;
		
		//�Է�
		System.out.print("�⵵�� �Է��ϼ���>>>  ");
		Scanner scan = new Scanner(System.in);
		year = scan.nextInt();
		
		/*
		 * ���� ����
		 * 4�� ������ �������� 100���� ������ �������� �ʰų�
		 * 400���� ������ �������� �ݾ�
		 */
		//ó��
		
		if(year%4 == 0 && year%100 !=0 || year%400 ==0) {
			System.out.println("�Է��� �⵵�� �����Դϴ�.");
		}else {
			System.out.println("�Է��� �⵵�� ����Դϴ�.");
		}
	}	

}
