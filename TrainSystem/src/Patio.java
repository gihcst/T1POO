import java.util.*;
public class Patio {
    private static ArrayList<Trem> trens = new ArrayList<Trem>();

    public static void addTrem(Trem trem) {
        trens.add(trem);
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

    public Trem criaTrem(int tremId, Locomotiva locomotiva){
        Trem t = new Trem(tremId, locomotiva);
        trens.add(t);
        return t;
    } 
}