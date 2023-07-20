package test7;

/*
 * 날짜 : 2023/07/20
 * 이름 : 신진성 
 * 내용 : 자바 총정리 연습문제
 */
interface IRunnalble {
	public void run();
}

interface IFlyable {
	public void fly();
}

class FlyingCar implements IRunnalble, IFlyable {
	@Override
	public void fly() {
		System.out.println("Car fly!");
	}

	@Override
	public void run() {
		System.out.println("Car run!");
	}
}

public class Test08 {
	public static void main(String[] args) {
		FlyingCar car = new FlyingCar();
		car.run();
		car.fly();
	}
}