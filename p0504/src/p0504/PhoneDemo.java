package p0504;
class Phone{//붕어빵틀 먼저 만든다.(필드가 2개, 동작하는 매서드:print)
	String model;
	int value;
	
	Phone(){//클래스 이름과 동일해야하고, 매게변수 없어야 한다. new실행 하는 순간 이것먼저실행
		model="갤럭시s10";//model 값이 설정되지 않았을때 초기값
		System.out.println("생성자");//new가 세번 했기때문에 3번 반복
	}
	void print(){
		System.out.println(value+"만원짜리 "+model+" 스마트폰 ");
	}
}
public class PhoneDemo {//class name과 동일해야한다.

	public static void main(String[] args) {
		
		Phone p1=new Phone();//틀이름이 폰 이고 처음 구운 붕어빵(객체)->p1
		//p1.model="갤럭시 노트10";
		p1.value=120;
		p1.print();//model과 value값은 내가정해놓은 값이 들어가있음
		
		Phone p2=new Phone();
		p2.model="iPhone8";
		p2.value=100;
		p2.print();
		
		Phone p3=new Phone();//3번째 객체 생성(3번째 붕어빵)
		p3.model="G10";
		p3.value=115;
		p3.print();
	}

}
