package java_Toys;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Toy {
    private int toyId;
    private String name;
    private int quantity;
    private double weight;

    public Toy(int toyId, String name, int quantity, double weight) {
        this.toyId = toyId;
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
    }

    public int getToyId() {
        return toyId;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void reduceQuantity() {
        quantity--;
    }
}

class ToyStore {
    private List<Toy> toys;
    private List<Toy> prizeToys;

    public ToyStore() {
        toys = new ArrayList<>();
        prizeToys = new ArrayList<>();
    }

    public void addToy(int toyId, String name, int quantity, double weight) {
        Toy toy = new Toy(toyId, name, quantity, weight);
        toys.add(toy);
    }

    public void updateWeight(int toyId, double newWeight) {
        for (Toy toy : toys) {
            if (toy.getToyId() == toyId) {
                toy.setWeight(newWeight);
                break;
            }
        }
    }

    public void drawPrizeToy() {
        double totalWeight = 0.0;
        for (Toy toy : toys) {
            totalWeight += toy.getWeight();
        }

        double randomWeight = Math.random() * totalWeight;
        double cumulativeWeight = 0.0;
        for (Toy toy : toys) {
            cumulativeWeight += toy.getWeight();
            if (randomWeight <= cumulativeWeight) {
                prizeToys.add(toy);
                reduceQuantity(toy);
                break;
            }
        }
    }

    private void reduceQuantity(Toy toy) {
        for (Toy t : toys) {
            if (t.getToyId() == toy.getToyId()) {
                t.reduceQuantity();
                break;
            }
        }
    }

    public Toy getPrizeToy() {
        if (!prizeToys.isEmpty()) {
            Toy toy = prizeToys.remove(0);
            saveToyToFile(toy);
            return toy;
        } else {
            return null;
        }
    }

    private void saveToyToFile(Toy toy) {
        try (FileWriter writer = new FileWriter("D:\\Java Prog\\java_Toys\\prize_toys.txt", true)) {
            writer.write("ID: " + toy.getToyId() + ", Name: " + toy.getName() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}