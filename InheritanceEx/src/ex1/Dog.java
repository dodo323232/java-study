package ex1;
//자식 클래스
public class Dog extends Animal{
	public Dog(String name,int age, String color) {
		this.name = name;
		this.age =age;
		this.color = color;
	}
	public void bark(){
		System.out.println(name+"은 멍멍 짖습니다.");
	}
	public void run(){
		System.out.println(name+"은 잘 달립니다.");
	}
}
