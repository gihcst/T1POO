import java.util.*;
public class Trem {
    private int id;
    private ArrayList<Locomotiva> locomotivas;
    private ArrayList<Vagao> vagoes;
    private boolean vagaoEngatado;  

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