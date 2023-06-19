package sub2;

public class Account {
	// 속성
	String bank;
	String id;
	String name;
	int balance;

	public Account() {

	}

	public Account(String bank, String id, String name, int balance) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	// 기능
	public void deposit(int money) {
		this.balance += money;
	}

	public void withdraw(int money) {
		this.balance -= money;
	}

	public void show() {
		System.out.println("-------------------------");
		System.out.println("은행명 : " + this.bank);
		System.out.println("계좌번호 : " + this.id);
		System.out.println("입금주 : " + this.name);
		System.out.println("현재잔액 : " + this.balance);
		System.out.println("-------------------------");
	}
}
