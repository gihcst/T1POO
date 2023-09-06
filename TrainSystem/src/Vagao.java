public class Vagao {
    private int id;
    private double capacidade;
    private int composicao = 0;

    public Vagao(int id, double capacidade) {
        this.id = id;
        this.capacidade = capacidade;
    }

    public int getId() {
        return id;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public int getComposicao() {
        return composicao;
    }

    public void setComposicao(int composicao) {
        this.composicao = composicao;
    }
}
