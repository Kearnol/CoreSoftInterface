package zookeeper;

public class Bat extends Mammal{
	int energyLevel = 300;
	
	
	public Bat fly() {
		System.out.println("Scrawwww-flap-flap-flap");
		energyLevel -= 50;
		System.out.println("EnergLevel: " + energyLevel);
		return this;
	}
	public Bat eatHumans() {
		System.out.println("Nom-nom-nom, Yummy Hamns **sounds of bones cracking**");
		energyLevel += 25;
		System.out.println("EnergLevel: " + energyLevel);
		return this;
	}
	public Bat attackTown() {
		System.out.println("**Ambient screems, sirens, and the unusually loud crackle and pops of wood homes on fire**");
		energyLevel -= 100;
		System.out.println("EnergLevel: " + energyLevel);
		return this;
	}
	
}
