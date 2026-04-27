package staticex;

class Counter{
	int cnt = 0; //일반 변수 cnt 초기값 설정
	
	void increase() {
		cnt++;	//cnt 1 증가 시켜라
	}
}	//일반 변수는 객체마다 각각의 기억 변수가 생성된다.


public class StaticTest1 {
	public static void main(String[] args) {
		Counter c1 = new Counter();	//c1 객체 생성
		Counter c2 = new Counter();	//c2 객체 생성
		//new Counter()를 실행할 때마다 자바 메모리의 힙(Heap) 영역에는 새로운 객체가 생성됩니다.
		//따라서 c1만의 전용 cnt, c2만의 전용 cnt가 있는것.
		c1.increase();	//c1의 메서드 불러오기  cnt = 1
		c2.increase();	//c2의 메서드 불러오기	cnt가 0이되서 다시 1이 된다
		
		System.out.println("c1: "+c1.cnt);	//1출력
		System.out.println("c2: "+c2.cnt);	//1출력
	}
}