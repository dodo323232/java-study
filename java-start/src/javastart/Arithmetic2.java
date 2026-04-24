package javastart;

public class Arithmetic2 {

	public static void main(String[] args) {
		int i = 20;
		double j = 10.5;
		double res1 = sum(i,10);
		double res2 = sum(i,j);
		System.out.println(res1);
		System.out.println(res2);
	}
	
	public static int sum(int a, int b) {
		return a+b;
	}
	public static double sum(double a, double b) {
		return a+b;
	}
	
}
//메서드 오버로딩
//-> 같은 이름의 메서드를 생성하는 것
//-> 매개변수의 타입 (형)과 개수, 순서가 다를때 생성한다

//int sum(int a, int b) 
//double sum(double x,double y)	-> 오버로딩 가능
//
//int sum(int a, int b) 
//double sum(int x,int y,int z)	가능
//
//int sum(int a, double b) 
//double sum(double x,int y)	가능
//
//int sum(int a, int b) 
//double sum(int x,int y)	오류