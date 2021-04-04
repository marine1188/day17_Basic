//*
package ex01.operator;

public class OperatorTest {
	public static void main(String[] args) {
		// 삼항 연산자 : (조건) ? 참 : 거짓 ;
		
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
		// 논리 연산자 : &, |, ^ ,  2진 논리는 결과 ==> 값,  &&, ||, ! , 10진 논리는 결과 ==> 참/거짓
		int x = 10, y = 20, z = 30;
		boolean flag;
		
		flag = (x > y) && (y > z);  // && 연산은 앞에 것이 '거짓'이면 뒤는 수행 안한다.
		System.out.println("(x > y) && (y > z) = " + flag);
		
		flag = (x < y) && (y < z);
		System.out.println("(x < y) && (y < z) = " + flag);
		
		
		flag = (x > y) || (y > z);  // || 연산은 앞에 것이 '참'이면 뒤는 수행 안한다.
		System.out.println("(x > y) || (y > z) = " + flag);
		
		flag = (x < y) || (y < z);
		System.out.println("(x < y) || (y < z) = " + flag);
		
	}
}
//*/

/*
package ex01.operator;

//import java.lang.*;   // 내부적으로 자동 import 
//import java.lang.System;   // 

public class OperatorTest {
	public static void main(String[] args) {
		// 관계 연산자 : >, < , >=, <= , == (같다), != (같지않다)
		
		int x = 10, y = 20;
		
		if( x != y ) 	// if( x > y )
			System.out.println("같지 않습니다.");
		else
			System.out.println("같다.");
		
		
		String msg = "" ;  // null;
		msg = ( x != y ) ? "같지 않습니다." : "같다." ;
		System.out.println(msg);
	}
}
//*/

/*
package ex01.operator;

public class OperatorTest {
	public static void main(String[] args) {
		// shift 연산자 : << , >> , <<<
		int x = 8, result ;
		
		//result = x << 2;   // left shift : 원래값 * 2 ^ bit수
		result = x >> 3;   
		
		//System.out.println("left shift result : " + result); // 32
		System.out.println("right shift result : " + result); //
		
	}
}
//*/