import java.util.*;
public class Trem {
    private int id;
    private ArrayList<Locomotiva> locomotivas;
    private ArrayList<Vagao> vagoes;
    private boolean vagaoEngatado;  
    private double capacidadeTotalPeso = 0;
    private double capacidadeTotalVagões = 0;

    //criar trem (construtor)
    public Trem(int id, Locomotiva locomotiva){
        this.id = id;
        this.locomotivas = new ArrayList<Locomotiva>();
        this.vagoes = new ArrayList<Vagao>();
        this.locomotivas.add(locomotiva);
    }

    public int getId() {
        return id;
    }

    public int getQuantLocomotiva() {
        return locomotivas.size();
    }

    public int getQuantVagoes() {
        return vagoes.size();
    }

    public Locomotiva getLocomotiva(int idLocomotiva) {
        int index = 0;
        int posicao = 0;
        for(Locomotiva X : locomotivas){
            if(X.getId() == idLocomotiva){
             posicao = index;   
            }
            index++;
        }
        return locomotivas.get(posicao);
    }

    public Vagao getVagao(int idVagao) {
        int index = 0;
        int posicaoB = 0;
        for(Vagao X : vagoes){
            if(X.getId() == idVagao){
             posicaoB = index;   
            }
            index++;
        }
        return vagoes.get(posicaoB);
    }

    public boolean engataVagao(Vagao vagao) {
        vagoes.add(vagao);
        vagaoEngatado = true;
        return true;
    }

    public boolean engataLocomotiva(Locomotiva locomotiva) {
        if (vagaoEngatado == false) {
            locomotivas.add(locomotiva);
            this.capacidadeTotalPeso += locomotiva.getMaxPeso();
            this.capacidadeTotalVagões += locomotiva.getMaxVagoes();
            if(locomotivas.size()>1){
                this.capacidadeTotalPeso = capacidadeTotalPeso * 0.9;
                this.capacidadeTotalVagões = capacidadeTotalVagões * 0.9;
            }
            GaragemLocomotivas.removeLocomotiva(locomotiva);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean desengataLocomotiva(Locomotiva locomotiva) {
        locomotivas.remove(locomotiva);
        return true;
    }

    public boolean desengataVagao(Vagao vagao) {
        vagoes.remove(vagao);
        return true;
    }
}