//*
package ex01.operator;

public class OperatorTest {
	public static void main(String[] args) {
		// ���� ������ : (����) ? �� : ���� ;
		
		int x = 10, y = 20, z = 30;
		int result; 
		
		result = (x > y) ? x : y;
		System.out.println(result);
		
		
		result = (x > y) ? x : 
									(y > z) ? y : z ;
		
		System.out.println(result);
		
	
	}
}
//*/


/*
package ex01.operator;

public class OperatorTest {
	public static void main(String[] args) {
		// �� ������ : &, |, ^ ,  2�� ���� ��� ==> ��,  &&, ||, ! , 10�� ���� ��� ==> ��/����
		int x = 10, y = 20, z = 30;
		boolean flag;
		
		flag = (x > y) && (y > z);  // && ������ �տ� ���� '����'�̸� �ڴ� ���� ���Ѵ�.
		System.out.println("(x > y) && (y > z) = " + flag);
		
		flag = (x < y) && (y < z);
		System.out.println("(x < y) && (y < z) = " + flag);
		
		
		flag = (x > y) || (y > z);  // || ������ �տ� ���� '��'�̸� �ڴ� ���� ���Ѵ�.
		System.out.println("(x > y) || (y > z) = " + flag);
		
		flag = (x < y) || (y < z);
		System.out.println("(x < y) || (y < z) = " + flag);
		
	}
}
//*/

/*
package ex01.operator;

//import java.lang.*;   // ���������� �ڵ� import 
//import java.lang.System;   // 

public class OperatorTest {
	public static void main(String[] args) {
		// ���� ������ : >, < , >=, <= , == (����), != (�����ʴ�)
		
		int x = 10, y = 20;
		
		if( x != y ) 	// if( x > y )
			System.out.println("���� �ʽ��ϴ�.");
		else
			System.out.println("����.");
		
		
		String msg = "" ;  // null;
		msg = ( x != y ) ? "���� �ʽ��ϴ�." : "����." ;
		System.out.println(msg);
	}
}
//*/

/*
package ex01.operator;

public class OperatorTest {
	public static void main(String[] args) {
		// shift ������ : << , >> , <<<
		int x = 8, result ;
		
		//result = x << 2;   // left shift : ������ * 2 ^ bit��
		result = x >> 3;   
		
		//System.out.println("left shift result : " + result); // 32
		System.out.println("right shift result : " + result); //
		
	}
}
//*/