package sub5;

public class Apple {
	private String country;
	private int price;

	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}

	public void show() {
		System.out.println("-----------------------");
		System.out.println("원산지 : " + this.country);
		System.out.println("가격 : " + this.price);
		System.out.println("-----------------------");
	}

	public void show2() {
		System.out.print("원산지 : " + this.country + " ");
		System.out.print("가격 : " + this.price + "\n");
	}

	@Override
	public String toString() {
		System.out.println("객체 해시값 : " + hashCode());
		System.out.println("country : " + this.country);
		System.out.println("price : " + this.price);
		return super.toString();
	}
}