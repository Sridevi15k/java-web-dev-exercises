package exercises.technology;

public class Computer extends AbstractEntity{
    //private String make;
    //private double model;
    //private String category;
    private int ram;
    private int storage;
    private boolean hasKeyBoard;


    public Computer (int ram, int storage, boolean hasKeyBoard) {
        this.ram = ram;
        this.storage = storage;
        this.hasKeyBoard = hasKeyBoard;
    }
    public void increaseRam(int gB) {
        this.ram = ram + gB;
    }
    public void increaseStorage(int bit) {
        this.storage = storage + bit;
    }

    @Override
    public double increaseRam() {
        return 0;
    }
}
