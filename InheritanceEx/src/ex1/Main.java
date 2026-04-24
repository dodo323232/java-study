package ex1;

public class Main {
	public static void main(String[] args) {
		Dog d = new Dog("강아지",3,"갈색");	// 생성자: 인수를 받아 매개변수에 저장하고, 이를 부모에게 물려받은 필드에 대입함
		//Dog d = new Dog();
		
		//d.name="뽀삐";
		//d.age=2;
		//d.color="검정";
		
		System.out.println(d.name+", "+d.age+", "+d.color);
		
		// 부모(Animal)로부터 상속받은 메서드들을 호출
		d.eat();	// 객체 생성 시 입력된 데이터를 사용해 메서드 실행
		d.sleep();
		
		//자식 클래스 메서드 호출
		d.bark();
		d.run();
		//d.show();
	}
}