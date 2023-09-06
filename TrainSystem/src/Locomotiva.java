public class Locomotiva {
    private int id;
    private double maxPeso;
    private int maxVagoes;
    private int idTrem;
    
    public Locomotiva(int id, double maxPeso, int maxVagoes) {
        this.id = id;
        this.maxPeso = maxPeso;
        this.maxVagoes = maxVagoes;
        this.idTrem = 0;
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
    
    public int getIdTrem() {
        return idTrem;
    }

    public void setIdTrem(int IdTrem) {
        this.idTrem = IdTrem;
    }

    public String toString() {
        return "Locomotiva [ID = " + id + ", Capacidade = " + maxPeso + ", Máximo de Vagões = " + maxVagoes + "]";
    }
}
