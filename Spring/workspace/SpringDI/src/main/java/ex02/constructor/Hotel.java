package ex02.constructor;

public class Hotel {

	private Chef chef;
	
	//호텔은 생성될때 쉐프객체를 받는다 (hotel은 chef에 의존적이다)
	public Hotel(Chef chef) {
		this.chef = chef;
	}
	
	public Chef getChef() {
		return chef;
	}
	
	
}
