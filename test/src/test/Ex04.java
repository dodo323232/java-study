package test;

class Car{//설계도 class
	String model; //맴버변수(필드) -> 속성
	int speed;
	
	//생성자(매개변수 2개)
	Car(String model, int speed){
		this.model = model;
		this.speed = speed;
	}
	//메서드 -> 기능, 행위
	void print() {
		System.out.println("모델명 : "+model);
		System.out.println("속도 : "+speed);
	}
	
}

public class Ex04 {
	public static void main(String[] args) {
		Car c = new Car("sonata",100);
		Car c2 = new Car("avante",120);
		
		c.print();
		c2.print();
	}
}
