package javastart;

class BookMain {  //클래스 = 변수(속성) + 메서드(기능)
//	맴버 변수(필드) : title(책제목, 문자열), author(작가, 문자열)
//	메서드 : show() -> title 과 author 출력
//	생성자 : 1)매개변수 없는 생성자 ( 초기값은 ""로 지정)
//		   2)매개변수 1개(title : author)는 작가 미상
//		   3)매개변수 2개(title, author)는 작가 미상
    
	
//	this는 현재 작동 중인 객체 자신을 가리키는 참조 변수입니다. 주로 매개변수와 멤버 변수의 이름이 같을 때 이를 구분하기 위해 사용
//	this()는 같은 클래스 안에 있는 다른 생성자를 호출할 때 사용하는 특수한 문법입니다. 코드의 중복을 줄이기 위해 사용
//
//	this() 설명
//	① 생성자에서만 사용 가능
//	this();  // 생성자 안에서만 사용 가능
//	② 반드시 첫 줄에 써야 함 *********************
//	Car() {
//	    this("Avante");  // 반드시 첫 줄
//	}
//
//	Car() {
//	    speed = 100;
//	    this("Avante"); // 에러
//	}
//	③ 자기 자신을 계속 호출하면 안됨 (무한루프)
//	Car() {
//	    this(); //  무한 호출 → 컴파일 에러
	
	
	
	String title; 
	String author;

    BookMain() {	//매개변수 없는 생성자
//        title = "";
//        author = "";
    	this("","");  //생성자간의 호출 //2
        System.out.println("기본 생성자 호출");
    }

    BookMain(String title) {	//생성자 호출시 매개변수 title만 가져옴
//        this.title = title;		//왼쪽 title : 맴버변수, 오른쪽 title : 매개변수
//        author = "작가 미상";
    	this(title,"작가 미상");
    }

    BookMain(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void show() {	//메서드 = 함수
        System.out.println("제목 : " + title+", 작가 : " + author);

    }
    //생성자 오버로딩
    //생성자는 클래스 이름과 동일하다.
  
    public static void main(String[] args) {
        BookMain b1 = new BookMain();	//1(생성자 진입)
        BookMain b2 = new BookMain("심청전");	  //
        BookMain b3 = new BookMain("폭풍의 언덕", "에밀리 브론테");
       
        b1.show();
        b2.show();
        b3.show();
    }
}