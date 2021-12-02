package zookeeper;

public class Gorilla extends Mammal {
	
	public Gorilla() {}
	
	public Gorilla throwSomething(String object) {
		System.out.println("The Gorilla throws a " + object);
		energyLevel -= 5;
		System.out.println("Energy Level = " + energyLevel);
		return this;
	}
	
	public Gorilla eatBananas() {
		System.out.println("The Gorilla sits back -- dang that banana was good");
		energyLevel += 10;
		System.out.println("Energy Level = " + energyLevel);
		return this;
	}
	
	public Gorilla climb() {
		System.out.println("The Gorilla climbs a tree");
		energyLevel -= 10;
		System.out.println("Energy Level = " + energyLevel);
		return this;
	}
	
	
}
