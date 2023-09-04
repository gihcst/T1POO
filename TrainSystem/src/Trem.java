import java.util.*;
public class Trem {
    private int id;
    private int QuantLocomotiva;
    private int QuantVagoes;
    private ArrayList<Locomotiva> locomotivas;
    private ArrayList<Vagao> vagoes;
    private boolean vagaoEngatado;  
    private int posicao;

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

    public Locomotiva getLocomotiva(int posicao) {
        return locomotivas.get(posicao);
    }

    public Vagao getVagao(int posicao) {
        return vagoes.get(posicao);
    }

    public boolean engataVagao(Vagao vagao) {
        vagoes.add(vagao);
        vagaoEngatado = true;
        return true;
    }

    public boolean engataLocomotiva(Locomotiva locomotiva) {
        if (vagaoEngatado == false) {
            locomotivas.add(locomotiva);
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