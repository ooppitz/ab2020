package de.die_gfi.jonathan.shop;

public class App {

	public static void main(String[] args) {

		Shop s = new Shop();

		Demo demo = new Demo(s.storage, s.users);
		demo.demo();

		s.userInterface();
	}
}
