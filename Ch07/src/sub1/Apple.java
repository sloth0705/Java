package sub1;

public class Apple {
	private String country;
	private int price;

	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}

	@Override
	public String toString() {
		System.out.println("객체 해시값 : " + hashCode());
		System.out.println("country : " + this.country);
		System.out.println("price : " + this.price);
		return super.toString();
	}
}