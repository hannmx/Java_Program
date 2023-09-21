import java.util.ArrayList;
import java.util.Scanner;

class Animal {
    private String name;
    private String classType;
    private ArrayList<String> commands = new ArrayList<>();

    public Animal(String name, String classType) {
        this.name = name;
        this.classType = classType;
    }

    public void addCommand(String command) {
        commands.add(command);
    }

    public void showCommands() {
        System.out.println(name + " can perform the following commands:");
        for (String command : commands) {
            System.out.println(command);
        }
    }

    public String getClassType() {
        return classType;
    }

    public String getName() {
        return name;
    }
}

class Counter implements AutoCloseable {
    private int count = 0;

    public void add() {
        count++;
    }

    @Override
    public void close() throws Exception {
        if (count > 0) {
            throw new Exception("Resource was not closed.");
        }
    }
}

public class Program {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        try (Counter counter = new Counter(); Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Menu:");
                System.out.println("1. Add a new animal");
                System.out.println("2. Determine the animal's correct class");
                System.out.println("3. See the list of commands the animal can perform");
                System.out.println("4. Teach the animal new commands");
                System.out.println("5. Exit");
                System.out.print("Select an action (1/2/3/4/5): ");
                String choice = scanner.nextLine();

                if (choice.equals("1")) {
                    try {
                        System.out.print("Enter the animal's name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter the animal's class (domestic/herding): ");
                        String classType = scanner.nextLine();
                        Animal newAnimal = new Animal(name, classType);
                        animals.add(newAnimal);
                        counter.add();
                        System.out.println("Animal added successfully.");
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                } else if (choice.equals("2")) {
                    if (animals.isEmpty()) {
                        System.out.println("No registered animals.");
                    } else {
                        for (Animal animal : animals) {
                            System.out.println(animal.getName() + " - " + animal.getClassType());
                        }
                    }
                } else if (choice.equals("3")) {
                    if (animals.isEmpty()) {
                        System.out.println("No registered animals.");
                    } else {
                        System.out.print("Enter the animal's name to see its commands: ");
                        String animalName = scanner.nextLine();
                        boolean found = false;
                        for (Animal animal : animals) {
                            if (animal.getName().equals(animalName)) {
                                animal.showCommands();
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Animal with that name not found.");
                        }
                    }
                } else if (choice.equals("4")) {
                    if (animals.isEmpty()) {
                        System.out.println("No registered animals.");
                    } else {
                        System.out.print("Enter the name of the animal to teach: ");
                        String animalName = scanner.nextLine();
                        boolean found = false;
                        for (Animal animal : animals) {
                            if (animal.getName().equals(animalName)) {
                                System.out.print("Enter a new command for the animal: ");
                                String newCommand = scanner.nextLine();
                                animal.addCommand(newCommand);
                                System.out.println("Command added successfully.");
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Animal with that name not found.");
                        }
                    }
                } else if (choice.equals("5")) {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
