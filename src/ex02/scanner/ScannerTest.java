//*
package ex02.scanner;

import java.util.Scanner;


public class ScannerTest {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		System.out.print("name = ");
		String name = new Scanner(System.in).nextLine();
		System.out.print("kor, eng, com score = ");
		int kor = new Scanner(System.in).nextInt();
		int eng = new Scanner(System.in).nextInt();
		int com = new Scanner(System.in).nextInt();
		
		int tot = kor + eng + com;
		double avg = tot / 3.0 ;
		
		
		System.out.println("\n\n"+name + "님의 성적표 ****************");
		System.out.println("Kor : " + kor + "\tEng : " + eng + "\tCom : " + com);
		System.out.println("Total : " + tot + "\tAvg : " + avg);
		
	}
}
//*/

/*
package ex02.scanner;

import java.util.Scanner;


public class ScannerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("name = ");
		String name = sc.nextLine();
		System.out.print("kor, eng, com score = ");
//		int kor = sc.nextInt();
//		int eng = sc.nextInt();
//		int com = sc.nextInt();
		
		int tot = sc.nextInt() +sc.nextInt() + sc.nextInt();
		double avg = tot / 3.0 ;
		
		
		System.out.println("\n\n"+name + "님의 성적표 ****************");
//		System.out.println("Kor : " + kor + "\tEng : " + eng + "\tCom : " + com);
		System.out.println("Total : " + tot + "\tAvg : " + avg);
		
	}
}
//*/


/*
package ex02.scanner;

import java.util.Scanner;

// 	문제2] 다음을 입력 받아서 출력하는 프로그램 작성
//  			 이름, 국어, 영어, 전산 점수 입력 받아서  총점, 평균 까지 출력하는 프로그램 작성
//
//  result >
//  이도연님의 성적표 ******************
//  국어 : 100, 영어 : 100, 전산 : 100
//  총점 : 300,  평균 : 100.00



public class ScannerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("kor, name = ");
		System.out.print("kor = ");
		int kor = sc.nextInt();
		System.out.print("name = ");
		String name = sc.nextLine();
		
		
		System.out.println("\n\n"+name + "님의 성적표 ****************");
		System.out.println("Kor : " + kor);
		
	}
}
//*/