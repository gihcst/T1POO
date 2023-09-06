public class Locomotiva {
    private int id;
    private double maxPeso;
    private int maxVagoes;
    private boolean comp;
    
    public Locomotiva(int id, double maxPeso, int maxVagoes, boolean comp) {
        this.id = id;
        this.maxPeso = maxPeso;
        this.maxVagoes = maxVagoes;
        this.comp = comp;
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
    
    public boolean isComp() {
        return comp;
    }
}
