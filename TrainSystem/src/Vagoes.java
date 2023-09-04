public class Vagoes {
    private int id;
    private double capacity;
    private boolean comp;

    public Vagoes(int id, double capacity, boolean comp) {
        this.id = id;
        this.capacity = capacity;
        this.comp = comp;
    }

    public int getId() {
        return id;
    }

    public double getCapacity() {
        return capacity;
    }

    public boolean isComp() {
        return comp;
    }
}
