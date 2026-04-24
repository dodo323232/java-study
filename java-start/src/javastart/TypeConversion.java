package javastart;

public class TypeConversion {
	public static void main(String[] args) {
		byte b = 127; //1바이트
		int i = 100;
		System.out.println(b+i);	//b가 int 타입으로 자동 변환
		System.out.println(10/4);	//2 정수끼리 연산하면 정수가 나옴
		System.out.println(10.0/4);	//4가 4.0으로 자동 변환(실수 변환)  2.5
		System.out.println((byte)(b+i));	//227 -> -29
		//1바이트는 8비트 -128 ~127
		//4바이트 -> 1바이트 오버플로우 발생 -> 원하지 않은 답이 나옴
		System.out.println((int)(2.9 +1.8));//소수이하 버림
		System.out.println((int)2.9 + (int)1.8); //3
		System.out.println((double)10 / 4);
		//10 -> 실수10.0  10.0/4 -> 실수/정수 -> 4=4.0
		int a= 10;
		double result = a + 3.5; //13.5
		System.out.println(result);
	}
}
