package 실습문제1회;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		//준비 단계 => 변수 선언, 배열 선언 => 데이터를 저장할 그릇 (메모리의 저장 공간)을 마련
		int[] arrMoney = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
		String[] str = {"오만원권", "만원권","오천원권", "천원권",
						"오백원","백원","오십원","십원","일원"};
		int[] result = new int [9]; //이렇게 배열을 생성하면 자동으로 0으로 채운다.
		
		//입력 단계
		System.out.println("금액을 입력하세요.>>> ");
		Scanner scan = new Scanner(System.in);
		int Money = scan.nextInt();//문자열을 정수로 변환하는 넥스트라인
		
		
		//처리단계 =>인간의 논리적인 사고(logic) => 제어문을 잘 조합 시키는 것 =>경험치
		//[예] 입력한 금액이 => 65750
		for(int i=0; i<arrMoney.length; i++) {//배열은 for문이다./ length.는 길이로 뜻한다.//일반 for문의 문법
			int num = Money / arrMoney[i];
		
			//나머지 금액 => 15750
			int remainder = Money % arrMoney[i]; //나머지 값 구하기
			Money = remainder;
			
			if(num > 0 && i<4) {
		System.out.println(str[i] + " " + num + "매");
		
		}else if(num > 0 && i >=4) {
			System.out.println(str[i] + " " + num + "동전");
			
		}
			
		}
	}

}
