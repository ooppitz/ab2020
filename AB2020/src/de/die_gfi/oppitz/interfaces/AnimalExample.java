package de.die_gfi.oppitz.interfaces;

public class AnimalExample {

	public static void main(String[] args) {

		Animal animal;
		
		Dog bello = new Dog("Bello", 15, 50, "braun");
		bello.sound();
		
		animal = bello;
		animal.sound();
		
		Bird tweety = new Bird("Tweety", 0, 15, "gelb");
		tweety.sound();
		
		Lion lionking = new Lion("Simba", 1, 50, "hellbraun");
		lionking.sound();
	}

}

abstract class Animal {

	String name;
	int weight;
	int size;
	String color;

	public Animal() {

	}

	public Animal(String name, int weight, int size, String color) {

		this.name = name;
		this.weight = weight;
		this.size = size;
		this.color = color;

	}

	@Override
	public String toString() {
		return "Das Tier heisst " + name + " und ist " + size + " cm groß, wiegt " + weight + " kg und hat die Farbe " + color;
	}

	abstract void sound();

}

class Dog extends Animal {

	public Dog(String name, int weight, int size, String color)  {
		super(name, weight, size, color);
	}
	
	void sound() {

		System.out.println("Wuffff!!!");
	}
}

class Bird extends Animal {

	public Bird(String name, int weight, int size, String color)  {
		super(name, weight, size, color);
	}
	
	void sound() {

		System.out.println("Chirp!!!");
	}

}

class Lion extends Animal {
	
	public Lion(String name, int weight, int size, String color)  {
		super(name, weight, size, color);
	}

	@Override
	void sound() {

		System.out.println("Roaaar!!");
	}
	
	
	
}
