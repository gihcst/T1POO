public class Locomotiva {
    private int id;
    private double peso;
    private int maxVagoes;
    private boolean comp;
    
    public Locomotiva(int id, double peso, int maxVagoes, boolean comp) {
        this.id = id;
        this.peso = peso;
        this.maxVagoes = maxVagoes;
        this.comp = comp;
    }
    
    public int getId() {
        return id;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public int getMaxVagoes() {
        return maxVagoes;
    }
    
    public boolean isComp() {
        return comp;
    }
}
