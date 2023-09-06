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
}
