package �ǽ�����1ȸ;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		//�غ� �ܰ� => ���� ����, �迭 ���� => �����͸� ������ �׸� (�޸��� ���� ����)�� ����
		int[] arrMoney = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
		String[] str = {"��������", "������","��õ����", "õ����",
						"�����","���","���ʿ�","�ʿ�","�Ͽ�"};
		int[] result = new int [9]; //�̷��� �迭�� �����ϸ� �ڵ����� 0���� ä���.
		
		//�Է� �ܰ�
		System.out.println("�ݾ��� �Է��ϼ���.>>> ");
		Scanner scan = new Scanner(System.in);
		int Money = scan.nextInt();//���ڿ��� ������ ��ȯ�ϴ� �ؽ�Ʈ����
		
		
		//ó���ܰ� =>�ΰ��� ������ ���(logic) => ����� �� ���� ��Ű�� �� =>����ġ
		//[��] �Է��� �ݾ��� => 65750
		for(int i=0; i<arrMoney.length; i++) {//�迭�� for���̴�./ length.�� ���̷� ���Ѵ�.//�Ϲ� for���� ����
			int num = Money / arrMoney[i];
		
			//������ �ݾ� => 15750
			int remainder = Money % arrMoney[i]; //������ �� ���ϱ�
			Money = remainder;
			
			if(num > 0 && i<4) {
		System.out.println(str[i] + " " + num + "��");
		
		}else if(num > 0 && i >=4) {
			System.out.println(str[i] + " " + num + "����");
			
		}
			
		}
	}

}
