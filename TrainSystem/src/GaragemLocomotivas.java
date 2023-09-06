import java.util.*;
public class GaragemLocomotivas {
    private static ArrayList<Locomotiva> garagemLocomotiva = new ArrayList<Locomotiva>();

    public static void removeLocomotiva(Locomotiva locomotiva) {
        int count = 0;
        for(Locomotiva X : garagemLocomotiva){
            if(X == locomotiva){
                garagemLocomotiva.remove(count);
            }
            count++;
        }
    }
    
    public static void addLocomotiva(Locomotiva locomotiva) {
        garagemLocomotiva.add(locomotiva);
    }

    //verifica se o id da locomotiva informada existe
    public static boolean verificaIdLocomotiva(int id){
        for(Locomotiva l: garagemLocomotiva){
            if (l.getId() == id){
                return true;
            }
        }
        return false;
    }

    public static Locomotiva getLocomotiva(int idLocomotiva) {
        int index = 0;
        int posicao = 0;
        for(Locomotiva X : garagemLocomotiva){
            if(X.getId() == idLocomotiva){
                posicao = index;   
            }
            index++;
        }
        return garagemLocomotiva.get(posicao);
    }
}
