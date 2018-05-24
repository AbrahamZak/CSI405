package zoo;

import java.util.ArrayList;
import java.util.Scanner;

//Zoo class, holds an arraylist of animals and contains a name
public class Zoo {
	ArrayList<Animal> list = new ArrayList<Animal>();
	private String name; 
	
public Zoo(ArrayList<Animal> animalList, String name) {
	this.list = animalList;
	this.name = name;
}

//Method to view all animals
public void viewAll() {
	for (Animal a : list) {
		System.out.println(a);
	}
}

/*Method to view all animals that are poisonous
 * Because only amphibians and reptiles have this feature we only check them
 * If we find a reptile or a amphibian we create a new temperary object and cast
 * the animal back to its original type to check if its poisonous
 */
public void poison() {
	for (Animal a : list) {
		if (a.getType() == AnimalType.Amphibian) {
			Amphibian amp = (Amphibian) a;
			if (amp.getPoison() == true) {
				System.out.println(amp);
			}
			
		}
		else if (a.getType() == AnimalType.Reptile) {
			Reptile rep = (Reptile) a;
			if (rep.getPoison() == true) {
				System.out.println(rep);
			}
			
		}
	}
}

//Main zoo method, allows us to see various types of animals and their info
public void runZoo() {
	//Create our scanner for user input
	Scanner reader = new Scanner(System.in); 
	System.out.println("Welcome to the " + this.name + ".");
	//List of commands to see various functionality
	while (true) {
		System.out.println("What would you like to do?");
		System.out.println("1. View all animals");
		System.out.println("2. View animals that are poisonous");
		System.out.println("3. Add a new fish to the zoo");
		System.out.println("4. Feed the animals");
		System.out.println("5. Go home");
		System.out.println("Enter a number: ");
		int n = reader.nextInt(); // Scans the next token of the input as an int.
		//once finished
		switch (n) {
        case 1:  this.viewAll();
        break;
        case 2:  this.poison();
        break;
        case 3:  this.addFish(reader);
        break;
        case 4:  this.feed(reader);
        break;
        //If option 5, break the loop and end the program
        case 5:  System.out.println("Thank you for visiting the " + this.name + "."); 
        break;
        default: System.out.println("Invalid option");
        break;
                 
	}
	//Close the reader and end the loop
		if (n==5) {
	reader.close();
	break;
		}
}

}
//Method to feed the animals, allows user to choose what type of animal to feed
private void feed(Scanner reader) {
	reader.nextLine();
	System.out.println("Which type of animal would you like to feed?");
	System.out.println("1. Amphibians");
	System.out.println("2. Birds");
	System.out.println("3. Fish");
	System.out.println("4. Mammals");
	System.out.println("5. Reptiles");
	int n = reader.nextInt(); // Scans the next token of the input as an int.
	//once finished
	switch (n) {
    case 1:  for (Animal a : list) {
		if (a.getType() == AnimalType.Amphibian) {
			System.out.println("Fed " + a.getName() + " some insects.");
		}
    }
    break;
    case 2:  for (Animal a : list) {
		if (a.getType() == AnimalType.Bird) {
			System.out.println("Fed " + a.getName() + " some seeds.");
		}
    }
    break;
    case 3:  for (Animal a : list) {
		if (a.getType() == AnimalType.Fish) {
			System.out.println("Fed " + a.getName() + " some fish food.");
		}
    }
    break;
    case 4:  for (Animal a : list) {
		if (a.getType() == AnimalType.Mammal) {
			System.out.println("Fed " + a.getName() + ".");
		}
    }
    break;
    case 5:  for (Animal a : list) {
		if (a.getType() == AnimalType.Reptile) {
			System.out.println("Fed " + a.getName() + " some smaller animals.");
		}
    }
    break;
    default: System.out.println("Invalid option");
    break;
	}
}

//Method to add a fish to the zoo by user inputed traits
private void addFish(Scanner reader) {
	reader.nextLine();
	System.out.println("What is the name of this fish?");
	String name = reader.nextLine();
	System.out.println("What is the weight of this fish?");
	double weight = reader.nextDouble();
	reader.nextLine();
	System.out.println("What is the color of this fish?");
	String color = reader.nextLine();
	System.out.println("What is the binomial name of this fish?");
	String binomial = reader.nextLine();
	System.out.println("Does this fish have teeth? y/n");
	String teeth = reader.nextLine();
	Boolean teethB = false;
	if (teeth.equals("y")) {
		teethB=true;
	}
	System.out.println("Does this fish have scales? y/n");
	String scales = reader.nextLine();
	Boolean scalesB = false;
	if (scales.equals("y")) {
		scalesB=true;
	}
	Fish newFish = new Fish (name, weight, color, binomial, teethB, scalesB);
	System.out.println("Successfully added:" + newFish.getName());
	System.out.println(newFish);
	list.add(newFish);
}
}
