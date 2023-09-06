public class Locomotiva {
    private int id;
    private double maxPeso;
    private int maxVagoes;
    private int composicao;
    
    public Locomotiva(int id, double maxPeso, int maxVagoes, int composicao) {
        this.id = id;
        this.maxPeso = maxPeso;
        this.maxVagoes = maxVagoes;
        this.composicao = composicao;
    }
    
    public int getId() {
        return id;
    }
    
    public double getMaxPeso() {
        return maxPeso;
    }
    
    public int getMaxVagoes() {
        return maxVagoes;
    }
    
    public int getComposicao() {
        return composicao;
    }

    public void setComposicao(int composicao) {
        this.composicao = composicao;
    }
}
