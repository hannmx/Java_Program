public class Notebook {
    private String brand;
    private String model;
    private String color;
    private double screenSize;
    private String screenTechnology;
    private int ram;
    private int rom;
    private String typeDisk;
    private int sizeDiskSsd;
    private int sizeDiskHdd;

    public Notebook(String brand, String model, String color, double screenSize, String screenTechnology, int ram, int rom, String typeDisk) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.screenSize = screenSize;
        this.screenTechnology = screenTechnology;
        this.ram = ram;
        this.rom = rom;
        this.typeDisk = typeDisk;
    }
    public String printInfo(){
        System.out.printf("Brand: %s, Model: %s, Color: %s, ScreenSize: %s, RAM: %s, ROM: %s, TypeDisk: %s", brand, model, color, screenSize, ram, rom, typeDisk);
        return ".";
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public String getScreenTechnology() {
        return screenTechnology;
    }

    public String getColor() {
        return getColor(null);
    }

    public String getColor(String requestUserForSearch) {
        return color;
    }

    public int getRam() {
        return ram;
    }

    public int getRom() {
        return rom;
    }

    public String getTypeDisk() {
        return typeDisk;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public void setScreenTechnology(String screenTechnology) {
        this.screenTechnology = screenTechnology;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public void setTypeDisk(String typeDisk) {
        this.typeDisk = typeDisk;
    }

}
