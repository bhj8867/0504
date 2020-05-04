package p0504;//메인이 없는 클래스 호출해서 불려지는 클래스 ,같은 패키지 안에 있어야한다.패키지이름이 다를때는 메인 에가서public(모두접근가능)을 입력해야한다.

class Student1{//이전에 한번 선언된 이름이라 이름을 바꾸어 주어야한다. 메인 체크 해제 후 클래스 만들기 
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
