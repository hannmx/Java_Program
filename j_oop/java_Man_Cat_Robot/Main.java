package j_oop.java_Man_Cat_Robot;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        Random random = new Random();
        
        Athletics[] athletes = {
            new Human(random.nextInt(500,3001), random.nextInt(100,301)),
            new Cat(random.nextInt(100,1501), random.nextInt(100,201)),
            new Human(random.nextInt(500,3001), random.nextInt(0,301)),
            new Robot(random.nextInt(500,3001), random.nextInt(0,301)),
            new Cat(random.nextInt(100,1501), random.nextInt(0,201)),
            new Human(random.nextInt(500,3001), random.nextInt(0,301)),
            new Robot(random.nextInt(500,3001), random.nextInt(100,301))
        };

        Cross[] elements = {
            new RunTrack(200),
            new Barrier(50),
            new Barrier(30),
            new RunTrack(1500),
            new Barrier(100)
        };

        for (Athletics athlete : athletes) {
            for (Cross equipment: elements) {
                equipment.cross(athlete);
            }
        }
    }
}
