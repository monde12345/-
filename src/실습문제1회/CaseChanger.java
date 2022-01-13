package 실습문제1회;

import java.util.Scanner;

public class CaseChanger {
	public static void main(String[] args) {
		//준비 단계
		char alpha;
		
		//입력 단계
		System.out.print("문자 한 자를 입력하세요>>> ");
		Scanner scan = new Scanner(System.in); //시스템 인 일 때 스캔 클로우즈 해주어야한다. 자원을 되돌린다.
		
		/*
		 * 'A' =>65 이거는 문자
		 * "A"  => "A/0" 문자열이다. 두 문자만 있는 것 이다.
		 */
				
		alpha =scan.next().charAt(0);                  //메소드가 중첩 됐다.
	      
		if(alpha >= 'a' && alpha <= 'z')  { //&& AND 연산자, ㅣㅣor 연산자
			//좌변  = 우변;
			alpha = (char) (alpha -32); //형이 변화 되는 것을 강제형 변화이다. 캐스팅 연산자 단항연산자
		}
		
		else if (alpha >= 'A' && alpha <= 'Z')  { //&& AND 연산자, ㅣㅣor 연산자
				//좌변  = 우변;
			alpha = (char) (alpha +32);
		}else {//한글이 입력된 경우
			System.out.println("영문자가 아닙니다.");
			System.exit(0); //프로그램 정상 종료
			
		}
		
		System.out.println(alpha);
		scan.close();
		
		
		
		
				
					
		}
		

	}


