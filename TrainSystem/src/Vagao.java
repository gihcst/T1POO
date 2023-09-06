public class Vagao {
    private int id;
    private double capacidade;
    private int idTrem;

    public Vagao(int id, double capacidade) {
        this.id = id;
        this.capacidade = capacidade;
        this.idTrem = 0;
    }

    public int getId() {
        return id;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public int getIdTrem() {
        return idTrem;
    }

    public void setIdTrem(int idTrem) {
        this.idTrem = idTrem;
    }

    public String toString() {
        return "Vagão [ID = " + id + "Capacidade = " + capacidade + "]";
    }
}
