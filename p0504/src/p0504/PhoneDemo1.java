package p0504;//set get이용하여 
class Phone1{//Phone이라는 클래스 중복되므로 새로운 이름
	String model;
	int value;
	public String getModel() {//Source-public get set 자동으로 만들어줌 
		return model;
	}
	public void setModel(String model) {
		this.model = model;//갤럭시s10 이 넘어옴,class의 String과 setModel의 String일 같아서 this.붙여준다.
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	void print(){
		System.out.println(value+"만원짜리 "+model+" 스마트폰 ");
	}
}
public class PhoneDemo1 {

	public static void main(String[] args) {
		
		Phone1 p1=new Phone1();
		p1.setModel("갤럭시s10");
		p1.setValue(120);
		p1.print();
		
		String mo=p1.getModel();//값을 가져온다.
		System.out.println("model : "+mo);
		int va=p1.getValue();
		System.out.println("vlaue : "+va);

	}

}
