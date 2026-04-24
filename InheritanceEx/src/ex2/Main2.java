package ex2;

public class Main2 {
	public static void main(String[] args) {
		Dog2 d = new Dog2();
		Animal2 a = new Animal2();
		//오버라이드 재정의
		d.sound();	//자식의 메서드 수행
		d.move();
		
		a.sound();
		a.move();
		
	}
}
