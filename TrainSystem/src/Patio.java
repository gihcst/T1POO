import java.util.*;
public class Patio {
    private ArrayList<Trem> trens;
    GaragemLocomotivas gl;
    GaragemVagoes gv;

    public Patio() {
        trens = new ArrayList<Trem>();
        gl = new GaragemLocomotivas();
        gv = new GaragemVagoes();
    }

    //verifica se o id do trem informado existe
    public boolean verificaIdTrem(int id){
        for(Trem t: trens){
            if (t.getId() == id){
                return true;
            }
        }
        return false;
    }

    /*/public Trem criaTrem(int tremId){
        Trem t = new Trem(tremId);
        trens.add(t);
        return t;
    }/*/ 
}