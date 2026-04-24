package accessex;
	class Sample{
		public int a;
		private int b;
		int c;	//default 생략
		void sampleE() {
			System.out.println(a);
			//System.out.println(b);
			System.out.println(c);
		}
	}
public class AccessEx {
	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.a = 10;
		//sample.b = 10;	//b가 에러가 나는 이유는 private가 동일 클래스만 접근 가능한 멤버기 때문이다.
		sample.c = 10;
		sample.sampleE();
	}
	
	
}
