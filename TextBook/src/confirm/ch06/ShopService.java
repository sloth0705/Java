package confirm.ch06;

public class ShopService {
	private static ShopService instance = new ShopService();

	private ShopService() {

	}

	public static ShopService getInstance() {
		return instance;
	}
}