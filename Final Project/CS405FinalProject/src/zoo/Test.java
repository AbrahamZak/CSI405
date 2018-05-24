package zoo;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		//Create some animals
		Bird Penguin = new Bird ("Emperor Penguin", 35, "black, white, and yellow", "Aptenodytes forsteri", false);
		Amphibian Frog = new Amphibian ("Golden Poison Frog", .03, "yellow", "Phyllobates terribilis", true);
		Reptile Snake = new Reptile ("Boa constrictor", 12.25, "brown and red", "Boa constrictor", true, false);
		Fish Shark = new Fish ("Whale Shark", 18597.28, "blue and grey", "Rhincodon typus", true, false);
		Mammal Tiger = new Mammal ("White Tiger", 230, "white and black", "Panthera tigris tigris", "carnivorous", true);
		
		//Add the animals to an array list
		ArrayList<Animal> list = new ArrayList<Animal>();
		list.add(Tiger);
		list.add(Snake);
		list.add(Frog);
		list.add(Penguin);
		list.add(Shark);
		
		//Create a zoo and add our list of animals to it, then "run" the zoo
		Zoo ZooTest = new Zoo (list, "Bronx Zoo");
		ZooTest.runZoo();
		
	}

}
