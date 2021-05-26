package exercises.technology;

public class Laptop extends Computer{
    private double weight;

    public Laptop(int ram, int storage, boolean hasKeyBoard) {
        super(ram, storage, hasKeyBoard);
        this.weight = weight;
    }
        public Laptop(double weight) {
            this.weight = weight;
        }

        public boolean isClunky() {
            if (weight > 5.0) {
                return true;
            }
            else {
                return false;


        }
    }
}
