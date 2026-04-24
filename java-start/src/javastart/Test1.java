package javastart;

	class Person{
		String name;
		int age;
		
		Person(String name,int age){
			this.name = name;
			this.age = age;
		}
		
		void cheakAdult() {
			
			System.out.println("이름 : "+name);
			System.out.println("나이 : "+age);
			System.out.print("adultcheak : ");
			if(age>=19) {
				System.out.println("성인");
				
			}
			else if(age>=10) {
				System.out.println("청소년");
			}
			else {
				System.out.println("소인");
			}
			
		}
		
	}


public class Test1 {
	public static void main(String[] args) {
		
		Person p = new Person("john",19);
		
		p.cheakAdult();
		
	}
}
