package p0504;//속성 학번 이름 주소 객체 5개 생성하여 출력 
class Student{//메인 위에 class선언한다 
	int hakbun;
	String name;
	String address;
	
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	void print(){
		System.out.println("*학번 :"+hakbun +"  *이름 :"+ name + " *주소 :"+address);
	}
}//Student class 끝

public class E01 {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setHakbun(11);
		s1.setName("홍길동");
		s1.setAddress("부산 동래구");
		s1.print();
		
		Student s2=new Student();
		s2.setHakbun(22);
		s2.setName("이순신");
		s2.setAddress("부산 사하구");
		s2.print();
		
		Student s3=new Student();
		s3.setHakbun(33);
		s3.setName("강감찬");
		s3.setAddress("부산 연제구");
		s3.print();
		
		Student s4=new Student();
		s4.setHakbun(44);
		s4.setName("홍길순");
		s4.setAddress("부산 금정구");
		s4.print();
		
		Student s5=new Student();
		s5.setHakbun(55);
		s5.setName("백승현");
		s5.setAddress("부산 사상구");
		s5.print();
	
	}

}
