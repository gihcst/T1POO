import java.util.*;
public class GaragemLocomotivas {
    private static ArrayList<Locomotiva> garagemLocomotiva = new ArrayList<Locomotiva>();

    public static void removeLocomotiva(Locomotiva locomotiva) {
        int index = 0;
        for(Locomotiva X : garagemLocomotiva){
            if(X == locomotiva){
                garagemLocomotiva.remove(index);
            }
            index++;
        }
    }
    
    public static void addLocomotiva(Locomotiva locomotiva) {
        garagemLocomotiva.add(locomotiva);
    }
}
