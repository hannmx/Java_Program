package j_oop.java_Man_Cat_Robot;

public class RunTrack implements Cross {

    private final int length;

    public RunTrack(int length) {
        this.length = length;
    }

    @Override
    public void cross(Athletics athlete) {
        athlete.run(length);
    }
}
