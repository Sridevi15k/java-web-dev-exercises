package exercises.technology;

public class SmartPhone extends Computer{
    private int numberOfSelfies;
    public SmartPhone(int ram, int storage, boolean hasKeyBoard) {
        super(ram, storage, hasKeyBoard);
        this.numberOfSelfies =  numberOfSelfies;
    }
    public void takeSelfie() {
        this.numberOfSelfies = this.numberOfSelfies + 1;
    }
    public int getNumberOfSelfies() {
        return this.numberOfSelfies;
    }
}
