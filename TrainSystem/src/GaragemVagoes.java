import java.util.*;
public class GaragemVagoes {
    private static ArrayList<Vagao> garagemVagoes = new ArrayList<Vagao>();

    public static void removeVagao(Vagao vagao) {
        int index = 0;
        for(Vagao X : garagemVagoes){
            if(X == vagao){
                garagemVagoes.remove(index);
            }
            index++;
        }
    }
    
    public static void addVagao(Vagao vagao) {
        garagemVagoes.add(vagao);
    }

    //verifica se o id do vagão informado existe
    public boolean verificaIdVagao(int id){
        for(Vagao v: garagemVagoes){
            if (v.getId() == id){
                return true;
            }
        }
        return false;
    }

    public Vagao getVagao(int idVagao) {
        int index = 0;
        int posicaoB = 0;
        for(Vagao X : garagemVagoes){
            if(X.getId() == idVagao){
             posicaoB = index;   
            }
            index++;
        }
        return garagemVagoes.get(posicaoB);
    }
}
