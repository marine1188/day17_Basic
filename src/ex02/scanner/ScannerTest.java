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
		
		
		System.out.println("\n\n"+name + "���� ����ǥ ****************");
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
		
		
		System.out.println("\n\n"+name + "���� ����ǥ ****************");
//		System.out.println("Kor : " + kor + "\tEng : " + eng + "\tCom : " + com);
		System.out.println("Total : " + tot + "\tAvg : " + avg);
		
	}
}
//*/


/*
package ex02.scanner;

import java.util.Scanner;

// 	����2] ������ �Է� �޾Ƽ� ����ϴ� ���α׷� �ۼ�
//  			 �̸�, ����, ����, ���� ���� �Է� �޾Ƽ�  ����, ��� ���� ����ϴ� ���α׷� �ۼ�
//
//  result >
//  �̵������� ����ǥ ******************
//  ���� : 100, ���� : 100, ���� : 100
//  ���� : 300,  ��� : 100.00



public class ScannerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("kor, name = ");
		System.out.print("kor = ");
		int kor = sc.nextInt();
		System.out.print("name = ");
		String name = sc.nextLine();
		
		
		System.out.println("\n\n"+name + "���� ����ǥ ****************");
		System.out.println("Kor : " + kor);
		
	}
}
//*/