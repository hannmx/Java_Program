package j_oop.java_Man_Cat_Robot;

public class Barrier implements Cross {

    private final int height;

    public Barrier(int height) {
        this.height = height;
    }

    @Override
    public void cross(Athletics athlete) {
        athlete.jump(height);
    }
}