import java.util.*;
public class Patio {
    private static ArrayList<Trem> trens = new ArrayList<Trem>();

    //verifica se o id do trem informado existe
    public static boolean verificaIdTrem(int id){
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

    public void desfazTrem(int id){
        int count = 0;
        for(Trem t : trens){
            if (t.getId() == id){
                t.desengataTudo();
                trens.remove(count);
                break;
            }
            count++;
        }
    }

    public static Trem getTrem(int idTrem) {
        int index = 0;
        int posicao = 0;
        for(Trem t : trens){
            if(t.getId() == idTrem){
             posicao = index;   
            }
            index++;
        }
        return trens.get(posicao);
    }

    public String toString() {
        String retorno = "     Trens estacionados:\n";
        for(Trem t : trens){
            retorno += "› " + t.toString() + "\n";
        }
        return retorno;
    }
}