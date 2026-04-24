package javastart;

public class Var2 {
	
	public static void main(String[] args) {
		final double PI = 3.14;	//final 불변 기호상수에다가 쓰기도 함
		double res1 = PI * 10;
		System.out.println(res1);
		
		
		var x = 5 ;	//var : 자동으로 변수의 타입(형) 결정
		System.out.println(x++ + ++x);
		//왼쪽 x:5->++해서 6->++ 7=> 5+7=12
		System.out.println(2*1500+300+"  hello");
		
		var k = 30.5;
		var y= 12.3f;
		var n= "java";		//초기값이 있기 때문에 var이 변수의 타입을 결정할 수 있다.
		System.out.println(x +" "+ k + " "+y+ " "+n);
	}

}
