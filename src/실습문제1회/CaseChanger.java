package �ǽ�����1ȸ;

import java.util.Scanner;

public class CaseChanger {
	public static void main(String[] args) {
		//�غ� �ܰ�
		char alpha;
		
		//�Է� �ܰ�
		System.out.print("���� �� �ڸ� �Է��ϼ���>>> ");
		Scanner scan = new Scanner(System.in); //�ý��� �� �� �� ��ĵ Ŭ�ο��� ���־���Ѵ�. �ڿ��� �ǵ�����.
		
		/*
		 * 'A' =>65 �̰Ŵ� ����
		 * "A"  => "A/0" ���ڿ��̴�. �� ���ڸ� �ִ� �� �̴�.
		 */
				
		alpha =scan.next().charAt(0);                  //�޼ҵ尡 ��ø �ƴ�.
	      
		if(alpha >= 'a' && alpha <= 'z')  { //&& AND ������, �Ӥ�or ������
			//�º�  = �캯;
			alpha = (char) (alpha -32); //���� ��ȭ �Ǵ� ���� ������ ��ȭ�̴�. ĳ���� ������ ���׿�����
		}
		
		else if (alpha >= 'A' && alpha <= 'Z')  { //&& AND ������, �Ӥ�or ������
				//�º�  = �캯;
			alpha = (char) (alpha +32);
		}else {//�ѱ��� �Էµ� ���
			System.out.println("�����ڰ� �ƴմϴ�.");
			System.exit(0); //���α׷� ���� ����
			
		}
		
		System.out.println(alpha);
		scan.close();
		
		
		
		
				
					
		}
		

	}


