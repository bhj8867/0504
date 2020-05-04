package p0504;//속성 학번 이름 주소 객체 5개 생성하여 출력 


public class StudentDemo {
	public static void main(String[] args) {
		Student1 s1=new Student1();
		s1.setHakbun(11);
		s1.setName("홍길동");
		s1.setAddress("부산 동래구");
		s1.print();
		
		Student1 s2=new Student1();
		s2.setHakbun(22);
		s2.setName("이순신");
		s2.setAddress("부산 사하구");
		s2.print();
		
		Student1 s3=new Student1();
		s3.setHakbun(33);
		s3.setName("강감찬");
		s3.setAddress("부산 연제구");
		s3.print();
		
		Student1 s4=new Student1();
		s4.setHakbun(44);
		s4.setName("홍길순");
		s4.setAddress("부산 금정구");
		s4.print();
		
		Student1 s5=new Student1();
		s5.setHakbun(55);
		s5.setName("백승현");
		s5.setAddress("부산 사상구");
		s5.print();
	
	}

}
